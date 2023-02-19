import java.util.Scanner;

public class Febonacci_Number { 
    public static void Calafeb(int n,int a,int b){
        if(n==0){
            return;
        }
        int c =   a+b;
        System.err.println(c);
        Calafeb(n-1, b, c);
    }
    public static void main(String[] args) {
        int a  = 0;int x,b = 1 ;
        Scanner sc  = new Scanner(System.in);
        x = sc.nextInt();
        System.err.println(a+"\n"+b);
        Calafeb(x-2, a, b);
        sc.close();
    }
}
