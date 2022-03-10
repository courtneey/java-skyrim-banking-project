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
    String border = "\n**********\n";
    String nextMessage = "\nWhat would you like to do next? ";

    while (!selectedOption.equals("f")) {

      selectedOption = scanner.nextLine().toLowerCase();

      System.out.println("\n" + border);

      if (selectedOption.equals("a")) {
        checkBalance();
      }

      System.out.println(border);
      System.out.print(nextMessage);
    }

    System.out.println("\n\nThank you for banking with Tamriel Bank!");
  }

  public void checkBalance() {
    System.out.println("Your current balance is: " + this.balance + " gold");
  }

}
