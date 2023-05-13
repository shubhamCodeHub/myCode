public class lecture_14_Arrays {

  public static void main(String[] args) {
    int value = 7;

    int[] values; // Array declaration type 1
    values = new int[3];

    System.out.println(values[0]);

    values[0] = 10; // Method to access the elements of an array
    values[1] = 20;
    values[2] = 30;

    System.out.println(values[0]);
    System.out.println(values[1]);
    System.out.println(values[2]);

    for (int i = 0; i < values.length; i++) {
      System.out.println(values[i]);
    }

    int[] numbers = { 5, 6, 7 }; // Array declaration type 2

    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }
  }
}
/* NOTES:
 1. value is of value type
 2. values is of reference type. Its just an empty object where we assign memory using new operator and specify number of values it will contain using int[3]. 
 3. The size of an array is found using array_name.length.
 4. Array is a collection of similar objects.

 */
