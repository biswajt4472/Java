import java.util.Scanner;

public class Third_Recursion {
    public static void main(String[] args) {
        int n;
        Scanner sc  = new Scanner(System.in);
        n = sc.nextInt();
        int a = 1;
        name(n,a);
        sc.close();
    }

    public static int  name(int n,int a) {
        if (n==0 ) {
            return 0;
        }
        // int a=0;
        // a  += 1;
        System.out.println(a);
        
        name(n-1,a+1);

        return 0;
    }
}
