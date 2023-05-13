public class lecture_6_using_Variables {

  public static void main(String[] args) {
    int myNumber; // Declaring a variable
    myNumber = 88; // Initializing a variable
    System.out.println(myNumber);

    int myInteger = 1; // Declaring and initializing a variable at the same time , 32 bit whole number
    short myShort = 10; // 16 bit whole number
    byte myByte = 20; // 8 bit whole number
    long myLong = 1000L; // 64 bit whole number, suffix l/L

    double myDouble = 10.5; // 64 bit floating point number
    float myFloat = 18.5F; // 32 bit floating point number

    char myChar = 'Y'; // unicode character

    boolean myBoolean = true; // boolean variable

    // Printing the variables
    System.out.println(myInteger);
    System.out.println(myShort);
    System.out.println(myByte);
    System.out.println(myLong);
    System.out.println(myDouble);
    System.out.println(myFloat);
    System.out.println(myChar);
    System.out.println(myBoolean);
  }
}
/* NOTES:
 * These are the 8 primitive data types.
 * Variables are just like boxes which can hold values
 */
