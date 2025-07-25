abstract class BankAccount {
  private String accountNumber;
  private double balance;

  public BankAccount(String accountNumber) {
    this.accountNumber = accountNumber;
    this.balance = 0.0;
  }

  public abstract void deposit(double amount);
  public abstract void withdraw(double amount);
  
  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void printBalance() {
    System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
  }
}

class SavingsAccount extends BankAccount {
  public SavingsAccount(String accountNumber) {
    super(accountNumber);
  }

  @Override
  public void deposit(double amount) { 
    if (amount > 0) {
      setBalance(getBalance() + amount);
      System.out.println("Deposited: " + amount + ", New Balance: " + getBalance());
    } else {
      System.out.println("Deposit amount must be positive.");
    }
  }

  @Override
  public void withdraw(double amount) {
    if (amount > 0 && amount <= getBalance()) {
      setBalance(getBalance() - amount);
      System.out.println("Withdrew: " + amount + ", New Balance: " + getBalance());
    }
    else {
      System.out.println("Insufficient funds or invalid withdrawal amount.");
    }
  }
}

public class Abstraction {
  public static void main(String[] args) {
    BankAccount myAccount = new SavingsAccount("SA12345");

    myAccount.printBalance();
    myAccount.deposit(1000);
    myAccount.printBalance();

    myAccount.withdraw(500);
    myAccount.printBalance();
  }
}