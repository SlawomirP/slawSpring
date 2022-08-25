package pl.SpringBootCourse.slawSpring.domain;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Castle {

    private String name = "East Watch";

    public Castle() {
    }

    @PostConstruct
    public void momentAfterCreateBean(){
        System.out.println("------moment after------");
    }

    @PreDestroy
    public void momentBeforeDeleteBean(){
        System.out.println("------moment before------");
    }

    @Override
    public String toString(){
      return  "Castle name: " + this.name;
    }
}

