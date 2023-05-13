public class lecture_16_Multi_dimensional_array {

  public static void main(String[] args) {
    /* This is a single dimensional array */
    int[] values = { 3, 5, 10 };
    System.out.println(values[2]);

    /* This is a multi-dimensional array */
    int[][] grid = { { 1, 2, 3, 4 }, { 5, 6, 7 }, { 7, 8, 9, 10 } };

    System.out.println(grid[0][2]); // should print 3
    System.out.println(grid[2][1]); // should print 8

    /* This is also a multi dimensional array declaration */
    String[][] texts = new String[2][3];
    texts[0][1] = "Hellow There";

    System.out.println(texts[0][1]);

    /* Method to parse through elements of an multi-dimensional array */
    for (int row = 0; row < grid.length; row++) {
      // grid.length gives length of outer array i.e. 3

      for (int col = 0; col < grid[row].length; col++) {
        // grid[row].length returns the length of each of the inner subarrays, when it is being parsed by the outer loop
        System.out.println(grid[row][col] + "\t"); // \t is a special character for tab space
      }
      System.out.println(); // gives a line space after each subarray parsing is complete
    }
  }
}
/* NOTES
 * Multi - dimensional arrays is basically array of arrays
 */
