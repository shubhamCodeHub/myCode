/*
 *In the below example, the food item ordered gets displayed. If the ordered food is anything other than Burger, Pizza and Sandwich, then a message, 'Invalid selection' is displayed from default case.
 */
public class swiftFood5 {

  public static void main(String[] args) {
    String orderedFood = "Pizza";

    switch (orderedFood) {
      case "Burger":
        System.out.println("You have ordered Burger. Unit price: Rs 10");
        break;
      case "Pizza":
        System.out.println("You have ordered Pizza. Unit price: Rs 15");
        break;
      case "Sandwich":
        System.out.println("You have ordered Sandwich. Unit price: Rs 8");
        break;
      default:
        System.out.println("Invalid selection");
    }
  }

}
