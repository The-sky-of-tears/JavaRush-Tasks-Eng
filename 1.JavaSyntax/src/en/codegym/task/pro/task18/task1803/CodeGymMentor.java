package en.codegym.task.pro.task18.task1803;

public class CodeGymMentor {
    private String name;

    public CodeGymMentor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Mentor name: " + name;
    }
}
