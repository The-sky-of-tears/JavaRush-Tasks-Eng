package com.codegym.games.spaceinvaders.gameobjects.bullets;

import com.codegym.games.spaceinvaders.Direction;
import com.codegym.games.spaceinvaders.gameobjects.GameObject;

import java.util.List;

public abstract class Bullet extends GameObject {
    public boolean isAlive = true;

    private final int dy;

    public Bullet(double x, double y, Direction direction) {
        super(x, y);
        dy = direction == Direction.UP ? -1 : 1;
    }

    public void move() {
        y += dy;
    }

    public void kill() {
        isAlive = false;
    }
}
