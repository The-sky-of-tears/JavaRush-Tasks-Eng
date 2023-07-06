package en.codegym.task.pro.task18.task1816;

import java.util.stream.Stream;

/* 
Data conversion 2
*/

public class Solution {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Don't", "worry", "if", "something", "doesn't", "work.", "If", "everything", "worked", "you", "would", "be", "fired.");

        toUpperCase(stream).forEach(System.out::println);
    }

    public static Stream<String> toUpperCase(Stream<String> strings) {
        return strings.map(String::toUpperCase);
    }
}
