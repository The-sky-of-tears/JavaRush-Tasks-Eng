package en.codegym.task.pro.task18.task1803;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static ArrayList<CodeGymMentor> mentors = new ArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(mentors,
                new CodeGymMentor("John Squirrels"),
                new CodeGymMentor("Risha"),
                new CodeGymMentor("Eleanor Carrey"),
                new CodeGymMentor("Hans Noodles"),
                new CodeGymMentor("Kim"),
                new CodeGymMentor("Julio Siesta"),
                new CodeGymMentor("Diego"),
                new CodeGymMentor("Laga Bilaabo")
        );

        Collections.sort(mentors, new NameComparator());

        for (CodeGymMentor mentor : mentors) {
            System.out.println(mentor);
        }
    }
}
