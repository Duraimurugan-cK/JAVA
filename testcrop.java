import java.util.*;

public class testcrop {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int w=sc.nextInt();
            int h=sc.nextInt();
            if(w<=val&&h<=val)
            {
                System.out.print("Accepted");
            }
            else if(w>val&&h>val)
            {
                System.out.print("crop it");
            }
            else
            {
                System.out.print("upload another");
            }
            System.out.println();
        }
    }
}
        