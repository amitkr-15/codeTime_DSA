/*  APPROACH THAT CAN USE FOR BUILDING THE PATTERN LOGIC

      1. FIRST - for the outer loop , count the number of rows.

      2. SECOND - for the inner loop , count the number of columns and connect the column somehow related to the row.

      3. THIRD - print the (*) , inside the inner loop

      4.  RATHER / EXCEPTION   - observe symmetry pattern.

    OUTPUT -
                    *********
                     *******
                      *****
                       ***
                        *

 */
public class Pattern8 {
    public static void main(String[] args) {
        pattern8(5);
    }
    static void pattern8( int num ){
        // loop for the outer rows
        for (int row = 0; row < num ; row++) {

            // for the space
            for (int col = 0; col < row ; col++) {
                System.out.print(" ");
            }
            // for the stars
            for (int col = 0; col < 2 * ( num -  row ) - 1  ; col++) {
                System.out.print("*");
            }

            // for the space
            for (int col = 0; col < row ; col++) {
                System.out.print(" ");
            }
            System.out.println();

        }
    }
}
