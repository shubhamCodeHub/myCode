import java.util.Scanner;

public class lecture_13_Switch {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a command: Start / Stop");
    String text = input.nextLine();

    switch (text) {
      case "Start":
        System.out.println("System started"); // case can only have constants, not variables.
        break;
      case "Stop":
        System.out.println("Machine stopped");
        break;
      default:
        System.out.println("Command not recognized");
    }
  }
}
