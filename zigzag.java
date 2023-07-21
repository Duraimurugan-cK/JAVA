import java.util.*;
public class zigzag {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        /*Arrays.sort(a);
        for(int i=1;i<=n-2;i=i+2)
        {
            int temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }*/
        boolean flag=true;
        for(int i=0;i<n-2;i++)
        {
            if(flag)
            {
                if(a[i]>a[i+1])
                {
                    int temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
            else{
                if(a[i]<a[i+1])
                {
                    int temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
            flag=!flag;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
}
