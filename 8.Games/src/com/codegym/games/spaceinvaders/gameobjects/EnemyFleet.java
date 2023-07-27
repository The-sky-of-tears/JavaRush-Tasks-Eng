package com.codegym.games.spaceinvaders.gameobjects;

import com.codegym.engine.cell.Game;
import com.codegym.games.spaceinvaders.Direction;
import com.codegym.games.spaceinvaders.ShapeMatrix;
import com.codegym.games.spaceinvaders.SpaceInvadersGame;
import com.codegym.games.spaceinvaders.gameobjects.bullets.Bullet;
import com.codegym.games.spaceinvaders.gameobjects.ships.Boss;
import com.codegym.games.spaceinvaders.gameobjects.ships.EnemyShip;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EnemyFleet {
    private static final int ROWS_COUNT = 3;
    private static final int COLUMNS_COUNT = 20;
    private static final int STEP = ShapeMatrix.ENEMY.length + 1;
    private List<EnemyShip> ships;
    private Direction direction = Direction.RIGHT;

    public EnemyFleet() {
        createShips();
    }

    public void draw(Game game) {
        ships.forEach(ship -> ship.draw(game));
    }

    public void move() {
        if (ships.isEmpty()) {
            return;
        }

        if (direction == Direction.LEFT && getLeftBorder() < 0) {
            direction = Direction.RIGHT;
            ships.forEach(ship -> ship.move(Direction.DOWN, getSpeed()));
        }

        if (direction == Direction.RIGHT && getRightBorder() > SpaceInvadersGame.WIDTH) {
            direction = Direction.LEFT;
            ships.forEach(ship -> ship.move(Direction.DOWN, getSpeed()));
        }

        ships.forEach(ship -> ship.move(direction, getSpeed()));
    }

    public Bullet fire(Game game) {
        if (ships.size() == 0) {
            return null;
        }

        int shootProbability = game.getRandomNumber(100 / SpaceInvadersGame.DIFFICULTY);
        if (shootProbability > 0) {
            return null;
        }

        int shipToShoot = game.getRandomNumber(ships.size());
        return ships.get(shipToShoot).fire();
    }

    public int checkHit(List<Bullet> bullets) {
        if (bullets.isEmpty()) {
            return 0;
        }

        int scoreForKills = 0;
        for (EnemyShip ship : ships) {
            for (Bullet bullet : bullets) {
                if (ship.isAlive && bullet.isAlive && ship.isCollision(bullet)) {
                    ship.kill();
                    bullet.kill();
                    scoreForKills += ship.score;
                }
            }
        }

        return scoreForKills;
    }

    public void deleteHiddenShips() {
        Iterator<EnemyShip> shipIterator = ships.listIterator();
        while (shipIterator.hasNext()) {
            EnemyShip currentShip = shipIterator.next();
            if (!currentShip.isVisible()) {
                shipIterator.remove();
            }
        }
    }

    public double getBottomBorder() {
        if (ships.size() == 0) {
            return 0;
        }
        
        return ships.stream()
                .map(ship -> ship.height + ship.y)
                .max(Double::compare)
                .get();
    }

    public int getShipCount() {
        return ships.size();
    }

    private void createShips() {
        ships = new ArrayList<>();

        for (int i = 0; i < ROWS_COUNT; i++) {
            for (int j = 0; j < COLUMNS_COUNT; j++) {
                ships.add(new EnemyShip(j * STEP, i * STEP + 12));
            }
        }

        ships.add(new Boss(STEP * COLUMNS_COUNT / 2 - ShapeMatrix.BOSS_ANIMATION_FIRST.length / 2 - 1, 5));
    }

    private double getLeftBorder() {
        return ships.stream()
                .map(ship -> ship.x)
                .min(Double::compare).get();
    }

    private double getRightBorder() {
        return ships.stream()
                .map(ship -> ship.x + ship.width)
                .max(Double::compare).get();
    }

    private double getSpeed() {
        return Math.min(2.0, 10.0 / ships.size());
    }
}
