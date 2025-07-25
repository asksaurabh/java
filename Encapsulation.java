class BankAccount {
  private int balance;

  public BankAccount() {
    this.balance = 0;
  }

  public BankAccount(int balance, String accountType) {
    this.balance = balance;
  }

  public void setBalance(int balance) {
    // logic to validate and set balance
    this.balance = balance;
  }

  public void getBalance() {
    System.out.println("Balance: " + balance);
  }
}


public class Encapsulation {
  public static void main(String[] args) {
    BankAccount acc = new BankAccount();
    acc.getBalance();

    BankAccount acc2 = new BankAccount(5000, "Current");
    acc2.getBalance();
    acc2.setBalance(6000);
    acc2.getBalance();
  }
}