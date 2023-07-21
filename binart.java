import java.util.*;
public class binart {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem;
        String Binary=" ";

        while(n!=0)
        {
            rem=n%2;
            Binary=rem+Binary;
            n/=2;
        }
        System.out.println(Binary);
        
        
    }
    
}
