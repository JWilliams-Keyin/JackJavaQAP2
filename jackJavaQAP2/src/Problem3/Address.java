package Problem3;

public class Address {

    // Attributes

    private String street;
    private String city;
    private String state;
    private String zipCode;

    // Constructors

    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    // Methods

    public String toString() {
        return street + ", " + city + ", " + state + " " + zipCode;
    }
}
