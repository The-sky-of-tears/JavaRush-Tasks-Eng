package en.codegym.task.pro.task17.task1707;

public class Cat extends Pet {
    public static final String CAT = "I don't like people.";

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(CAT);
    }
}
