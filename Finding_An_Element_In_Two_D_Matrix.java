import java.util.Scanner;


public class Finding_An_Element_In_Two_D_Matrix {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter The Row NO. Of A Matrix  : ");
        int m = sc.nextInt();
        System.out.print("Enter The Col NO. Of A Matrix : ");
        int  n  = sc.nextInt();
        System.out.println("Enter The Elements Of The Martix");
        int [][]arr = new int [m][n];
        // A Program To Input a Matrix 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // A Program To Output a Matrix 
        System.out.println("Matrix Based On The Given Element Is : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter The No You Want To Find : ");
        int k = sc.nextInt();
        // A Program To Find A Value From a Matrix And It's Position In Index No. 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == k ){
                    System.out.println(k + " Is Found At Index : [" + i + "][" + j +"]");
                }
            }
        }
        sc.close();
       
    }
}

