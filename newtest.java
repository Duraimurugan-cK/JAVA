
import java.util.*;
import java.util.Arrays;
public class newtest {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,count=0,sum;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
            if(a[i]==a[j])
            {
                count++;
            }
            }
        }
        sum=n-count;
        System.out.print(sum);
    }
        
}
    
