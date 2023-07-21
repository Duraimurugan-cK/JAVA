import java.util.*;
public class hashmaps {
    public static void main(String[] args) {
        HashMap<String,Integer> obj=new HashMap<String,Integer>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<1;i++)
        {
            String s =sc.nextLine();
            int n=sc.nextInt();
            obj.put(s,n);
            sc.nextLine();

        }
        for(String i:obj.keySet())
        {
            System.out.println("the string is "+i+" the value is "+obj.get(i));
        }
        HashSet<Integer> obj1=new HashSet<Integer>();
        obj1.add(1);
        obj1.add(1);
        obj1.size();
        for(Integer i:obj1)
        {
            System.out.println("the string is "+i+" the value is "+obj.get(i));
        }
    }
    }
