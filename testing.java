import java.util.Scanner;

public class testing {


    public static void main(String[] args) {
        int i,n,j;

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Base Number : ");
        n=input.nextInt();
        for (i=1;i<=n;i++) {
            for (j = n; j <= i; j--) {
                System.out.println("*");
            }
            System.out.println("**");
        }
    }
}