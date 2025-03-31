package Problem3;

public class CreditCardTest {
    public static void main(String[] args) {
        Money limit = new Money(1000, 0);
        Person owner = new Person("Christie", "Diane", new Address("237J Harvey Hall", "Menomonie", "WI", "54751"));
        CreditCard visa = new CreditCard(owner, limit);

        System.out.println(visa.getPersonals());
        System.out.println("Balance: " + visa.getBalance());
        System.out.println("Credit Limit: " + visa.getCreditLimit());
    }
}
