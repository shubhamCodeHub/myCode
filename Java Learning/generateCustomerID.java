/* The following code generates customer ID as C01, C02, C03, C04, ...... , C09, C10 */

class generateCustomerID {

  public static void main(String[] args) {
    // The below code generates customerId
    int totalNoOfCustomers = 12;
    String customerId = "";

    for (int counter = 1; counter <= totalNoOfCustomers; counter++) {
      if (counter <= 9) {
        customerId = "C0" + counter;
      } else {
        customerId = "C" + counter;
      }
      System.out.println(
        "Customer Id for customer " + counter + " is " + customerId
      );
    }
  }
}
