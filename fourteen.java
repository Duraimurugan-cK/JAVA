
import java.util.*;
public class fourteen
 {
    public static void main(String args[]) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n-1];
        int i,j;
        for( i=0;i<n;i++)
        {
             a[i]=sc.nextInt();
        }
        int ind=sc.nextInt();
        if(ind<n-1)
        {
            for(i=0;i<ind;i++)
            {
                b[i]=a[i];
                System.out.print(b[i]+" ");
            }
            while(ind<n-1)
            {
                b[ind]=a[++ind];
                System.out.print(b[i]+" ");
                ind=ind+1;
            }
        
        }
        else{
            System.out.println("array index out of bound");
        }
    }

}