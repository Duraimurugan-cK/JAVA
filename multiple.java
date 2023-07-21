import java.util.*;
interface inter1{
 void method1();
}
interface inter2{
   void  method2();
}
class myclass implements inter1,inter2
{
    public void method1(){
        System.out.println("hii");
    }
    public void method2(){
        System.out.println("hello");
    }
}
public class multiple{
    public static void main(String[] args) {
        myclass obj=new myclass();
        obj.method1();
        obj.method2();
    }
}
