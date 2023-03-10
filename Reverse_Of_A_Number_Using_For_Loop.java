import java.util.Scanner;

public class Reverse_Of_A_Number_Using_For_Loop {
    public static void main(String[] args) {
        int  r=0 ;
        System.out.print("Enter A Number : ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        
        for ( int i = n; i >0; i=i/10) {
            int k = i%10;
            r = (r*10)+k;
        }
        
        System.out.println( "Reverse Of Given Number : "+r);
        sc.close();
    }
}
// OR 
/*import java.util.Scanner;

public class Reverse_Of_A_Number_Using_For_Loop {
    public static void main(String[] args) {
        int  r=0 ;
        System.out.print("Enter A Number : ");
        Scanner sc = new Scanner (System.in);
        for ( int i = sc.nextInt(); i >0; i=i/10) {
            int k = i%10;
            r = (r*10)+k;
        }
        
        System.out.println( " Reverse Of Given Number : "+r);
        sc.close();
    }
} */
