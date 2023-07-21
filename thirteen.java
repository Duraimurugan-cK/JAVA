import java.util.*;
import java.util.Arrays;
public class thirteen {
    public static void main(String args[]) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,j;
        for( i=0;i<n;i++)
        {
             a[i]=sc.nextInt();
        }
        int val=sc.nextInt();
        int ind=sc.nextInt();
        int b[]=new int[n+1];
        for( i=0;i<ind;i++)
        {
            b[i]=a[i];
            System.out.print(b[i]+" ");
        }
        for(i=0;i<=n+1;i++)
        {
            if(ind==i)
            {
                System.out.print(b[ind]=val);
                System.out.print(" ");
                break;
            }
        }
        while(ind<=n-1)
        {
            b[ind+1]=a[ind];
            System.out.print(b[ind+1]+" ");
            ind=ind+1;

        }
    }
    
}
