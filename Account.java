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
  }
}
