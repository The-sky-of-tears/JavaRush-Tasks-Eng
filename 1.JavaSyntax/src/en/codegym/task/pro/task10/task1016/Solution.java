package en.codegym.task.pro.task10.task1016;

/* 
Weather forecast
*/

public class Solution {

    public static void showWeather(City city) {
        System.out.println("Today's temperature in " + city.getName() + " is "
                + city.getTemperature());
    }

    public static void main(String[] args) {
        showWeather(new City("Dubai", 71));
    }
}
