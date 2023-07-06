package en.codegym.task.pro.task18.task1812;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/* 
Programming language rankings
*/

public class Solution {

    public static void main(String[] args) {
        ArrayList<Language> languages = new ArrayList<>();
        Collections.addAll(languages,
                new Language("С#", 5.92),
                new Language("JavaScript", 2.09),
                new Language("Python", 14.26),
                new Language("C++", 8.66),
                new Language("Visual Basic", 5.77),
                new Language("Assembly language", 1.90),
                new Language("Java", 11.19),
                new Language("C", 13.06),
                new Language("SQL", 1.85),
                new Language("PHP", 1.92));

        Stream<Language> languageStream = sortByRanking(languages);
        languageStream.forEach(System.out::println);
    }

    public static Stream<Language> sortByRanking(ArrayList<Language> languages) {
        return languages.stream()
                .sorted((l1, l2) -> Double.compare(l2.getRanking(), l1.getRanking()));
    }
}
