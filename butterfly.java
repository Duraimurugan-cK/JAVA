import java.util.*;
public class butterfly
{
    public static void main(String args[])
    {
        int n=5;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(i==1||i==n)
                System.out.print("@"+" ");
            }
            int spaces=2*(n-i);
            for(int k=0;k<=spaces;k++)
            {
                System.out.print(" ");
            }
            for(int l=0;l<=i;l++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
}
