public class z {
    public static void main(String args[])
    {
        int n=9;
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(i==1 || i==n-1)
                System.out.print("s");
                else if(j==n-i-1)
                    {
                    System.out.print("m");
                }
                else{
                    System.out.print(" ");
                
                }
            }
            System.out.println();
        }
    }
}
