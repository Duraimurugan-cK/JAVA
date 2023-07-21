import java.util.*;
class A{
    void show()  throws ClassNotFoundException
    {
        Class.forName("Throw");
    }
}
public class Throws {
    public static void main(String[] args) {
        A obj=new A();
        try{
            obj.show();
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
