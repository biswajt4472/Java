interface User{
    void getnum(Long s);
    void EnterNm(String name);
}
interface Customer{
    void getnum(Long s);
    void Enteradd();
}
interface Seller{
    void getnum(Long s);
}
class Developer implements Customer,Seller,User{
    public void getnum(Long s){
        System.out.println( "Ph. NO. : "+s);
    }
    public void EnterNm(String name){
        System.out.println("Name is : "+name);
    }
    public void Enteradd(){
        System.out.println("Address : St-498,NewYork,USA");
   }
}
public class Multiple_Inheritance {
    public static void main(String[] args) {
        Developer B = new Developer();
        B.getnum(9999585599L);
        B.EnterNm("Good Boy");
        B.Enteradd();
    }
}
