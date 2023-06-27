package en.codegym.task.pro.task16.task1621;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/* 
Write a pattern
*/

public class Solution {

    static DateTimeFormatter dateTimeFormatter = DateTimeFormatter
            .ofPattern("H:m:s d/M/yyyy");
    static String timeString = "13:30:45 11/01/2022";

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.parse(timeString, dateTimeFormatter);

        System.out.println(dateTime);
    }
}
