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
@Value("${my.castle.name:DefaultName Castle}") // TO ZOSTANIE WZIETE POD UWAGE JEZELI ZASTOSUJEMY WSTRZYKIWANIE
private String name = "East Watch"; // BEZ WSTRZYKIWANIA ZASOSUJE TA NAZWE

    //@Autowired // wstrzykiwanie bezposrednio do pola
    Knight knight;

    //wstrzykiwanie w konstruktorze, dochodzi adnotacja nad konstruktorem
    @Autowired
    public Castle(Knight knight) {
        this.knight = knight;
    }

    //TWORZYMY KONSTRUKTOR DO TESTOW BEZ WSTRZYKIWANIA, problem jest tu ze konstruktor jest public
    //i kazdy sobie moze utworzyc obiekt do testow w normalnej klasie, troche pomoze zastosowanie
    //folderu domain i tam wrzucamy test castle, modyfikator dostepu na domyslny czyli pozbywamy sie
    //public, w tym momencie bedzie on widoczny tylko dla klas w ttej samej paczce
    Castle(String name, Knight knight) {
        this.name = name;
        this.knight = knight;
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
      return  this.name + " <-- " + knight;
    }
}

