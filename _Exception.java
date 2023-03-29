//throws Declaration By Using Throwable class
class ArgumentException2 extends Throwable{
    ArgumentException2(String msg)throws ArgumentException2 {
       super(msg);
   }    
}
//throws Declaration By Using Exception class
class ArgumentException1 extends Exception{
    ArgumentException1(String msg)throws ArgumentException1  {
       super(msg);
   }    
}
//throws Declaration By Using RuntimeException class
 class ArgumentException extends RuntimeException{
     ArgumentException(String msg)throws ArgumentException  {
        super(msg);
    }    
}
public class Throws_Throw {
   
    public static void main(String[] args) throws Exception  {
        int arr [] = {1,2,3,4,5,6};
              //Example Throws Keyword 
        for (int i = 0; i <= arr.length; i++){
            try {
                if (i> arr.length-1) {
                    throw new ArgumentException2("There Is No Space .......");
                }
                System.out.println("\t"+arr[i]);
            } catch (Exception e) {
                System.out.println(e);
            } catch (ArgumentException2 e) {
                System.out.println(e);
            }
        }
        // Example Of Throw Key Word To Throw An Exception Defined by user
        for (int i = 0; i <= arr.length; i++){
            try {
                if (i> arr.length-1) {
                    throw new Exception ("The Error Of Having No Space.........");
                }
                System.out.println("\t"+arr[i]);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        // For Try And  Catch Block Execution..........
        for(int i = 0;i<5;i++)
        try {
            System.out.println(i/i);
        }
        catch (Exception e) {
            System.out.println("Got An Error At First Place...........");
        }
        //For Finally Block Execution  ........
        try {
            int a = 12/0;
        }
        // Not Handelling The Exception Statement
        finally{System.out.println("Doesn't Depends Upon The Condition");};
        System.out.println("Hello Word");
    }
}




  