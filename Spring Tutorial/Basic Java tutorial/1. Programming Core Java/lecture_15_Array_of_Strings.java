public class lecture_15_Array_of_Strings {

  public static void main(String[] args) {
    String[] words = new String[3]; // Declaring a string variable
    words[0] = "Hello";
    words[1] = "to";
    words[2] = "you";

    System.out.println(words[0]);
    System.out.println(
      "-----------------------------------------------------------"
    );

    String[] fruits = { "apple", "banana", "orange", "mango" };

    for (String fruit : fruits) {
      System.out.println(fruit); // This is foreach loop in java, it iterates through the entire array fruits and stops
    }

    int value = 1; // here block of 32 bits memory is reserved for int type and named value. 1 is stored in it.
    String name; // Since string is non primitive data type, name basically points to a reference in memory. There is no specific memory reserved at this stage.
    name = "Shubham"; // at this step, memory is reserved and Shubham is kept in it
    System.out.println(name);

    /* Similarly for arrays */
    String[] names = new String[2];
    //names[0] = "ABC";
    System.out.println(names[0]); // for string of arrays, the default value is null. But for individual string, default value concept is not applicable, it must be initialized before using it.
  }
}
/* NOTES:
 *
 */
