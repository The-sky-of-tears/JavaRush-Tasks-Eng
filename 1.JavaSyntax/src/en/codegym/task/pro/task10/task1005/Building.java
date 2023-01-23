package en.codegym.task.pro.task10.task1005;

/* 
Serial entrepreneur
*/

public class Building {
    private String type;

    public void initialize(String newType) {
        this.type = newType;
    }

    public static void main(String[] args) {
        Building building = new Building();
        building.initialize("Barbershop");
    }
}
