import java.util.*;
public class fibonacci_pattern {
    public static void main(String[] args) {
        int n=8,n1=0,n2=1;
        for(int i=0;i<n;i++)
        {
            int s=n1+n2;
            for(int j=s;j>0;j--)
            {
                System.out.print(s+" ");
            }
            n1=n2;
            n2=s;
            System.out.println();
        }
    }
}
