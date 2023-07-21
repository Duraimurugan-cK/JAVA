import java.util.*;
 abstract class A{
    abstract public void show();

}
 abstract class B extends A{
    public void show1()
    {
        System.out.println("its showing in b");
    }
}
class c extends B{
    public void show()
    {
        System.out.println("its showing");
    }
}
public class abstracts {
    public static void main(String[] args) {
        c obj=new c();
        obj.show1();
    }
}
//abstract methods can only be defined in the abstrat class
//abstract method do not specify an body
//abstract methos cannot have an object
//we have to create a concrete class which implements all the methods in the anstract class
//abstract definitions are in the subclass 