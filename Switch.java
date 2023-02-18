import java.util.Scanner;

public class Switch {
    public static void main(String args[]) {
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a&b);
        System.out.println(a+b);
        switch (a) {
            case 1:
                System.out.println("Hello it's a case 1");
                break;
            case 2:
                System.out.println("Hello it's a case 2");
                break;
            case 3:
                System.out.println("Hello it's a case 3");
                break;
            case 4:
                System.out.println("Hello it's a case 4");
                break;
                

        
            default:System.out.println("Hello it's a default case");
                break;

        }
        if (a%2==0) {
            System.out.println("en");
            }else{
            System.out.println("od");
        }
        sc.close();

    }
}
