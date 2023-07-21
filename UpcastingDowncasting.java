import java.util.*;
class A{
    void show()
    {
        System.out.println("in class A");
    }
}
class B extends A{
    void show1()
    {
        System.out.println("In class B");
    }
}
public class UpcastingDowncasting {
    public static void main(String[] args) {
        A obj=new B();//upcasting
        obj.show();
        B obj1=(B) obj;//downcasting
        obj1.show1();
    }
}
