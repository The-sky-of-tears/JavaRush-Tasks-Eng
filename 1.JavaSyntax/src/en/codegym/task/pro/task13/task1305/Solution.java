package en.codegym.task.pro.task13.task1305;

import java.util.ArrayList;
import java.util.Iterator;

/* 
Find and neutralize
*/

public class Solution {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello world!");
        words.add("Amigo");
        words.add("Elly");
        words.add("Kerry");
        words.add("Bug");
        words.add("bug");
        words.add("Easy ug");
        words.add("Risha");

        ArrayList<String> wordsFirstCopy = new ArrayList<>(words);
        ArrayList<String> wordsSecondCopy = new ArrayList<>(words);
        ArrayList<String> wordsThirdCopy = new ArrayList<>(words);

        removeBugWithFor(wordsFirstCopy);
        removeBugWithWhile(wordsSecondCopy);
        removeBugWithCopy(wordsThirdCopy);

        wordsFirstCopy.forEach(System.out::println);
        String line = "_________________________";
        System.out.println(line);
        wordsSecondCopy.forEach(System.out::println);
        System.out.println(line);
        wordsThirdCopy.forEach(System.out::println);
        System.out.println(line);
    }

    public static void removeBugWithFor(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase("bug")) {
                list.remove(i);
                i--;
            }
        }
    }

    public static void removeBugWithWhile(ArrayList<String> list) {
        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String word = it.next();

            if (word.equalsIgnoreCase("bug")) {
                it.remove();
            }
        }
    }

    public static void removeBugWithCopy(ArrayList<String> list) {
        ArrayList<String> copyList = new ArrayList<>(list);

        for (var word : copyList) {
            if (word.equalsIgnoreCase("bug")) {
                list.remove(word);
            }
        }
    }
}
