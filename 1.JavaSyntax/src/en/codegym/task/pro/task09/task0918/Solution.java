package en.codegym.task.pro.task09.task0918;

/* 
Let's work with StringBuilder
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Learn, learn, and learn again! ";

        System.out.println(addTo(string, new String[]{"A", "rolling", "stone", "gathers", "no", "moss"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    public static StringBuilder addTo(String string, String[] strings) {
        StringBuilder result = new StringBuilder(string);
        for (var value : strings) {
            result.append(value);
        }

        return result;
    }

    public static StringBuilder replace(String string, String str, int start, int end) {
        StringBuilder result = new StringBuilder(string);
        result.replace(start, end, str);

        return result;
    }
}
