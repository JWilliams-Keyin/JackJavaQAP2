package Problem3;

public class Money {

    // Attributes

    public int dollars;
    public int cents;

    // Constructors

    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    // Methods

    public String toString() {
        return "$" + dollars + "." + (cents < 10 ? "0" + cents : cents);
    }
}
