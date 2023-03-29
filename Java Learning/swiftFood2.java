/*
 * In the below code, we are calculating the total cost that the customers should pay for the order. In the previous example, we considered only Regular customers. Now for the non-regular customers, they have to pay an additional delivery charge of Rs 5. So, first the customer type is checked. If the customer type is Regular, then the if block gets executed. For other types of customers, the statements of else block get executed. 
 */

public class swiftFood2 {

  public static void main(String[] args) {
    String customerType = "Non-Regular";
    int quantity = 2, unitPrice = 10, totalCost = 0, discount = 5, deliveryCharge = 5;

    totalCost = unitPrice * quantity;

    if (customerType == "Regular") {
      totalCost = totalCost - (totalCost * discount / 100);
      System.out.println("You are a regular customer and eligible for 5% discount");
    } else {
      totalCost = totalCost + deliveryCharge;
      System.out.println("You need to pay an additional delivery charge of Rs 5");
    }

    System.out.println("Total cost: " + totalCost);
  }

}
