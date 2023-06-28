package en.codegym.task.pro.task17.task1706;

/* 
Carnivores vs Herbivores
*/

public class Solution {
    public static void main(String[] args) {
        printPreferredFood(new Cow());
        printPreferredFood(new Lion());
        printPreferredFood(new Elephant());
        printPreferredFood(new Wolf());
    }

    public static void printPreferredFood(Animal animal){
        String herbivore = "Loves grass";
        String carnivore = "Loves meat";

        if (animal instanceof Carnivore) {
            System.out.println(carnivore);
        } else if (animal instanceof  Herbivore) {
            System.out.println(herbivore);
        }
    }
}
