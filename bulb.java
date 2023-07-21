import java.util.*;
public class bulb
 {
    public static void main(String args[])
    {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    int count=0;
    for(int i=0;i<n;i++)
    {
        if(a[i]==1)
        {
            continue;
        }
        else{
            for(int j=i;j<n;j++)
            {
                if(a[j]==0)
                {
                    a[j]=1;
                }
                else{
                    a[j]=0;
                }
                sum++;
            }
        }
    }
    System.out.println(sum);
    }
}

