//Using Super Key Word In Instance Variable
class InnerInheritance_1  {
    int z = 8;
    int a = 69;
    String s =  "Black";
    InnerInheritance_1(){
        System.out.println("I Am A Parent Class Constructor");
    }
     void Display(){
        System.out.println("Sum In Parent Class : "+(z+a));
     }
}
class InnerInheritance extends InnerInheritance_1{
    int z = 23;
    int a  = 52;
    String s = "White";
    InnerInheritance(){
        super();
        System.out.println("I Am A Child Class Constructor");
    }
    void Display(){
        System.out.println("Sum In Child Class : "+(a+z));
     }
     void show(){
        
        System.out.println("I Am A Parent Class Instace Variable : "+super.s);
        System.out.println("I Am A Child  Class Instace Variable : "+s);
        Display();
        super.Display();
     }
}
public class Super {
    public static void main(String[] args) {
        InnerInheritance I = new InnerInheritance();
        I.show();
    }
}
