import java.util.Scanner;

public class Account {
  String name;
  String id;
  int balance;

  public Account(String userName, String userId) {
    this.name = userName;
    this.id = userId;
    this.balance = 100;
  }

  public void showMenu() {
    Scanner scanner = new Scanner(System.in);
    String border = "\n**********\n";

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
    String selectedOption = scanner.nextLine().toLowerCase();

    if (selectedOption.equals("a")) {
      System.out.println(border);
      checkBalance();
      System.out.println(border);
    }

  }

  public void checkBalance() {
    System.out.println("Your current balance is: " + this.balance + " gold");
  }

}
