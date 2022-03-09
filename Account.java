public class Account {
  String name;
  String id;

  public Account(String userName, String userId) {
    this.name = userName;
    this.id = userId;
  }

  public void showMenu() {
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

    System.out.println("\nEnter an option: ");
  }
}
