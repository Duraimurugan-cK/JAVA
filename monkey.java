import java.util.*;
public class monkey {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();
        int p=sc.nextInt();
        int tb=sc.nextInt();
        int tp=sc.nextInt();
        int  count=(tb%b)+(tp%p);
        if(count>0)
        {
            count=1;
        }
        int ba=n-(((tb/b)+(tp/p))+count);
        System.out.println(ba);
        
    }
}
