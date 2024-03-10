import java.util.Scanner;
 
public class characterpattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();
        char ch;
        for (int i=1; i<=num; i++) {
            ch = 'A';
            for (int j = 1; j <= i; j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}

-------------------------------------------------------
------------------------OUTPUT-------------------------
// enter the number: 7
// A 
// A B 
// A B C 
// A B C D 
// A B C D E 
// A B C D E F 
// A B C D E F G 
