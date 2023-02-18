import java.util.*;

public class First_Recursion_Program {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = name(n);
        System.out.println(x);
        sc.close();
    }
    public static int name(int n) {
        if (n==0||n==1) {
            return 1;

        }
        int fact = name(n-1);
        int factn = n*fact;
        return factn;
}
}