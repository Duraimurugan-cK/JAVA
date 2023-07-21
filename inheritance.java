package oops;
import java.util.*;
class A{
    void hii()
    {
        System.out.println("parent class");
    }
}
class B extends A{
    void show()
    {
        System.out.println("parent class");
    }
}
class C extends B{
    void display()
    {
        System.out.println("display child class");
    }
}
public class inheritance {
    public static void main(String[] args) {
        c obj=new c();
        obj.show();
        obj.hii();
    }
    
}
