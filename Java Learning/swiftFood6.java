/*
 Let an order should be placed for multiple food items and the number of food items to be ordered is not known at the beginning. If the user wants to order an additional food item, the process of accepting the food item, quantity and calculation of the total amount is repeated whenever the order is placed. 

In the below code, wantToAddFoodItem is initialized to 'Y'. The condition of while loop evaluates to true, so, the statements inside the loop get executed, i.e., the total cost of the order is calculated. The customer is then asked if he/she wants to add one more food item. If the customer provides the input as 'Y', then the condition evaluates to true and the statements inside the loop are executed again and again. If the input is 'N', the flow of control goes out of the loop. 
 */

//Importing the Scanner class
import java.util.Scanner;

public class swiftFood6 {
  public static void main(String[] args) {
    // Create a Scanner object
    Scanner sc = new Scanner(System.in);
    int totalCost = 0;
    char wantToAddFoodItem = 'Y';
    int unitPrice = 10;
    int quantity = 1;

    while (wantToAddFoodItem == 'Y' || wantToAddFoodItem == 'y') {
      totalCost = totalCost + (quantity * unitPrice);
      System.out.println("Order placed successfully");
      System.out.println("Total cost: " + totalCost);
      System.out.println("Do you want to add more food items to your order? Y or N");
      String input = sc.next(); // Accepting input from the customer
      // Extracting first character from the input string
      wantToAddFoodItem = input.charAt(0);
    }
  }
}
