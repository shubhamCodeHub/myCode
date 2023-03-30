/*
 Program to calculate the sum of digits of a number
 */

class sumOfDigits {
  public static void main(String[] args) {
    int inputNumber = 7865;
    int sumOfDigits = 0;
    int temp = 0;

    while (inputNumber > 0) {
      temp = inputNumber % 10; // Extract the last digit from a number
      sumOfDigits += temp;
      inputNumber = inputNumber / 10; // Remove the last digit from a number
    }

    System.out.println("Sum of digits are : " + sumOfDigits);
  }
}
