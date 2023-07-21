import java.util.*;
public class hashsets {
    public static void main(String[] args) {
        HashSet<Integer> obj1=new HashSet<Integer>();
        obj1.add(1);
        obj1.add(2);
        obj1.size();
        for(Integer i:obj1)
        {
            System.out.println(obj1.contains(1));
        }
        Iterator<Integer> obj2=obj1.iterator();
        obj2.remove();
    }
}
