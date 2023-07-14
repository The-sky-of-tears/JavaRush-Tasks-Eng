package com.codegym.task.task14.task1408.hens;

import com.codegym.task.task14.task1408.Continent;

public class EuropeanHen extends Hen {
    @Override
    public int getMonthlyEggCount() {
        return 2;
    }

    @Override
    public String getDescription() {
        return String.format("%s I come from %s. I lay %d eggs a month.",
                super.getDescription(), Continent.EUROPE, getMonthlyEggCount());
    }
}
