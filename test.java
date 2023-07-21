import java.util.*;
class test
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,j=n-1;
        for(i=0;i<=a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<=a.length;i++)
        {
            int b[]=new int[n];
        if(a[i]<0)
        {
            b[i]=a[i];
            System.out.print(a[i]);
            
        }
        else
        {
            i++;
        }
    }
        
        
        
    }
}