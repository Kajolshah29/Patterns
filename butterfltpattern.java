import java.util.Scanner;
 
public class butterflypattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows");
        int num = sc.nextInt();

        //Printing the upper half of the pattern
        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            for (int j = 1; j <= 2*(num-i); j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            } 
            System.out.println();
        }
      
        //Printing the lower half of the pattern 
        for (int i = num-1; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            for (int j = 1; j <= 2*(num-i); j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

-----------------------------------------------
------------------OUTPUT-----------------------
// Enter the number of rows 4
// *             * 
// * *         * * 
// * * *     * * * 
// * * * * * * * * 
// * * *     * * * 
// * *         * * 
// *             * 
