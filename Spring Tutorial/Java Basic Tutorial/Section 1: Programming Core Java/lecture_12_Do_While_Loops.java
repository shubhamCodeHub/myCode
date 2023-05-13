import java.util.Scanner;

public class lecture_12_Do_While_Loops {

  public static void main(String[] args) {
    // Program to keep asking the user to enter a number until they have entered the number 5
    Scanner input = new Scanner(System.in);
    /*
    System.out.println("Enter a number");
    int value = input.nextInt();
    
    while (value != 5) {
      System.out.println("Enter a number");
      value = input.nextInt();
    }
    */

    int value = 0;
    do {
      System.out.println("Enter a number");
      value = input.nextInt(); // Value is declared outside the loop so that we can use value in the condition, if we would have declared value inside the do block, the value in while would throw error
    } while (value != 5);

    System.out.println("Got 5 !!");
  }
}
/* NOTES:
 * 1. The do while loop is used when u need to execute the loop atleast once.
 * 2. Do while loop is an exit controlled loop.
 * 3. A variable exits only within its scope {-------} i.e. within its curly brackets.
 */
