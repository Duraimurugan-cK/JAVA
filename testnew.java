
import java.util.*;
import java.util.Arrays;
public class testnew {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,count=0,count2=0;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int j=0;
        for(i=0;i<n-1;i++)
        {
            if(a[i]!=a[i+1])
            {
                count++;
            }
            else
            {
                count2++;
                j++;
            } 
        }System.out.print(count+count2);
        
    }
    
}
