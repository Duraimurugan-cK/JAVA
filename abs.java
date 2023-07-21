import java.util.*;
abstract class animal
{
    public abstract void name();
    public void sleep()
    {
        System.out.println("Zzzz");
    }
}
class birds extends animal{
    public void name()
    {
        System.out.println("pig");
    }
}
public class abs{
    public static void main(String[] args) {
        birds obj=new birds();
        obj.name();
        obj.sleep();
    }
}