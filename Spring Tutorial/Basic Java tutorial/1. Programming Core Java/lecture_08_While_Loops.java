public class lecture_8_While_Loops {

  public static void main(String[] args) {
    int value = 0;
    while (value < 10) {
      // The set of statements under {----} is executed repeatedly until condition is true
      System.out.println("Hello " + value);
      value = value + 1;
    }
    /* 
    while (value < 10) {
      // This is an infinite never ending loop as the condition will always evaluate to true
      System.out.println("Hello " + value);
    }
    */
  }
}
/* NOTES:
 * Loops are used to execute a set of statements repeatedly
 */
