package Problem3;

public class Person {

    // Attributes

    private String firstName;
    private String lastName;
    private Address address;

    // Constructors

    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    // Methods

    public String toString() {
        return lastName + " " + firstName + ", " + address;
    }
}
