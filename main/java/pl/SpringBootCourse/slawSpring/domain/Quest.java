package pl.SpringBootCourse.slawSpring.domain;
//stworzenie nowej klasy 3
public class Quest {

    private String description;

    public Quest(String description) {
        this.description = description;
    }

    @Override
    public String toString(){
        return description;
    }
}
