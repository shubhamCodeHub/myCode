import java.util.Scanner;

public class lecture_11_Getting_user_input {

  public static void main(String[] args) {
    // Create Scanner object
    Scanner input = new Scanner(System.in);

    // PART 1: For string --------------------------------------------------
    // Output the prompt
    System.out.println("Enter a line of text: ");

    // Wait for the user to enter the line of text
    String line = input.nextLine();

    // Tell them what they entered
    System.out.println("You entered: " + line);

    // PART 2: For integer -----------------------------------------------------
    // Output the prompt
    System.out.println("Enter a number: ");

    // Wait for the user to enter a number
    int value = input.nextInt();

    // Tell them what they entered
    System.out.println("You entered: " + value);

    // PART 3: For floating point numbers --------------------------------------------------
    // Output the prompt
    System.out.println("Enter a floating point number: ");

    // Wait for the user to enter a number
    double value1 = input.nextDouble();

    // Tell them what they entered
    System.out.println("You entered: " + value1);
  }
}
/* NOTES:
 * Call the respective type method constructor, whose value you are taking input
 */
