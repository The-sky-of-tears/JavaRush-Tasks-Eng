package com.codegym.games.spaceinvaders.gameobjects.bullets;

import com.codegym.games.spaceinvaders.Direction;
import com.codegym.games.spaceinvaders.ShapeMatrix;
import com.codegym.games.spaceinvaders.gameobjects.bullets.Bullet;

public class PlayerBullet extends Bullet {
    public PlayerBullet(double x, double y) {
        super(x, y, Direction.UP);
        setMatrix(ShapeMatrix.PLAYER_BULLET);
    }
}
