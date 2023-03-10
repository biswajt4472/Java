
interface User{
    void getnum(Long s);
    // void EnterNm(String name);
}
interface Customer{
    void getnum(Long s);
    // void EnterNm
}
interface Seller{
    void getnum(Long s);
}
class Biswajit implements Customer,Seller,User{
    public void getnum(Long s){
        System.out.println(s);
    }
}public class A_new {
    public static void main(String[] args) {
        Biswajit B = new Biswajit();
        B.getnum(9583488596L);
    }
}
