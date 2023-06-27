package en.codegym.task.pro.task16.task1606;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
Breaking out of an obsession
*/

public class Solution {

    public static void main(String[] args) {
        Calendar start = new GregorianCalendar(2014, Calendar.JANUARY, 2);
        Calendar end = new GregorianCalendar(2014, Calendar.FEBRUARY, 2);

        System.out.print("Start");
        while (start.before(end)) {
            start.add(Calendar.DAY_OF_MONTH, 1);
            System.out.print(".");
        }
        System.out.print("Finish");
    }
}
