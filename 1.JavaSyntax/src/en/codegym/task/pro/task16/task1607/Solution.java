package en.codegym.task.pro.task16.task1607;

import java.time.LocalDate;

/* 
Mastering a new API
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        return LocalDate.now();
    }

    static LocalDate ofExample() {
        return LocalDate.of(2020, 9, 12);
    }

    static LocalDate ofYearDayExample() {
        return LocalDate.ofYearDay(2020
                , 31 + 29 + 31 +30 + 31 + 30 + 31 + 31 + 12);
    }

    static LocalDate ofEpochDayExample() {
        LocalDate temp = LocalDate.ofEpochDay(0);
        int daysCounter = 0;
        while (!temp.isEqual(LocalDate.of(2020,9, 12))) {
            temp = temp.plusDays(1);
            daysCounter++;
        }

        return LocalDate.ofEpochDay(daysCounter);
    }
}
