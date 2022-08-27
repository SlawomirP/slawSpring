package pl.SpringBootCourse.slawSpring.ReviveSingleton;

public class PersonUtils {

    PersonUtils instance = null; // tworzymy instacje klasy

    private PersonUtils() { //prywatny konstruktor aby obiekt byl tylko tutaj
    }

    //NAJPROSTSZA WERSJA SINGLETONA
    public PersonUtils getInstance() {  // zwrot PersonUtils,
        if (instance == null) {
            instance = new PersonUtils();
        }
        return instance;
    }


    public final String operationToUpperCase(Person person) {
        return person.name.toUpperCase();
    }
}
