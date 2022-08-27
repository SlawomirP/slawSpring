package pl.SpringBootCourse.slawSpring.ReviveSingleton;

public enum PersonUtils2 {

    INSTANCE;

    public final String operationToUpperCase(Person person) {
        return person.name.toUpperCase();
    }
}
