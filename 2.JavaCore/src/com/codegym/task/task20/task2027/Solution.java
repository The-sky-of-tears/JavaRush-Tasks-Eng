package com.codegym.task.task20.task2027;

import java.util.ArrayList;
import java.util.List;

/* 
Word search

*/

public class Solution {
    public static void main(String[] args) {
        int[][] wordSearch = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };

        List<Word> foundedWords = detectAllWords(wordSearch, "hj");
        System.out.println(foundedWords);
    }

    public static List<Word> detectAllWords(int[][] wordSearch, String... words) {
        List<Word> result = new ArrayList<>();

        for (String word : words) {
            Word newWord = new Word(word);
            findEntry(wordSearch, newWord);
            result.add(newWord);
        }

        return result;
    }

    private static void findEntry(int[][] wordSearch, Word word) {

        for (int i = 0; i < wordSearch.length; i++) {
            for (int j = 0; j < wordSearch[i].length; j++) {
                if (wordSearch[i][j] == word.getText().charAt(0)) {
                    word.setStartPoint(j, i);

                    if (word.getText().length() == 1) {
                        word.setEndPoint(j, i);
                        return;
                    }

                    if (tryBuildWord(wordSearch, word, i, j)) {
                        return;
                    }
                }
            }
        }
    }

    private static boolean tryBuildWord(int[][] wordsSearch, Word word, int startI, int startJ) {

        if (tryHorizontalRight(wordsSearch, word, startI, startJ)) {
            return true;
        }
        if (tryHorizontalLeft(wordsSearch, word, startI, startJ)) {
            return true;
        }
        if (tryVerticalUp(wordsSearch, word, startI, startJ)) {
            return true;
        }
        if (tryVerticalDown(wordsSearch, word, startI, startJ)) {
            return true;
        }
        if (tryDiagLeftUp(wordsSearch, word, startI, startJ)) {
            return true;
        }
        if (tryDiagRightUp(wordsSearch, word, startI, startJ)) {
            return true;
        }
        if (tryDiagRightDown(wordsSearch, word, startI, startJ)) {
            return true;
        }
        if (tryDiagLeftDown(wordsSearch, word, startI, startJ)) {
            return true;
        }


        return false;
    }

    private static boolean tryHorizontalRight(int[][] wordsSearch, Word word, int startI, int startJ) {

        StringBuilder tempWord = new StringBuilder(String.valueOf((char) wordsSearch[startI][startJ]));

        int j = startJ + 1;
        while (j < wordsSearch[startI].length
                && tempWord.length() != word.getText().length()) {

            tempWord.append((char) wordsSearch[startI][j]);
            j++;
        }

        if (tempWord.toString().equals(word.getText())) {
            word.setEndPoint(j - 1, startI);
            return true;
        } else {
            return false;
        }
    }

    private static boolean tryHorizontalLeft(int[][] wordsSearch, Word word, int startI, int startJ) {
        StringBuilder tempWord = new StringBuilder(String.valueOf((char) wordsSearch[startI][startJ]));

        int j = startJ - 1;
        while (j >= 0
                && tempWord.length() != word.getText().length()) {

            tempWord.append((char) wordsSearch[startI][j]);
            j--;
        }

        if (tempWord.toString().equals(word.getText())) {
            word.setEndPoint(j + 1, startI);
            return true;
        } else {
            return false;
        }
    }

    private static boolean tryVerticalUp(int[][] wordsSearch, Word word, int startI, int startJ) {

        StringBuilder tempWord = new StringBuilder(String.valueOf((char) wordsSearch[startI][startJ]));

        int i = startI - 1;
        while (i >= 0
                && tempWord.length() != word.getText().length()) {

            tempWord.append((char) wordsSearch[i][startJ]);
            i--;
        }

        if (tempWord.toString().equals(word.getText())) {
            word.setEndPoint(startJ, i + 1);
            return true;
        } else {
            return false;
        }
    }

    private static boolean tryVerticalDown(int[][] wordsSearch, Word word, int startI, int startJ) {

        StringBuilder tempWord = new StringBuilder(String.valueOf((char) wordsSearch[startI][startJ]));

        int i = startI + 1;
        while (i < wordsSearch.length
                && tempWord.length() != word.getText().length()) {

            tempWord.append((char) wordsSearch[i][startJ]);
            i++;
        }

        if (tempWord.toString().equals(word.getText())) {
            word.setEndPoint(startJ, i - 1);
            return true;
        } else {
            return false;
        }
    }

    private static boolean tryDiagLeftUp(int[][] wordsSearch, Word word, int startI, int startJ) {

        StringBuilder tempWord = new StringBuilder(String.valueOf((char) wordsSearch[startI][startJ]));

        int i = startI - 1;
        int j = startJ - 1;
        while (i >= 0 && j >= 0
                && tempWord.length() != word.getText().length()) {

            tempWord.append((char) wordsSearch[i][j]);
            i--;
            j--;
        }

        if (tempWord.toString().equals(word.getText())) {
            word.setEndPoint(j + 1, i + 1);
            return true;
        } else {
            return false;
        }
    }

    private static boolean tryDiagRightUp(int[][] wordsSearch, Word word, int startI, int startJ) {

        StringBuilder tempWord = new StringBuilder(String.valueOf((char) wordsSearch[startI][startJ]));

        int i = startI - 1;
        int j = startJ + 1;
        while (i >= 0 && j < wordsSearch[i].length
                && tempWord.length() != word.getText().length()) {

            tempWord.append((char) wordsSearch[i][j]);
            i--;
            j++;
        }

        if (tempWord.toString().equals(word.getText())) {
            word.setEndPoint(j - 1, i + 1);
            return true;
        } else {
            return false;
        }
    }

    private static boolean tryDiagRightDown(int[][] wordsSearch, Word word, int startI, int startJ) {

        StringBuilder tempWord = new StringBuilder(String.valueOf((char) wordsSearch[startI][startJ]));

        int i = startI + 1;
        int j = startJ + 1;
        while (i < wordsSearch.length && j < wordsSearch[i].length
                && tempWord.length() != word.getText().length()) {

            tempWord.append((char) wordsSearch[i][j]);
            i++;
            j++;
        }

        if (tempWord.toString().equals(word.getText())) {
            word.setEndPoint(j - 1, i - 1);
            return true;
        } else {
            return false;
        }
    }

    private static boolean tryDiagLeftDown(int[][] wordsSearch, Word word, int startI, int startJ) {

        StringBuilder tempWord = new StringBuilder(String.valueOf((char) wordsSearch[startI][startJ]));

        int i = startI + 1;
        int j = startJ - 1;
        while (i < wordsSearch.length && j >= 0
                && tempWord.length() != word.getText().length()) {

            tempWord.append((char) wordsSearch[i][j]);
            i++;
            j--;
        }

        if (tempWord.toString().equals(word.getText())) {
            word.setEndPoint(j + 1, i - 1);
            return true;
        } else {
            return false;
        }
    }

    public static class Word {
        private final String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public int getStartX() {
            return startX;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        public int getStartY() {
            return startY;
        }

        public String getText() {
            return text;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
