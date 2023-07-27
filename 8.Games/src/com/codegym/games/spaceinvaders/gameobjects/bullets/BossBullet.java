package com.codegym.games.spaceinvaders.gameobjects.bullets;

import com.codegym.games.spaceinvaders.Direction;
import com.codegym.games.spaceinvaders.ShapeMatrix;

public class BossBullet extends Bullet {
    public BossBullet(double x, double y) {
        super(x, y, Direction.DOWN);
        setMatrix(ShapeMatrix.BOSS_BULLET);
    }
}
