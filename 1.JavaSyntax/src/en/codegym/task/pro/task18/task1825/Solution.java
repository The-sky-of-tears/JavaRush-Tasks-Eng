package en.codegym.task.pro.task18.task1825;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

/* 
From a data stream to a string
*/

public class Solution {

    public static void main(String[] args) {
        var stringStream = Stream.of("To", "be", "a", "programmer", "you", "need", "to", "code");

        System.out.println(getString(stringStream));
    }

    public static String getString(Stream<String> stringStream) {
        ArrayList<Integer> test = new ArrayList<>(0);
        Collections.addAll(test, 1, 2, 3, 4, 5, 6);
        test.forEach((s) -> System.out.println(s));

        return stringStream.collect(Collectors.joining(" "));
    }
}
