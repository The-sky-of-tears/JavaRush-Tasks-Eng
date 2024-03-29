package en.codegym.task.pro.task16.task1611;

import java.time.LocalTime;

/* 
You only need to count
*/

public class Solution {

    public static void main(String[] args) throws InterruptedException {
        LocalTime localTime = LocalTime.MIDNIGHT;
        LocalTime next = amazingMethod(localTime);
        while (next.isAfter(localTime)) {
            System.out.println(next);
            next = amazingMethod(next);
            Thread.sleep(500);
        }
    }

    static LocalTime amazingMethod(LocalTime base) {
        base = base.plusMinutes(48);
        return base.plusHours(4);
    }
}
