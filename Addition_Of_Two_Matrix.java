import java.util.Scanner;

public class Addition_Of_Two_Matrix {
    public static void main(String[] args) {
        int m,n;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter The Rows Of A Matrix : ");
        m = sc.nextInt();
        System.out.println("Enter The Column Of A Matrix : ");
        n = sc.nextInt();
        int A [][] =new int [m][n];
        int B [][] =new int [m][n];
        int C [][] =new int [m][n];
        System.out.println("Enter The Element Of The First Matrix : ");
        for (int i = 0; i < m; i++) { 
           for (int j = 0; j < n; j++) {
            A[i][j] = sc.nextInt();
           }
        }
        System.out.println("First Matrix Is : ");

        for (int i = 0; i < m; i++) { 
            for (int j = 0; j < n; j++) {
            System.out.print(A[i][j]+" ");
            }
            System.out.println();
         }

         System.out.println("Enter The Element Of The Second Matrix : ");
        for (int i = 0; i < m; i++) { 
            for (int j = 0; j < n; j++) {
             B[i][j] = sc.nextInt();
            }
        }
        System.out.println("Second Matrix Is : ");
        for (int i = 0; i < m; i++) { 
            for (int j = 0; j < n; j++) {
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
         }
         for (int i = 0; i < m; i++) { 
            for (int j = 0; j < n; j++) {
             C[i][j] = A[i][j]+B[i][j];
            }
         }
         System.out.println("Addition Of Given Two Matrix Is : ");
         for (int i = 0; i < m; i++) { 
            for (int j = 0; j < n; j++) {
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
         }
         sc.close();
    }
}
