
import java.util.*;
public class BubbleSort {

    public static void printArray(int arr[],int n) {
        for(int i=0; i<n; i++) {
              System.out.print(arr[i]+" ");
        }
           System.out.println();
        }
    
    
    public static void main(String args[]) {
        int arr[] = new int [150];
        int n;
        System.out.print("Enter The Size Of The Array Between 0-150 : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(10);
        //    inserstion
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); 
        }
           //bubble sort
        for(int i=0; i< n-1; i++) {
            for(int j=0; j< n-i-1; j++) {
              if(arr[j] > arr[j+1]) {
                       //swap
               int temp = arr[j];
               arr[j] = arr[j+1];
               arr[j+1] = temp;
           }
        }
     }
    
    
     printArray(arr,n);
     sc.close();
    }
  
}
