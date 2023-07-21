import java.util.*;
public class primenumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int o=sc.nextInt();
        int i,j;
        int sum=0;
        for(i=n;i<=o;i++)
        {
            if(i==1||i==0)
            {
                continue;
            }
            boolean flag=false;
            for(j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    flag=true;
                    break;
                }
            }
            if(flag==false)
            {
                System.out.print(i+" ");
                sum=sum+i;
            }
        }
        System.out.println();
        System.out.println(sum);
    }
}