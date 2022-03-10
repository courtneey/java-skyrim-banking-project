import java.util.Scanner;

public class Account {
  String name;
  String id;
  int balance;
  String previousTransaction;
  static String border = "\n**********\n";

  public Account(String userName, String userId) {
    this.name = userName;
    this.id = userId;
    this.balance = 100;
    this.previousTransaction = "No transaction history was found";
  }

  public void showMenu() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome, " + this.name + "!");
    System.out.println("Your account ID is: " + this.id);
    System.out.println("\nWhat would you like to do?\n");

    String[] options = {
        "A. Check your balance",
        "B. Make a deposit",
        "C. Make a withdrawal",
        "D. View previous transaction",
        "E. Calculate interest",
        "F. Exit"
    };

    for (String option : options) {
      System.out.println(option);
    }

    System.out.print("\nEnter an option: ");
    String selectedOption = "";
    String nextMessage = "\nWhat would you like to do next? ";

    while (!selectedOption.equals("f")) {

      selectedOption = scanner.nextLine().toLowerCase();

      if (selectedOption.equals("a")) {
        checkBalance();
        System.out.print(nextMessage);
      }

      if (selectedOption.equals("b")) {
        System.out.print("\nHow much gold would you like to deposit? ");
        try {
          int depositAmount = Integer.valueOf(scanner.nextLine());
          makeDeposit(depositAmount);
        } catch (NumberFormatException nonNumber) {
          System.out.println("Sorry, a number is required to make a deposit. Please try again.");
        }
        System.out.print(nextMessage);
      }

      if (selectedOption.equals("c")) {
        System.out.print("\nHow much gold would you like to withdraw? ");
        try {
          int withdrawalAmount = Integer.valueOf(scanner.nextLine());
          makeWithdrawal(withdrawalAmount);
        } catch (NumberFormatException nonNumber) {
          System.out.println("Sorry, a number is required to make a withdrawal. Please try again.");
        }
        System.out.print(nextMessage);
      }

      if (selectedOption.equals("d")) {
        displayPreviousTransaction();
        System.out.print(nextMessage);
      }

    }

    System.out.println("\n\nThank you for banking with Tamriel Bank!");
  }

  public void checkBalance() {
    String checkBalanceMsg = "Your current balance is: " + this.balance + " gold";
    System.out.println("\n" + border);
    System.out.println(checkBalanceMsg);
    System.out.println(border);

    this.previousTransaction = checkBalanceMsg;
  }

  public void makeDeposit(int amount) {
    this.balance += amount;
    System.out.println("\n" + border);
    this.previousTransaction = displayNewBalance();
    System.out.println(border);
  }

  public void makeWithdrawal(int amount) {
    String withdrawalMsg = "";
    if (amount == 0) {
      withdrawalMsg = "Withdrawal amount must be greater than 0. Please try again.";
      System.out.println(withdrawalMsg);
    } else if (this.balance >= amount) {
      this.balance -= amount;
      withdrawalMsg = displayNewBalance();
    } else {
      withdrawalMsg = "Insufficient balance. Please try again.";
      System.out.println(withdrawalMsg);
    }

    this.previousTransaction = withdrawalMsg;
  }

  public String displayNewBalance() {
    String newBalanceMsg = "Your new balance is: " + this.balance + " gold";
    System.out.println(newBalanceMsg);

    return newBalanceMsg;
  }

  public void displayPreviousTransaction() {
    System.out.println(this.previousTransaction);
  }

}
