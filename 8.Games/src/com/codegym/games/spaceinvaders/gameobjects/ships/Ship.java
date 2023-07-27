package com.codegym.games.spaceinvaders.gameobjects.ships;

import com.codegym.engine.cell.Game;
import com.codegym.games.spaceinvaders.gameobjects.GameObject;
import com.codegym.games.spaceinvaders.gameobjects.bullets.Bullet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Ship extends GameObject {
    public boolean isAlive = true;

    private List<int[][]> frames;
    private int frameIndex;
    private boolean loopAnimation = false;

    public Ship(double x, double y) {
        super(x, y);
    }

    @Override
    public void draw(Game game) {
        super.draw(game);
        nextFrame();
    }

    public void setStaticView(int[][] viewFrame) {
        setMatrix(viewFrame);
        frames = new ArrayList<>();
        frames.add(viewFrame);
        frameIndex = 0;
    }

    public void setAnimatedView(boolean isLoopAnimation, int[][]... viewFrames) {
        loopAnimation = isLoopAnimation;
        setMatrix(viewFrames[0]);
        frames = Arrays.asList(viewFrames);
        frameIndex = 0;
    }

    public void nextFrame() {
        frameIndex++;

        if (frameIndex >= frames.size()) {
            if (loopAnimation) {
                frameIndex = 0;
            } else {
                return;
            }
        }

        setMatrix(frames.get(frameIndex));
    }

    public abstract Bullet fire();

    public void kill() {
        isAlive = false;
    }

    public boolean isVisible() {
        return !isAlive && frameIndex >= frames.size() ? false : true;
    }
}