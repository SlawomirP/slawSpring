package pl.SpringBootCourse.slawSpring.domain;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component // z tej klasy bedzie bean, spring przy starcie utworzy
            // nowy obiekt tej klasy i doda do kontenera
public class Castle {

    private String name = "East Watch";

    public Castle() {
    }

    @PostConstruct // metoda wykona sie po utworzeniu beana
    public void momentAfterCreateBean(){
        System.out.println("------moment after------");
    }

    @PreDestroy // metoda wykona sie przed zniszczeniem beana
    public void momentBeforeDeleteBean(){
        System.out.println("------moment before------");
    }
}
