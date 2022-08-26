package pl.SpringBootCourse.slawSpring.domain;

public class Quest {
    private String description;

    public Quest() {
        this.description = "save a princess";
    }

    @Override
    public String toString() {
        return description;
    }
}
