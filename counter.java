import java.util.*;
public class counter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int win=1;
        while(n!=1)
        {
            if(poweroftwo(n)==true)
            {
                n=n/2;
            }
            else{
                n=n-largpower(n);
            }
            win=win+1;
        }
        if(win%2==0)
        {
            System.out.println("lowis");
        }
        else
        {
            System.out.println("richard");
        }
    }
    public static boolean poweroftwo(int n)
    {
        int square=1;
        while(n>=square)
        {
            if(n==square)
            {
            return true;
            }
            square*=2;
        }
        return false;
    }
    public static int largpower(int n)
    {
        int res=2;
        while(res*2<n)
        {
            res=res*2;
        }
        return res;
    }
}
