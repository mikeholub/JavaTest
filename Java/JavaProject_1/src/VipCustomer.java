public class VipCustomer {
    String name;
    String email;
    int creditLimit;

    public VipCustomer () {
        this("Mike Test", "abs@email.com", 1000);
    }

    public VipCustomer (String name, String email) {
        this (name, email, 2000);
    }

    public VipCustomer (String name, String email, int creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
        System.out.println("You did it");
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public int getCreditLimit() {
        return this.creditLimit;
    }
}
