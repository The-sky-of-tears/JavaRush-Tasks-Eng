package com.codegym.task.task14.task1408.hens;

import com.codegym.task.task14.task1408.Continent;

public class AsianHen extends Hen {
    @Override
    public int getMonthlyEggCount() {
        return 3;
    }

    @Override
    public String getDescription() {
        return String.format("%s I come from %s. I lay %d eggs a month.",
                super.getDescription(), Continent.ASIA, getMonthlyEggCount());
    }
}
