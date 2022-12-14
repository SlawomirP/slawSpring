package pl.SpringBootCourse.slawSpring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
public class Castle {

    private String name;

    Knight knight;

    @Autowired
    public Castle(Knight knight) {
        this.knight = knight;
    }

    @Autowired
    Castle(Knight knight, String name) {
        this.name = name;
        this.knight = knight;
    }

    //    @PostConstruct
    public void momentAfterCreateBean() {
        System.out.println("------moment after------");
    }

    //    @PreDestroy
    public void momentBeforeDeleteBean() {
        System.out.println("------moment before------");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " <-- " + knight;
    }
}

