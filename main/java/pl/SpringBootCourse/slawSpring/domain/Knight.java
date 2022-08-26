package pl.SpringBootCourse.slawSpring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Knight {
    @Value("lancelot") // tutaj podajemy odnosnik do pliku z application.properties
    private String name = "lancelot";
    @Value("29")
    private int age = 29;

    public Knight() {
    }
        private Quest quest;

//    public Knight(String name, int age, Quest quest) {
//        this.name = name;
//        this.age = age;
//        this.quest = quest;
//    }

    public Knight(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Autowired
    public void setQuest(Quest quest) {
        System.out.println("----------");
        this.quest = quest;
    }
    @Override
    public String toString() {
        return "knight name: " + name + " (" + age + "). Quest: " + this.quest;
    }
}
