/*  APPROACH THAT CAN USE FOR BUILDING THE PATTERN LOGIC

      1. FIRST - for the outer loop , count the number of rows.

      2. SECOND - for the inner loop , count the number of columns and connect the column somehow related to the row.

      3. THIRD - print the (*) , inside the inner loop

      4.  RATHER / EXCEPTION   - observe symmetry pattern.

    OUTPUT -    1
                0 1
                1 0 1
                0 1 0 1
                1 0 1 0 1
 */
public class Pattern11 {
    public static void main(String[] args) {
        pattern11(5);
    }
    static void pattern11( int num ){
        // First row starts by printing a single 1.
        int start = 1  ;

        for (int row = 0; row < num ; row++) {

            // if the row index is even then 1 is printed first
            // in that row.
            if( row % 2 == 0 ){
                start = 1 ;
            }
            else {
                start = 0;
            }
            // We alternatively print 1's and 0's in each row by using
            // the inner for loop.
            for (int col = 0; col <= row ; col++) {

                System.out.print(start + " ");
                start = 1 -start ;
            }
            System.out.println();
        }
    }
}
