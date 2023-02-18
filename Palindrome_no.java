import java.util.Scanner;

public class Palindrome_no {
    public static void main(String[] args) {
        int n,r,sum = 0;
        System.out.print("Enter A Number : ");
        Scanner sc  = new Scanner(System.in);
        n = sc.nextInt(10);
        sc.close();
        // String dc = null;
        int a = n;
        // printf("Palindromic No. Of The Given No Is  : %d",n);
        while (n>0)
        {
            r = n%10;
            
            // String sd  =  Integer.toString(r);
            // dc = sd;
            sum = sum*10+r;
            n = n/10;
        }
        if (sum == a)
        {
           System.out.println("It Is A Palindrome No.  ");
        }else
        {
            System.out.println("Not A Palindrome No.");
        }
        // System.out.println(dc);
        
    }
}
