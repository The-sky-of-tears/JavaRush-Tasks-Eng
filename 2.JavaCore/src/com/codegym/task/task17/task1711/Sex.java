package com.codegym.task.task17.task1711;

public enum Sex {
    MALE,
    FEMALE;

    @Override
    public String toString() {
        return this == MALE ? "m" : "f";
    }
}
