
public class patterns {
    public static void main(String args[])
    {
        int n=9
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(i==j||j==i||i==n||j==n)
                {
                    System.out.print(5-i);
                }
            }
        }
    }
    
}
