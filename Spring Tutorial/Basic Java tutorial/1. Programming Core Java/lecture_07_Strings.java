public class lecture_7_Strings {

  public static void main(String[] args) {
    String text = "Hello"; // String is a non-primitive data type and used to hold lines of text
    String space = " ";
    String name = "Shubham";

    String greeting = text + space + name; // to concatenate or join two or more strings, we use + operator

    System.out.println(greeting);

    System.out.println("Hello" + " " + "Shubham");

    int myInteger = 7;
    System.out.println("My Integer is : " + myInteger);

    double myDouble = 7.1;
    System.out.println(
      "My double is : " + myDouble + " and i have put the number between text"
    );
  }
}
/* NOTES:
 * String is the 1st non-primitive data type we have studied.
 * To concatenate or join two or more strings, we use + operator.
 */
