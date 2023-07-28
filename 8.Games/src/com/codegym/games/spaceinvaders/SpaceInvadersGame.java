package com.codegym.games.spaceinvaders;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.codegym.engine.cell.*;
import com.codegym.games.spaceinvaders.gameobjects.bullets.Bullet;
import com.codegym.games.spaceinvaders.gameobjects.EnemyFleet;
import com.codegym.games.spaceinvaders.gameobjects.bullets.PlayerBullet;
import com.codegym.games.spaceinvaders.gameobjects.ships.PlayerShip;
import com.codegym.games.spaceinvaders.gameobjects.Star;

public class SpaceInvadersGame extends Game {
    public static final int WIDTH = 100;
    public static final int HEIGHT = 100;
    public static final int DIFFICULTY = 10;

    private List<Star> stars;
    private EnemyFleet enemyFleet;
    private List<Bullet> enemyBullets;
    private List<Bullet> playerBullets;
    private PlayerShip playerShip;
    private boolean isGameStopped;
    private int animationsCount;
    private static final int PLAYER_BULLETS_MAX = 3;
    private int score;

    @Override
    public void initialize() {
        setScreenSize(WIDTH, HEIGHT);
        showGrid(false);
        createGame();
    }

    @Override
    public void onTurn(int step) {
        moveSpaceObjects();

        Bullet shot = enemyFleet.fire(this);
        if (shot != null) {
            enemyBullets.add(shot);
        }

        check();
        setScore(score);
        drawScene();
    }

    @Override
    public void onKeyPress(Key key) {
        switch (key) {
            case SPACE -> {
                if (isGameStopped) {
                    createGame();
                    break;
                }
                Bullet bullet = playerShip.fire();
                if (bullet != null && playerBullets.size() < PLAYER_BULLETS_MAX) {
                    playerBullets.add(bullet);
                }
            }
            case LEFT -> playerShip.setDirection(Direction.LEFT);
            case RIGHT -> playerShip.setDirection(Direction.RIGHT);
        }
    }

    @Override
    public void onKeyReleased(Key key) {
        if (key == Key.LEFT && playerShip.getDirection() == Direction.LEFT) {
            playerShip.setDirection(Direction.UP);
        }
        if (key == Key.RIGHT && playerShip.getDirection() == Direction.RIGHT) {
            playerShip.setDirection(Direction.UP);
        }
    }

    @Override
    public void setCellValueEx(int x, int y, Color cellColor, String value) {
        if (x < 0 || x > WIDTH - 1 || y < 0 || y > HEIGHT - 1) {
            return;
        }

        super.setCellValueEx(x, y, cellColor, value);
    }

    private void createGame() {
        enemyFleet = new EnemyFleet();
        enemyBullets = new ArrayList<>();
        playerShip = new PlayerShip();
        playerBullets = new ArrayList<>();
        isGameStopped = false;
        animationsCount = 0;
        score = 0;
        createStars();
        drawScene();
        setTurnTimer(40);
    }

    private void createStars() {
        stars = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            stars.add(new Star(getRandomNumber(WIDTH), getRandomNumber(HEIGHT)));
        }
    }

    private void drawScene() {
        drawField();
        enemyFleet.draw(this);
        enemyBullets.forEach(bullet -> bullet.draw(this));
        playerShip.draw(this);
        playerBullets.forEach(bullet -> bullet.draw(this));
    }

    private void drawField() {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                setCellValueEx(i, j, Color.BLACK, "");
            }
        }

        for (Star star : stars) {
            star.draw(this);
        }
    }

    private void moveSpaceObjects() {
        enemyFleet.move();
        enemyBullets.forEach(Bullet::move);
        playerShip.move();
        playerBullets.forEach(Bullet::move);
    }

    private void removeDeadBullets() {
        Iterator<Bullet> it = enemyBullets.listIterator();
        while (it.hasNext()) {
            Bullet currentBullet = it.next();
            if (currentBullet.y >= HEIGHT - 1 || !currentBullet.isAlive) {
                it.remove();
            }
        }

        it = playerBullets.listIterator();
        while (it.hasNext()) {
            Bullet currentBullet = it.next();
            if (currentBullet.y + ShapeMatrix.ENEMY_BULLET.length < 0 || !currentBullet.isAlive) {
                it.remove();
            }
        }
    }

    private void check() {
        playerShip.checkHit(enemyBullets);
        int scoreForKills = enemyFleet.checkHit(playerBullets);
        score += scoreForKills;
        for (Bullet playerBullet : playerBullets) {
            ((PlayerBullet) playerBullet).checkHit(enemyBullets);
        }

        removeDeadBullets();
        if (!playerShip.isAlive) {
            stopGameWithDelay();
        }
        enemyFleet.deleteHiddenShips();

        if (enemyFleet.getBottomBorder() >= playerShip.y) {
            playerShip.kill();
        }

        if (enemyFleet.getShipCount() == 0) {
            playerShip.win();
            stopGameWithDelay();
        }
    }

    private void stopGame(boolean isWin) {
        isGameStopped = true;
        stopTurnTimer();
        if (isWin) {
            showMessageDialog(Color.NONE, "EZ Win", Color.GREEN, 70);
        } else {
            showMessageDialog(Color.NONE, "LOL, you died", Color.RED, 70);
        }
    }

    private void stopGameWithDelay() {
        animationsCount++;
        if (animationsCount >= 10) {
            stopGame(playerShip.isAlive);
        }
    }

    public static void main(String[] args) {
        new SpaceInvadersGame().start();
    }
}