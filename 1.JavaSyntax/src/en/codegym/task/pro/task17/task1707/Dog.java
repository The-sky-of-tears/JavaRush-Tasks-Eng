package en.codegym.task.pro.task17.task1707;

public class Dog extends Pet {
    public static final String DOG = "I like people.";

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(DOG);
    }
}
