import java.util.*;
public class finding_triplets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if((a[i]+a[j]+a[k])==0)
                    {
                        System.out.println("("+a[i]+","+a[j]+","+a[k]+")");
                        count++;
                    }
                }
            }
        }
        if(count==0)
        {
            System.out.println("there are no triplets");
        }
    }
    
}
