package pl.SpringBootCourse.slawSpring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@PropertySource("classpath:Castle.properties")
@Component

public class Castle {

//    @Value("${my.castle.name}") // nazwa pliku z application.properties
                                // jezeli tego pliku nie byloby w application properties
                                // ale mozna napisac wart domyslna
@Value("${my.castle.name:DefaultName Castle}")
private String name = "East Watch";

    @Autowired
    Knight knight;

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
      return  "Castle name: " + this.name + " <-- " + knight;
    }
}

