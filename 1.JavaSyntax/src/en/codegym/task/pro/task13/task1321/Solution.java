package en.codegym.task.pro.task13.task1321;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("Tuesday"));
        System.out.println(getTranslationForDayOfWeek("Friday"));
        System.out.println(getTranslationForDayOfWeek("Funday"));
    }

    public static String getTranslationForDayOfWeek(String en) {
        String pigLatin;

        if (en.equalsIgnoreCase("monday")) {
            pigLatin = "Ondaymay";
        } else if (en.equalsIgnoreCase("tuesday")) {
            pigLatin = "Uesdaytay";
        } else if (en.equalsIgnoreCase("wednesday")) {
            pigLatin = "Ednesdayway";
        } else if (en.equalsIgnoreCase("thursday")) {
            pigLatin = "Ursdaythay";
        } else if (en.equalsIgnoreCase("friday")) {
            pigLatin = "Idayfray";
        } else if (en.equalsIgnoreCase("saturday")) {
            pigLatin = "Aturdaysay";
        } else if (en.equalsIgnoreCase("sunday")) {
            pigLatin = "Undaysay";
        } else {
            pigLatin = "Invalid day of the week";
        }

        return pigLatin;
    }
}
