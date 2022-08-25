package pl.SpringBootCourse.slawSpring.domain;

import org.springframework.stereotype.Component;

@Component
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
