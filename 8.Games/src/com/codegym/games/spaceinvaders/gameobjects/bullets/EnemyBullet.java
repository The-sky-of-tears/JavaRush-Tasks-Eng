package com.codegym.games.spaceinvaders.gameobjects.bullets;

import com.codegym.games.spaceinvaders.Direction;
import com.codegym.games.spaceinvaders.ShapeMatrix;

public class EnemyBullet extends Bullet {
    public EnemyBullet(double x, double y) {
        super(x, y, Direction.DOWN);
        setMatrix(ShapeMatrix.ENEMY_BULLET);
    }
}
