package en.codegym.task.pro.task18.task1805;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    @Override
    public int compare(String string1, String string2) {
        return string1.length() - string2.length();
    }
}
