package en.codegym.task.pro.task18.task1819;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/* 
What if an element of a list is null?
*/

public class Solution {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "first", "second", null, "fourth", "fifth");

        printList(strings);
    }

    public static void printList(List<String> list) {
        String text = "This element is null";

        list.stream()
                .map(Optional::ofNullable)
                .forEach(optionalS -> {
                    System.out.println(optionalS.orElse(text));
                });
    }
}
