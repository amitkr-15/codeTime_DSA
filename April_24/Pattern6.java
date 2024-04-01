/*  APPROACH THAT CAN USE FOR BUILDING THE PATTERN LOGIC

      1. FIRST - for the outer loop , count the number of rows.

      2. SECOND - for the inner loop , count the number of columns and connect the column somehow related to the row.

      3. THIRD - print the (*) , inside the inner loop

      4.  RATHER / EXCEPTION   - observe symmetry pattern.

    OUTPUT - 1 2 3 4 5
             1 2 3 4
             1 2 3
             1 2
             1
 */
public class Pattern6 {
    public static void main(String[] args) {
        pattern6(5);
    }
    static void pattern6(int num){
        // PTR -for printing the number , we can start index from 1.
        for (int row = 1 ; row <= num ; row++){
            for (int col = 1 ; col <= num - row +1 ; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
