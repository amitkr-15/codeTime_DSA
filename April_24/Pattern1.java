 /*  APPROACH THAT CAN USE FOR BUILDING THE PATTERN LOGIC

       1. FIRST - for the outer loop , count the number of rows.

       2. SECOND - for the inner loop , count the number of columns and connect the column somehow related to the row.

       3. THIRD - print the (*) , inside the inner loop

       4.  RATHER / EXCEPTION   - observe symmetry pattern.

     OUTPUT -   * * * *
                * * * *
                * * * *
                * * * *
  */
public class Pattern1 {
    public static void main(String[] args) {
        pattern1(4);

    }
    static void pattern1(int  num){
        for (int row = 0 ; row <=num; row++ ){
            // for every row , run the col
            for (int col= 0; col<=num; col++){
                System.out.print("* ");
            }
            // when one row is printed , we need to add a newline
            System.out.println();
        }

    }

}
