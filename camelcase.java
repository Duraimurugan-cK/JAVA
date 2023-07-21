import java.util.*;
public class camelcase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] a=s.split(" ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=a[i].charAt(0);
        }
        System.out.println(s);
    }
    
}
