import java.util.*;
public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter The Size Of Aray");
        int size = sc.nextInt();
        int arary[] = new int[size];
        System.out.println("Enter Thye Aray Elemetnts");

        for (int i = 0; i < size; i++) {
            arary[i] = sc.nextInt();
        }

        
        System.out.println("Enter The NUmber You Want To FInd");

        int k = sc.nextInt();
        int j = 0;
        sc.close();

        for (int i = 0; i < size; i++) {
            if (arary[i] == k) {
                System.out.println("Present in "+i+" Index");
                j ++;
            }
        }
        if (j==0) {
            System.out.println("Entered Number IS Not Present in The Aray");
        }
       
    
     sc.close();
    }
    
}

