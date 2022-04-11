package OrderByAge_07;

public class Orders {
    private String firstName;
    private String numberID;
    private int age;

    Orders(String firstName, String numberID, int age) {
        this.firstName = firstName;
        this.numberID = numberID;
        this.age = age;
    }

    public String getFirstName() {
     return this.firstName;
    }

    public String getNumberID() {
        return this.numberID;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return String.format("%s with ID: %s is %d years old.%n", firstName,numberID,age);
    }
}
