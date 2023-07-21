import java.util.*;
class A{
    void show()
    {
        System.out.println("In show A");
    }
}
class B extends A
{
    void show()
    {
        System.out.println("In show B");
    }
}
class C extends A{
    void show()
    {
        System.out.println("In show C");
    }
} 
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A obj=new A();
        obj.show();
        obj=new B();
        obj.show();
        obj=new C();
        obj.show();
    }
}
