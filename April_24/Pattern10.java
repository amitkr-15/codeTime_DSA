/*  APPROACH THAT CAN USE FOR BUILDING THE PATTERN LOGIC

      1. FIRST - for the outer loop , count the number of rows.

      2. SECOND - for the inner loop , count the number of columns and connect the column somehow related to the row.

      3. THIRD - print the (*) , inside the inner loop

      4.  RATHER / EXCEPTION   - observe symmetry pattern.

    OUTPUT -
                     *
                     **
                     ***
                     ****
                     *****
                     ******
                     *****
                     ****
                     ***
                     **
                     *

 */
public class Pattern10 {
    public static void main(String[] args) {
        pattern10(5);
    }

    static  void pattern10( int num ){



        for (int row = 1; row <= 2 * num - 1 ; row++) {

            //  stars is equal to the row . if row is 1 , then star is also one
            int stars = row ;

            // condition for after the symmetry pattern done , to print the stars
            if( row > num){
                stars = 2 * num - row ;
            }

            for (int col = 1; col <= stars ; col++) { // why taking stars ? - bcz to print the start after the  symmetry pattern
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
