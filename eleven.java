import java.util.*;
import java.util.Arrays;
public class eleven {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
             a[i]=sc.nextInt();
        }
        int val=sc.nextInt();
        for(int j=0;j<n;j++)
        {
            if(a[j]==val)
            {
            System.out.println("the value is found at index:"+j);
            }
        }
        
    }
    
}
