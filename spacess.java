import java.util.*;
public class spacess {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        int a[]=new int[n];
        int k;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            k=0;
           k=Character.toString(ch[i]).length();
           a[i]=k;
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==1)
            {
                min=a[i];
                i=n;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==1&&a[i]<min)
            {
                min=a[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(Character.toString(ch[i]).length()==a[i])
            {
                System.out.println(ch[i]);
                i=n;
            }
        }
    }
    
}
