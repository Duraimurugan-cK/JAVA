import java.util.*;
public class traveller {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
        if(n<2)
        {
            System.out.println("invalid input");
        }
        else
        {
            Arrays.sort(a);
            if(a[0]==a[1])
            {
                System.out.println("EQUAL "+a[0]+" "+a[1]);
            }
            else
            {
                System.out.println("smallest:"+a[0]+" and second smallest:"+a[1]);
            }
        }
    }
}
