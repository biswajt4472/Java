//A Simple Program In Inheritance 
class InnerInheritance_1  {
    int x = 5;
    int y = 6;
     void display(){
        System.out.println("Sum In Parent Class : "+(x+y));
     }
}
class InnerInheritance extends InnerInheritance_1{
    int z = 52;
    int k  = 53;
    void display1(){
        System.out.println("Sum In Child Class : "+(z+k));
     }
}
public class Inheritance {
    public static void main(String[] args) {
        InnerInheritance I = new InnerInheritance();
        //Access Parent Class Method Using Childreen Clas Instance
        I.display();
        //Access Childreen Class Method Using Childreen Clas Instance 
        I.display1();
                
    }
}
