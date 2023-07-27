package com.codegym.games.spaceinvaders.gameobjects.bullets;

import com.codegym.games.spaceinvaders.Direction;
import com.codegym.games.spaceinvaders.ShapeMatrix;
import com.codegym.games.spaceinvaders.gameobjects.bullets.Bullet;

import java.util.List;

public class PlayerBullet extends Bullet {
    public PlayerBullet(double x, double y) {
        super(x, y, Direction.UP);
        setMatrix(ShapeMatrix.PLAYER_BULLET);
    }

    public void checkHit(List<Bullet> bullets) {
        if (bullets.isEmpty()) {
            return;
        }

        for (Bullet bullet : bullets) {
            if (bullet instanceof BossBullet) {
                continue;
            }
            if (bullet.isAlive && this.isAlive && this.isCollision(bullet)) {
                this.kill();
                bullet.kill();
                return;
            }
        }
    }
}
