import java.util.Scanner;

public class Fourth_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,n=sc.nextInt();
       x = sum(n);
       System.err.println(x);
    }
    public static int sum(int n) {
        if (n==0) {
            System.out.println("0");
            return 0 ;
        }
        if (n==1) {
            return 1;
        }
        int sum = sum(n-1);
        int sumn = sum+n;
        return sumn;
    }
}
