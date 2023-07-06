package en.codegym.task.pro.task18.task1814;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/* 
No repetitions
*/

public class Solution {

    public static void main(String[] args) {
        var words = new ArrayList<String>();
        Collections.addAll(words, "To become", "a", "programmer,", "you", "need", "to code",
                "and", "to code", "you", "need", "to study");

        Stream<String> distinctWords = getDistinctWords(words);
        distinctWords.peek(System.out::println).count();
    }

    public static Stream<String> getDistinctWords(ArrayList<String> words) {
        return words.stream()
                .distinct();
    }
}
