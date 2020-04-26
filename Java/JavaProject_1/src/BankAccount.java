public class BankAccount {
    private int accountNumber, balance;
    private String customerName, email, phoneNumber;

    public BankAccount () {
        this(12, 23);
        System.out.println("New instance was created");
    }

    public BankAccount (int accountNumber, int balance) {
        System.out.println("Instance with parameters was created");
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber () {
        return this.accountNumber;
    }

    public int getBalance () {
        return this.balance;
    }

    public String getCustomerName () {
        return this.customerName;
    }

    public String getEmail () {
        return this.email;
    }

    public String getPhoneNumber () {
        return this.phoneNumber;
    }

    public void setAccountNumber (int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void  setBalance (int balance) {
        this.balance = balance;
    }

    public void setCustomerName (String customerName) {
        this.customerName = customerName;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public void setPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds (int deposit) {
        this.balance += deposit;
        System.out.println("Founds were successfully deposited!");
    }

    public void withdrawFunds (int withdraw) {
        if (this.balance >= withdraw) {
            this.balance -=withdraw;
        } else {
            System.out.println("Not enough funds!");
        }
    }
}
