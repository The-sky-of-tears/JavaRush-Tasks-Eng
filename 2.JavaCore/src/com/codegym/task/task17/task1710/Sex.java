package com.codegym.task.task17.task1710;

public enum Sex {
    MALE,
    FEMALE;

    @Override
    public String toString() {
        if (this == MALE) {
            return "m";
        } else {
            return "f";
        }
    }
}
