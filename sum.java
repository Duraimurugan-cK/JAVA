import java.util.*;
public class sum {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int i,j,n=1,k=1;
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
        int b[][]=new int[row+1][col-1];
        for(i=0;i<row+1;i++)
        {
            for(j=0;j<col-1;j++)
            {
                System.out.print(b[i][j]=arr[j][i]);
                System.out.print(" ");
            }
            System.out.println();   
        }
    }
}
