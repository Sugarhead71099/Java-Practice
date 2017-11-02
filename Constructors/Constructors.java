package Constructors;

/**
 * Created by braij on 4/5/2017.
 */
public class Constructors {

    public static void main(String[] args) {
        BankAccount bank = new BankAccount(1, 1000d, "John Doe", "johndoe@fakeemail.com",
                "5943215602");
        System.out.println(bank);
        bank.withdraw(500d);
        bank.deposit(200.50);
        System.out.println(bank);
    }

}

class BankAccount {

    int accountNumber;
    double balance;
    String customerName, email, phoneNumber;

    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount() {
        this(0, 0d, "Fake Customer", "emample@email.com", "1234567890");
    }

    // Getters
    public int getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }
    public String getCustomerName() { return customerName; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }

    // Setters
    public void setAccountNumber(int accountNumber) { this.accountNumber = accountNumber; }
    public void setBalance(double balance) { this.balance = balance; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public void setEmail(String email) { this.email = email; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    // Additional methods
    public void deposit(double amount) {
        double currentBalance = balance;
        if(balance < 0)
            System.out.println("Cannot deposit negative value!");
        balance += amount;
        System.out.printf("Deposit successfully completed:%n\tOld Balance: $%f%n\tNew Balance: $%f", currentBalance, balance);
        System.out.println("\n");
    }

    public void withdraw(double amount) {
        double currentBalance = balance;
        if(balance >= amount) {
            balance -= amount;
            System.out.printf("Withdraw successfully completed:%n\tOld Balance: $%f%n\tNew Balance: $%f", currentBalance, balance);
        } else
            System.out.printf("You have insufficient funds:%n\tyour balance is $%f and you have attempted to withdraw $%f", balance, amount);
        System.out.println("\n");
    }

    @Override
    public String toString() {
        return String.format("%s%n%s%n%s%nAccount Number:\t%s%nBalance: $%f%n", customerName, email, formatPhoneNumber(phoneNumber),
                accountNumber < 10 ? "0" + accountNumber : accountNumber, balance);
    }

    public String formatPhoneNumber(String phoneNumber) {
        StringBuilder sb = new StringBuilder(15);
        StringBuilder temp = new StringBuilder(phoneNumber);

        while(temp.length() < 10)
            temp.insert(0, "0");

        char[] characters = temp.toString().toCharArray();

        sb.append("(");
        for(int i = 0; i < characters.length; i++) {
            if(i == 3)
                sb.append(") ");
            else if(i == 6)
                sb.append("-");
            sb.append(characters[i]);
        }

        return sb.toString();
    }

}