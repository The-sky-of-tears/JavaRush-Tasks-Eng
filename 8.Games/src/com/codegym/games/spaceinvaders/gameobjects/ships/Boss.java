package com.codegym.games.spaceinvaders.gameobjects.ships;

import com.codegym.games.spaceinvaders.Direction;
import com.codegym.games.spaceinvaders.ShapeMatrix;
import com.codegym.games.spaceinvaders.gameobjects.bullets.BossBullet;
import com.codegym.games.spaceinvaders.gameobjects.bullets.Bullet;
import com.codegym.games.spaceinvaders.gameobjects.ships.EnemyShip;

public class Boss extends EnemyShip {
    private int frameCount = 0;

    public Boss(double x, double y) {
        super(x, y);
        score = 100;
        setAnimatedView(true, ShapeMatrix.BOSS_ANIMATION_FIRST,
                ShapeMatrix.BOSS_ANIMATION_SECOND);
    }

    @Override
    public void nextFrame() {
        frameCount++;
        if (frameCount % 10 == 0 || !isAlive) {
            super.nextFrame();
        }
    }

    @Override
    public Bullet fire() {
        if (!isAlive) {
            return null;
        }

        if (matrix == ShapeMatrix.BOSS_ANIMATION_FIRST) {
            return new BossBullet(x + 6, y + height);
        } else {
            return new BossBullet(x, y + height);
        }
    }

    @Override
    public void kill() {
        if (!isAlive) {
            return;
        }

        isAlive = false;
        setAnimatedView(false, ShapeMatrix.KILL_BOSS_ANIMATION_FIRST,
                ShapeMatrix.KILL_BOSS_ANIMATION_SECOND,
                ShapeMatrix.KILL_BOSS_ANIMATION_THIRD);
    }
}
