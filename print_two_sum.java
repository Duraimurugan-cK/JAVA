import java.util.*;
public class print_two_sum{
   public  static void adds(int a[],int n,int target)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]+a[j]==target)
                {
                    System.out.println(a[i]+"+"+a[j]+"="+target);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        adds(a,n,target);
    }
}
