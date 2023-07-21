import java.util.*;
public class patterntest 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,p=0;
        for( i=1;i<n;i++)
        {
            for( j=1;j<=i;j++)
            {
                System.out.print(++p+" ");
                
            }
            for(j=i;j<=n;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    

    
}
