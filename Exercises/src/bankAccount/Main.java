package bankAccount;

public class Main {

    // Create a new class for Bank Account
    // Create fields for the account number, balance, customer name,
    // email and phone number.
    // Create getter and setter for each field
    // Create two additional methods
    // 1. To allow the customer to deposit funds(this should increment the balance field).
    // 2. To allow the customer to withdraw funds(this should deduct from the balance field,
    // but not allow the withdrawal to complete if their insufficient funds.)
    // You will want to create various code in the Main class(the one created by Eclipse) to
    // confirm your code is working.
    // Add some System.out.println's in the two methods above as well.

    public static void main(String[] args) {

        BankAccount client = new BankAccount("Excalibur","EX11235486678",0.0,"excalibur@gmail.com","45587893");
        System.out.println("Client name : " + client.getCustomerName() + "\r Account number : " + client.getAccountNumber() +
                "\r Account Balance : " + client.getBalance() + "\r Email address : " + client.getEmail() +
                "\r Phone number : " + client.getPhoneNumber());
        client.deposit(1500.0);
        client.deposit(20.0);
        client.deposit(835.5);
        client.withdraw(500.0);
        client.withdraw(3000.0);
        client.withdraw(1855.5);
    }

}
