package en.codegym.task.pro.task16.task1601;

import java.util.Calendar;
import java.util.Date;

/* 
Just not on Monday :)
*/

public class Solution {

    static Date birthDate = new Date(102, 11, 24);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        return switch (date.getDay()) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> null;
        };
    }
}
