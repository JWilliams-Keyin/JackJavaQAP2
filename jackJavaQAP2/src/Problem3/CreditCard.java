package Problem3;

public class CreditCard {

    // Attributes

    private Person owner;
    private Money balance;
    private Money creditLimit;

    // Constructors

    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.creditLimit = new Money(creditLimit);
        this.balance = new Money(0, 0);
    }

    // Getters

    public Money getBalance() { return new Money(balance); }
    public Money getCreditLimit() { return new Money(creditLimit); }
    public String getPersonals() { return owner.toString(); }

    // Methods

    public void charge(Money amount) {
        if ((balance.dollars * 100 + balance.cents + amount.dollars * 100 + amount.cents) > (creditLimit.dollars * 100 + creditLimit.cents)) {
            System.out.println("Exceeds credit limit");
        } else {
            System.out.println("Charge: " + amount);
            balance = new Money(balance.dollars + amount.dollars, balance.cents + amount.cents);
        }
    }

    public void payment(Money amount) {
        System.out.println("Payment: " + amount);
        balance = new Money(balance.dollars - amount.dollars, balance.cents - amount.cents);
    }
}
