package com.codegym.games.spaceinvaders.gameobjects.ships;

import com.codegym.games.spaceinvaders.Direction;
import com.codegym.games.spaceinvaders.ShapeMatrix;
import com.codegym.games.spaceinvaders.SpaceInvadersGame;
import com.codegym.games.spaceinvaders.gameobjects.bullets.Bullet;
import com.codegym.games.spaceinvaders.gameobjects.bullets.PlayerBullet;

import java.util.List;

public class PlayerShip extends Ship {
    private Direction direction = Direction.UP;

    public PlayerShip() {
        super(SpaceInvadersGame.WIDTH / 2.0,
                SpaceInvadersGame.HEIGHT - ShapeMatrix.PLAYER.length - 1);
        setStaticView(ShapeMatrix.PLAYER);
    }

    public void setDirection(Direction direction) {
        if (direction != Direction.DOWN) {
            this.direction = direction;
        }
    }

    public Direction getDirection() {
        return direction;
    }

    @Override
    public void kill() {
        if (!isAlive) {
            return;
        }

        isAlive = false;

        setAnimatedView(false, ShapeMatrix.KILL_PLAYER_ANIMATION_FIRST,
                ShapeMatrix.KILL_PLAYER_ANIMATION_SECOND,
                ShapeMatrix.KILL_PLAYER_ANIMATION_THIRD,
                ShapeMatrix.DEAD_PLAYER);
    }

    @Override
    public Bullet fire() {
        if (!isAlive) {
            return null;
        }

        return new PlayerBullet(x + 2, y - ShapeMatrix.PLAYER_BULLET.length);
    }

    public void move() {
        if (!isAlive) {
            return;
        }

        switch (direction) {
            case LEFT -> x--;
            case RIGHT -> x++;
        }

        if (x < 0) {
            x = 0;
        }

        if (x + width > SpaceInvadersGame.WIDTH) {
            x = SpaceInvadersGame.WIDTH - width;
        }

    }

    public void checkHit(List<Bullet> bullets) {
        if (bullets.isEmpty()) {
            return;
        }

        if (isAlive) {
            for (Bullet bullet: bullets) {
                if (bullet.isAlive && this.isCollision(bullet)) {
                    kill();
                    bullet.kill();
                    break;
                }
            }
        }
    }

    public void win() {
        setStaticView(ShapeMatrix.WIN_PLAYER);
    }
}
