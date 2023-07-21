import java.util.*;
public class stock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=0,k=0;
        int a[]=new int[n];
        int count2=-1;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int j=0;
        int count=0;
        while(j<n)
        {
        if(a[j]+1==a[j])
        {
            count++;
            j++;
        }
    }
        if(count==n)
        {
            System.out.println("0");
        }
        else{
            int max=a[0];
            for(int i=0;i<n;i++)
            {
                if(a[i]>max)
                {
                    max=a[i];
                    count2++;
                }
            }
            int min=a[count2];
            for(int i=count2;i<n;i++)
            {
                if(a[i]<min)
                {
                    min=a[i];
                }
            }
            m=max;
            k=min;
        }
        System.out.println(m-k);

    }
    
}
