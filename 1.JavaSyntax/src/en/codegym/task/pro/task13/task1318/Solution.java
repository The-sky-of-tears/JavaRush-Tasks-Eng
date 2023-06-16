package en.codegym.task.pro.task13.task1318;

/* 
Next month, please
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        return Month.values()[month.ordinal() == 11 ? 0 : month.ordinal() + 1];
    }
}
