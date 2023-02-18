import java.util.*;


public class Binary_Search {
    
    public static void main(String[] args) {
        int size;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter The Size Of An Array : ");
        size = obj.nextInt();
        System.out.println("Enter The Element's Of The Array :  ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = obj.nextInt();
        }
        int k = 0;
        System.out.println("Enter The Searched Element : " );
        int x = obj.nextInt();
        int mid;
        int low = 0;
        
       int high = size-1;
         while (low<high) {
            mid = (low+high)/2;
            if (arr[mid]==x) {
                k++;
                System.out.println("Entered Element Is Fount At Index : " + mid);
                break;
            }
            if (arr[mid]>x) {
                high = mid;
            }
            if (arr[mid]<x) {
                low = mid;
            }
        
    }
    if (k==0) {
        System.out.println("Searched Element Is Not Found");
    }        
    obj.close();
    }
}
