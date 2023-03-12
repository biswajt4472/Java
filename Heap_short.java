import java.util.Scanner;

public class Heap_short {
    public static int parent(int i) {
        return i/2;
    }

    public static int left(int i){

        return (2*i);
    }
    public static int right(int i) {
        return (2*i+1);
    }
    public static void Build_heap(int arr[],int n) {
        for (int i = (n-1)/2; i >0; i--) {
            Hepify(arr, i, n);
        }
    }
    public static void Hepify(int arr[],int i,int n) {
        int l,r,large,temp;
        l = left(i);
        r = right(i);
        if ((l<=n-1) && (arr[l]>arr[i])) {
            large = l;
        }else{
            large = i;
        }
        if ((r<=n-1)&&(arr[r]>arr[large])) {
            large = r;
        }
        if (large != i) {
            temp  = arr[i];
            arr[i] = arr[large];
            arr[large] = temp;Hepify(arr, large, n);
        }
    }
    public static void  Max_heap1(int arr[],int n){
        int m,temp;
        Build_heap(arr, n);
        m = n;
        for (int j = n-1; j >=1; j--) {
            temp = arr[1];
            arr[1]= arr[j];
            arr[j] = temp;
            m = m-1;
            Hepify(arr,1,m);

        }
    }
    
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size Of An Array Add By 1 : ");
        n = sc.nextInt();
        int arr [] = new int[n];
        
        for (int i = 1; i <n ; i++) {
            System.out.print("Enter "+ i +" No . Elements Of The Array : ");
            arr[i] = sc.nextInt();
        }
        Max_heap1(arr,n);
        System.out.print("Shorted Array Is  :");
        for (int i = 1; i <n; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
