package com.codegym.games.spaceinvaders.gameobjects.ships;

import com.codegym.games.spaceinvaders.Direction;
import com.codegym.games.spaceinvaders.ShapeMatrix;
import com.codegym.games.spaceinvaders.gameobjects.bullets.Bullet;
import com.codegym.games.spaceinvaders.gameobjects.bullets.EnemyBullet;

public class EnemyShip extends Ship {
    public int score = 15;

    public EnemyShip(double x, double y) {
        super(x, y);
        setStaticView(ShapeMatrix.ENEMY);
    }

    public void move(Direction direction, double speed) {
        switch (direction) {
            case UP -> {}
            case DOWN -> y += 2;
            case LEFT -> x -= speed;
            case RIGHT -> x += speed;
        }
    }

    @Override
    public Bullet fire() {
        return new EnemyBullet(x + width / 2, y + height);
    }

    @Override
    public void kill() {
        if (!isAlive) {
            return;
        }

        isAlive = false;

        setAnimatedView(false, ShapeMatrix.KILL_ENEMY_ANIMATION_FIRST,
                ShapeMatrix.KILL_ENEMY_ANIMATION_SECOND,
                ShapeMatrix.KILL_ENEMY_ANIMATION_THIRD);
    }
}
