import java.util.*;
public class permu {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b=sc.nextInt();
        int c=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int min=a[0];
        int sum=0;
        for(int i=0;i<=b;i++)
        {
            if(a[min]<a[i])
            {
                a[min]=a[i];
                sum=a[i];
            }
        }
        int max=0;
        for(int i=0;i<=c;i++)
        {
            if(a[max]<a[i])
            {
                a[max]=a[i];
                sum=sum+a[i];
            }
        }
        System.out.println(sum);

    }
    
}
