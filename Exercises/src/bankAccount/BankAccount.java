package bankAccount;

public class BankAccount {
    private String customerName;
    private String accountNumber;
    private double balance;
    private String email;
    private String phoneNumber;

    public BankAccount(String customerName, String accountNumber, double balance, String email, String phoneNumber) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double deposit) {
        this.balance += deposit;
        System.out.println("Deposit of " + deposit + " available. New Balance : " + this.balance);
    }

    public void withdraw(double withdrawalAmount) {
        if (withdrawalAmount > this.balance) {
            System.out.println("insufficient funds");
            System.out.println("Only " + this.balance + " amount is available. Withdrawal not processed!");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal amount : " + withdrawalAmount + " . New Balance : " + this.balance);
        }
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustormerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
