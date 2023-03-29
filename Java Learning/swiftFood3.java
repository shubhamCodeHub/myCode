/*
 * When a customer places an order, the total cost varies according to the customer type. The customer type must be either Regular or Guest. For other values, the program should display an error message. This can be represented using if-else-if statements as shown below.
 */

public class swiftFood3 {

  public static void main(String[] args) {
    String customerType = "Regular";
    int quantity = 4, unitPrice = 10, discount = 5, deliveryCharge = 5;

    int totalCost = unitPrice * quantity;

    if (customerType == "Regular") {

      totalCost = totalCost - (totalCost * discount / 100);
      System.out.println("You are a regular customer and eligible for 5% discount");
      System.out.println("The total cost to be paid is " + totalCost);

    } else if (customerType == "Guest") {

      totalCost = totalCost + deliveryCharge;
      System.out.println("You need to pay an additional delivery charge of Rs 5");
      System.out.println("The total cost to be paid is" + totalCost);

    } else // If there is only one statement inside a block, {} is optional
      System.out.println("Invalid customer type");
  }

}
