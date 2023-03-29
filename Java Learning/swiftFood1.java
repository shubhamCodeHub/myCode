/*
 * While ordering food in "SwiftFood", when a customer orders food items, we need to calculate the total cost that the customer should pay for the order. 
 * The "Regular Customers" are provided with a 5% discount for their orders. 
 * Here, we assume that each food item costs Rs 10. In the condition, we are checking if the customer type is "Regular". 
 * If the condition is true, the statements within the if block get executed to calculate total cost after discount. 
 */

public class swiftFood1 {
  public static void main(String[] args) {
    String customerType = "Regular";
    int quantity = 2, unitPrice = 10, totalCost = 0, discount = 5;

    totalCost = unitPrice * quantity;

    if (customerType == "Regular") {
      totalCost = totalCost - (totalCost * discount / 100);
      System.out.println("You are a regular customer and eligible for 5% discount");
    }
    System.out.println("Total cost: " + totalCost);
  }
}
