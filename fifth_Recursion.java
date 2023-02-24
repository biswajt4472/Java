import java.util.Scanner;
//Printing N Numbers Using Recursion
public class fifth_Recursion {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = sc.nextInt();
        int  i = 1;
        System.out.print("In Ascending Order : ");
        Print(n,i);
        System.out.println();
        System.out.print("In Descending Order : ");
        Print1(n);
        sc.close();
    }
    // in Ascending Order
    public static void Print(int n,int i) {
        if (i == n+1) {
            return;
        }
        System.out.print(i+" ");
        Print(n, i+1);  
    }
//    In descending Order

public static void Print1(int n) {
    if (n == 0) {
        return;
    }
    System.out.print(n+" ");
    Print1(n-1);  
}
}
