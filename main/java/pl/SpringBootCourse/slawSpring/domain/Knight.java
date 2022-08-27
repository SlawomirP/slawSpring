package pl.SpringBootCourse.slawSpring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Knight {
    private String name;
    private int age;

    public Knight() {
    }

    private Quest quest;

    public Knight(String name, int age, Quest quest) {
        this.name = name;
        this.age = age;
    }

    public Knight(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Autowired
    public void setQuest(Quest quest) {
        System.out.println("----------");
        this.quest = quest;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "knight name: " + name + " (" + age + "). Quest: " + this.quest;
    }
}
