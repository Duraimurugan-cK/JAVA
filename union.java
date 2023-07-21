import java.util.*;
public class union {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n1];
        HashSet<Integer> union=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            union.add(a[i]);
        }
        for(int j=0;j<n1;j++)
        {
            b[j]=sc.nextInt();
            union.add(b[j]);
        }
        System.out.println(union.size());
       
    }
    
}
