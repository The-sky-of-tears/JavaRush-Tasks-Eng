package com.codegym.task.task14.task1408;

/* 
Chicken factory

*/

import com.codegym.task.task14.task1408.hens.*;

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Continent.AFRICA);
        hen.getMonthlyEggCount();
    }

    static class HenFactory {
        static Hen getHen(String continent) {
            return switch (continent) {
                case Continent.AFRICA -> new AfricanHen();
                case Continent.ASIA -> new AsianHen();
                case Continent.EUROPE -> new EuropeanHen();
                case Continent.NORTHAMERICA -> new NorthAmericanHen();
                default -> null;
            };
        }
    }

}
