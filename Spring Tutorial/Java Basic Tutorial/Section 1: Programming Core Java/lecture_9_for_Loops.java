public class lecture_9_for_Loops {

  public static void main(String[] args) {
    /* 
    for (;;) {
      System.out.println("Hello"); // This is an infinite for loop
    }
    */

    for (int i = 0; i < 5; i++) {
      System.out.println("The value of i is " + i);
    }

    for (int j = 4; j >= 0; j--) {
      System.out.printf("The value of j is %d \n", j); // %d is replaced by value of j in this case. Also since a new line is not entered here after execution, we use the new line character \n
    }
  }
}
/* NOTES:
 * for(initialization statement ; condition ; increment/decrement statement){
 * Body of the loop;
 * }
 * The initialization statement is executed only once for the first time, then the condition is checked, then the body of the loop is executed and finally the loop counter variable is incremented/decremented.
 * from the second iteration, only condition is checked, loop body executed and loop counter incremented/decremented.
 * and so on and on until the condition fails
 */
