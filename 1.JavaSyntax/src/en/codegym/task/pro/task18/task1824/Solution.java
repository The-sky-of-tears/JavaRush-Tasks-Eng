package en.codegym.task.pro.task18.task1824;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

/* 
From a data stream to a map
*/

public class Solution {

    public static void main(String[] args) {
        var stringStream = Stream.of("Developer", "CodeGym", "Amigo", "Elly", "Kim", "Risha");

        getMap(stringStream).forEach((s, i) -> System.out.println(s + " - " + i));
    }

    public static Map<String, Integer> getMap(Stream<String> stringStream) {
        return stringStream.collect(Collectors.toMap(k -> k, v -> v.length()));
    }
}
