/*  APPROACH THAT CAN USE FOR BUILDING THE PATTERN LOGIC

      1. FIRST - for the outer loop , count the number of rows.

      2. SECOND - for the inner loop , count the number of columns and connect the column somehow related to the row.

      3. THIRD - print the (*) , inside the inner loop

      4.  RATHER / EXCEPTION   - observe symmetry pattern.

    OUTPUT -   1
               2 2 
               3 3 3
 */
public class Pattern4 {
    public static void main(String[] args) {
        pattern4(5);
    }
    static void  pattern4(int num){
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
