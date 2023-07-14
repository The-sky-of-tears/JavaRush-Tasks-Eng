package com.codegym.task.task14.task1414;

/* 
MovieFactory

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String key;

        while (true)
        {
            key = in.nextLine();
            Movie movie = MovieFactory.getMovie(key);

            if (movie == null) {
                break;
            }

            System.out.println(movie.getClass().getSimpleName());
        }

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            // Create a SoapOpera object for the key "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            } else if (key.equals("cartoon")) {
                movie = new Cartoon();
            } else if (key.equals("thriller")) {
                movie = new Thriller();
            }

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {

    }

    static class Thriller extends Movie {

    }

    // Write your classes here. Item 3
}
