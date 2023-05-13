public class lecture_10_if {

  public static void main(String[] args) {
    boolean cond = (5 == 5); // = is the assignment operator, == is used to compare equality
    System.out.println(cond);

    // 1st variation of if statement
    int myInt = 10;
    if (myInt < 20) {
      System.out.println("Yes! it is true"); // Block is executed when condition is true
    }

    // 2nd variation of if statement
    int myInt2 = 20;
    if (myInt2 < 10) {
      System.out.println("Yes, its true!"); // Block is executed when condition of if is true
    } else {
      System.out.println("No, its false!"); // Block is executed when condition of if is false
    }

    // 3rd variation of if statement
    int myInt3 = 30;
    if (myInt3 < 10) {
      System.out.println("Hurrah !!"); // Block is executed when condition of if is true
    } else if (myInt3 > 20) {
      System.out.println("YEAH !!"); // Block is executed when condition of if is false and condition of else if is true
    } else {
      System.out.println("YOO !!"); // Block is executed when condition of if is false and condition of else if is false
    }

    // break statement
    int loop = 0;
    while (true) {
      // This would ideally have been an infinite loop but due to break it stops at 5
      System.out.println("Looping :" + loop);

      if (loop == 5) {
        break; // Breaks out of immediate loop in which it is written
      }
      loop++;
      System.out.println("Loop is Running");
    }
  }
}
/* NOTES:
 * 1. The else if and else parts are optional in if statement. The if statement can come alone but else if and else will only come with if statement.
 *
 * 2. if both the if and else if conditions are satisfied, only the if is executed and compiler ignores the else if.
 *
 * 3. else statement should come at last for if - else if block
 *
 * 4. There can be multiple else if in the if - else if - else block, but if statement and else statement comes only once per block.
 *
 * 5. The break statement will break out of the immediate loop in which it is present. The loop execution is stopped after encountering the break statement.
 */
