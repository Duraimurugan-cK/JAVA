import java.util.*;
public class skipeven 
{
    public static void main(String args[])
    {
        int i;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for( i=1;i<=num;i++)
        {
            if(i%2==0)
            continue;
            else
            System.out.print(i+" ");
        }
    }
    
}
