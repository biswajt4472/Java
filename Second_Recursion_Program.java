
import java.util.*;
public class Second_Recursion_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = name(n-1);
        System.out.println(x);
        sc.close();
    }
    public static int name(int n) {
        if (n==0) {
            return 0;

        }
        if (n==1) {
            return 1;
        }
        
        int fact = name(n-2);
        int factn = name(n-1);
        int feb = fact+factn;
        return feb;

    }
}
