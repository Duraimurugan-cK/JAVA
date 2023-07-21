import java.util.*;
public class sorted_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        int min=Integer.MAX_VALUE;
        int c=0;
        int d=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
        for(int j=i+1;j<n;j++)
        {
            int ind=k-(a[i]+a[j]);
            if(ind<min && ind>=0)
            {
                min=ind;
                c=a[i];
                d=a[j];
            }
        }
    }
    System.out.println(c+","+d);
    }
}
