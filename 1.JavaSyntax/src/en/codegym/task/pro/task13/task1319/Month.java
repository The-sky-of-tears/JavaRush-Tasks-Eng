package en.codegym.task.pro.task13.task1319;

/* 
Months of the season
*/

import javax.net.ssl.SSLProtocolException;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths() {
        return new Month[] { DECEMBER, JANUARY, FEBRUARY };
    }

    public static Month[] getSpringMonths() {
        return new Month[] { MARCH, APRIL, MAY };
    }

    public static Month[] getSummerMonths() {
        return new Month[] { JUNE, JULY, AUGUST };
    }

    public static Month[] getAutumnMonths() {
        return new Month[]{SEPTEMBER, OCTOBER, NOVEMBER};
    }
}
