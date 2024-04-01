/*  APPROACH THAT CAN USE FOR BUILDING THE PATTERN LOGIC

      1. FIRST - for the outer loop , count the number of rows.

      2. SECOND - for the inner loop , count the number of columns and connect the column somehow related to the row.

      3. THIRD - print the (*) , inside the inner loop

      4.  RATHER / EXCEPTION   - observe symmetry pattern.

    OUTPUT -            *
                       ***
                      *****
                     *******
                    *********
 */
public class Pattern7 {
    public static void main(String[] args) {
        // Here, we have taken the value of N as 5.
        // We can also take input from the user.
        int num = 5;
        pattern7(num);
    }
    static void pattern7(int num){
        // This is for the outer loop which will loop for the rows.
        for (int row = 0; row < num ; row++) {


            // For the spaces before the stars in each row
            for (int col = 0; col < num - row - 1; col++) {
                System.out.print(" ");
            }
                // for the stars
                for (int col = 0; col < 2 * row + 1; col++) {
                    System.out.print("*");
                }

              // For the spaces after the stars in each row
                for (int col = 0; col < num - row - 1; col++) {
                   System.out.print(" ");
               }
            // As soon as the stars for each iteration are printed, we move to the
            // next row and give a line break otherwise all stars
            // would get printed in 1 line.

            System.out.println();
        }

    }
}
