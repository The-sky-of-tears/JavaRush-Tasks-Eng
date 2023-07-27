package com.codegym.games.spaceinvaders.gameobjects;

import com.codegym.games.spaceinvaders.Direction;
import com.codegym.games.spaceinvaders.ShapeMatrix;

import java.util.List;

public class Bullet extends GameObject {
    public boolean isAlive = true;

    private int dy;

    public Bullet(double x, double y, Direction direction) {
        super(x, y);
        if (direction == Direction.DOWN) {
            setMatrix(ShapeMatrix.ENEMY_BULLET);
        } else if (direction == Direction.UP) {
            setMatrix(ShapeMatrix.PLAYER_BULLET);
        }
        dy = direction == Direction.UP ? -1 : 1;
    }

    public void move() {
        y += dy;
    }

    public void kill() {
        isAlive = false;
    }

    public void checkHit(List<Bullet> bullets) {
        if (bullets.isEmpty()) {
            return;
        }

        for (Bullet bullet : bullets) {
            if (bullet.isAlive && this.isAlive && this.isCollision(bullet)) {
                this.kill();
                bullet.kill();
                return;
            }
        }
    }
}
