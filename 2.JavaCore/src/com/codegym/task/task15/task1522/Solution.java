package com.codegym.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Reinforce the singleton pattern

*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static Planet thePlanet;

    // Add static block here

    public static void readKeyFromConsoleAndInitPlanet() {
        Scanner in = new Scanner(System.in);
        String key = in.nextLine();

        switch (key) {
            case Planet.EARTH -> thePlanet = Earth.getInstance();
            case Planet.MOON -> thePlanet = Moon.getInstance();
            case Planet.SUN -> thePlanet = Sun.getInstance();
            default -> thePlanet = null;
        }
    }
}
