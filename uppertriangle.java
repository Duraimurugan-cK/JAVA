import java.util.*;
public class uppertriangle 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int i,j,sum=0;
        int row=sc.nextInt();
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(i=0;i<row;i++,System.out.println())
        {
            for(j=0;j<col;j++)
            {
                if(i>j)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
        
       