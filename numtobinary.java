import java.util.*;
public class numtobinary {
    static void binary(int num)
    {
        while(num!=0)
        {
            int rem,rev=0;
            rem=num%2;
            rev=rev*2+rem;
            num/=2; 
            System.out.print(rev(value(rev)));
        }
    }
    static void value(int value)
    {
        while(value!=0)
        {
            int rem,revi=0;
            rem=value%2;
            revi=revi*2+rem;
            value/=2; 
        }
        return revi;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        binary(num);
    }
    
}
