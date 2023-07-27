package com.codegym.games.spaceinvaders;

public class ShapeMatrix {
    public static final int[][] ENEMY = new int[][]{
            {5, 0, 5},
            {5, 5, 5},
            {0, 5, 0}
    };

    public static final int[][] PLAYER = new int[][]{
            {0, 0, 28, 0, 0},
            {0, 28, 28, 28, 0},
            {28, 28, 28, 28, 28}
    };

    public static final int[][] DEAD_PLAYER = new int[][]{
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0}
    };

    public static final int[][] WIN_PLAYER = new int[][]{
            {0, 0, 5, 0, 0},
            {0, 5, 5, 5, 0},
            {5, 5, 5, 5, 5}
    };

    public static final int[][] ENEMY_BULLET = new int[][]{
            {65},
            {65}
    };

    public static final int[][] PLAYER_BULLET = new int[][]{
            {75},
            {75}
    };

    public static final int[][] KILL_ENEMY_ANIMATION_FIRST = new int[][]{
            {4, 4, 4},
            {4, 4, 4},
            {4, 4, 4}
    };

    public static final int[][] KILL_ENEMY_ANIMATION_SECOND = new int[][]{
            {4, 0, 4},
            {0, 4, 0},
            {4, 0, 4}
    };

    public static final int[][] KILL_ENEMY_ANIMATION_THIRD = new int[][]{
            {0, 0, 0},
            {0, 4, 0},
            {0, 0, 0}
    };

    public static final int[][] KILL_PLAYER_ANIMATION_FIRST = new int[][]{
            {4, 4, 4, 4, 4},
            {4, 4, 4, 4, 4},
            {4, 4, 4, 4, 4}
    };

    public static final int[][] KILL_PLAYER_ANIMATION_SECOND = new int[][]{
            {4, 0, 4, 0, 4},
            {0, 4, 0, 4, 0},
            {4, 0, 4, 0, 4}
    };

    public static final int[][] KILL_PLAYER_ANIMATION_THIRD = new int[][]{
            {0, 4, 0, 4, 0},
            {4, 0, 4, 0, 4},
            {0, 4, 0, 4, 0}
    };

    public static final int[][] KILL_BOSS_ANIMATION_FIRST = new int[][]{
            {4, 4, 4, 4, 4, 4, 4},
            {4, 4, 4, 4, 4, 4, 4},
            {4, 4, 4, 4, 4, 4, 4},
            {4, 4, 4, 4, 4, 4, 4},
            {4, 4, 4, 4, 4, 4, 4},
            {4, 4, 4, 4, 4, 4, 4}
    };

    public static final int[][] KILL_BOSS_ANIMATION_SECOND = new int[][]{
            {4, 0, 0, 4, 0, 0, 4},
            {0, 4, 0, 4, 0, 4, 0},
            {0, 0, 4, 4, 4, 0, 0},
            {0, 0, 4, 4, 4, 0, 0},
            {0, 4, 0, 4, 0, 4, 0},
            {4, 0, 0, 4, 0, 0, 4}
    };

    public static final int[][] KILL_BOSS_ANIMATION_THIRD = new int[][]{
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 4, 4, 4, 0, 0},
            {0, 0, 4, 4, 4, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0}
    };

    public static final int[][] BOSS_ANIMATION_FIRST = new int[][]{
            {0, 0, 4, 0, 4, 0, 0},
            {0, 2, 2, 2, 2, 2, 0},
            {4, 2, 0, 2, 0, 2, 0},
            {4, 2, 2, 2, 2, 2, 4},
            {0, 0, 4, 4, 4, 0, 4},
            {0, 0, 4, 0, 4, 0, 0}
    };

    public static final int[][] BOSS_ANIMATION_SECOND = new int[][]{
            {0, 0, 4, 0, 4, 0, 0},
            {0, 2, 2, 2, 2, 2, 0},
            {0, 2, 0, 2, 0, 2, 4},
            {4, 2, 2, 2, 2, 2, 4},
            {4, 0, 4, 4, 4, 0, 0},
            {0, 0, 4, 0, 4, 0, 0}
    };
}