package en.codegym.task.pro.task18.task1812;

public class Language {
    private String name;
    private Double ranking;

    public Language(String name, Double ranking) {
        this.name = name;
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public Double getRanking() {
        return ranking;
    }

    @Override
    public String toString() {
        return "Programming language: " + name + ", popularity: " + ranking + "% of respondents.";
    }
}
