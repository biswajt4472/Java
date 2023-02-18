import java.util.Scanner;


public class Addition_of_Rows_Of_Given_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Rows Of The Of Matrix  : ");
        int m = sc.nextInt();
        System.out.println("Enter The Column Of The Of Matrix  : ");
        int n = sc. nextInt();
        int arr [][] = new int [m][n];
        System.out.println("Enter The Elements Of The Of First Matrix  : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Given Matrix Is ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+ " "); 
            }
            System.out.println();
        }
        
        for (int i = 0; i < m ; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum = sum + arr[i][j];
            }
            System.out.println( "sum of "+(i+1)+" row is :  " + sum);
        }
        // System.out.println(sum);
        sc.close();
    }
}
