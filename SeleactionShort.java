import java.util.Scanner;

// import javax.swing.plaf.synth.SynthSpinnerUI;

/**
 * Try_6
 */
public class SeleactionShort {
  public static void main(String[] args) {
    int arr[] = new int [100];
    int n;
    Scanner sc  = new Scanner(System.in);
    System.out.println("Enter Size Of The Array Between 0-100 : ");
    n = sc.nextInt(10);
    System.out.println(arr.length);
    for (int i = 0; i <= n-1; i++) {
      arr[i]  = sc.nextInt();
    }

   for (int i = 0; i < n-1; i++) {
      int smallest = i;
      for (int j = i+1; j < n; j++) {
        if(arr[smallest] >arr[j]){
          smallest = j;
        }
       }
       int temp = arr[smallest];
       arr [smallest] = arr[i];
       arr[i] = temp;

   }

   for (int i = 0; i < n; i++) {
    System.out.println(arr[i]);
   }
sc.close();
  }
}
