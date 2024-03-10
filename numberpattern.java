import java.util.*;
class Invertedstarpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        for (int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

--------------------------------------------------
// ---------------------OUTPUT-----------------------
// Enter the number: 5
// 1
// 12
// 123
// 1234
// 12345
