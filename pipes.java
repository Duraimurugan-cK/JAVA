import java.util.*;
public class pipes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,sum1=0;
        int a[]=new int[n];
        int n1=sc.nextInt();
        int b[]=new int[n1];
        int r=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            a[i]=a[i]-r;
            sum+=a[i];
        }
        for(int i=0;i<n1;i++)
        {
            b[i]=sc.nextInt();
            b[i]=b[i]-r;
            sum1+=b[i];
        }
        int result=sum-sum1;
        if(sum-sum1==0)
        {
            System.out.println("balanced");
        }
        else if(sum>sum1)
        {
            System.out.println("add an outgoing pipe"+((sum1-sum)-2));
        }
        else
        {
             System.out.println("add an incoming pipe"+(sum-sum1));
        }
    }
}
