package OpinionPool_03;

public class Person {
    private String name;
    private int age;

    public Person(String firstName, String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age) {
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }

}
