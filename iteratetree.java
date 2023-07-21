import java.util.*;
public class iteratetree 
{
    public static void main(String[] args) {
        TreeSet<String> s=new TreeSet<>();
        s.add("red");
        s.add("blue");
        s.add("green");
        s.add("orange");
        s.add("blue");
        TreeSet<String> s1=new TreeSet<>();
        s1.add("violet");
        s1.add("green");
        s1.add("yellow");
        s.addAll(s1);
        for(String value:s)
        {
            System.out.println("the value is:"+value);
        }
    }
}
