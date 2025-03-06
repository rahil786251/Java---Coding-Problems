//This program demonstrates abstraction in Java by implementing a bank system with deposit and withdrawal functionalities.



abstract class BankDetails {
    protected int balance = 5000; // Initial balance

    abstract void getBalance();
    abstract void deposit(int amount);
    abstract void withdraw(int amount);
}

class Balance extends BankDetails {
    // Display current balance
    void getBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Deposit money into the account
    void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw money from the account
    void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

public class BankAbs {
    public static void main(String[] args) {
        BankDetails b = new Balance(); 

        b.getBalance(); 
        b.deposit(2000); 
        b.getBalance(); 
        b.withdraw(3000); 
        b.getBalance(); 
        b.withdraw(5000); 
    }
}
