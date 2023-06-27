package en.codegym.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
Day of the week when you were born
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(2002, 11, 24);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        return switch(calendar.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.MONDAY -> "Monday";
            case Calendar.TUESDAY -> "Tuesday";
            case Calendar.WEDNESDAY -> "Wednesday";
            case Calendar.THURSDAY -> "Thursday";
            case Calendar.FRIDAY -> "Friday";
            case Calendar.SATURDAY -> "Saturday";
            case Calendar.SUNDAY -> "Sunday";
            default -> null;
        };
    }
}
