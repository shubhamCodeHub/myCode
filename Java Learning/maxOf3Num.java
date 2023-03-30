public class maxOf3Num {
  public static void main(String[] args) {
    int num1 = 3, num2 = 4, num3 = 1;
    int max;
    // int tempMax = 0;

    if (num1 > num2) {
      // tempMax = num1;

      if (num1 > num3) {
        max = num1;
      } else {
        max = num3;
      }
    } else {
      // tempMax=num2;

      if (num2 > num3) {
        max = num2;
      } else {
        max = num3;
      }
    }

    System.out.println("The maximum is " + max);

  }
}
