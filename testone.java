import java.util.*;
import java.util.Arrays;
public class testone {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,count=0;
        for(i=0;i<=a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(i=0;i<=a.length;)
        {
            if(a[i]==a[i+1])
            {
                count++;
                i++;
            }
            else
            {
                count+=2;
                i++;
            }  
        }
        System.out.print(count);
    }
    
}
