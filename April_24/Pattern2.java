/*  APPROACH THAT CAN USE FOR BUILDING THE PATTERN LOGIC

      1. FIRST - for the outer loop , count the number of rows.

      2. SECOND - for the inner loop , count the number of columns and connect the column somehow related to the row.

      3. THIRD - print the (*) , inside the inner loop

      4.  RATHER / EXCEPTION   - observe symmetry pattern.

    OUTPUT -   *
               * *
               * * *
               * * * *
 */

public class Pattern2 {
    public static void main(String[] args) {
        pattern2(4);

    }
    static void pattern2(int num){
        for (int row =0; row<=num; row++){
            for (int col=0; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
