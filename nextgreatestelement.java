import java.util.*;
public class nextgreatestelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int min=-1;
            int count=0;
            for(int j=i+1;j<n;j++)
            {
                if(a[i]<a[j])
                {
                    min=a[j];
                    System.out.println(a[i]+"="+min);
                    count++;
                    break;
                }
            }
            if(i==n-1&&count>0)
            {
                System.out.println(a[i]+"="+min);
            }
        }
        
    }
    
}
