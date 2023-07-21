import java.util.*;
public class monotonic {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    boolean flag=true;
    int a[]=new int[n];
    for(int i=0;i<a.length;i++)
    {
        a[i]=sc.nextInt();
    }
    for(int i=0;i<a.length-1;i++)
    {
        if(a[i]==a[i+1]+1||a[i]==a[i]-1)
        {
            flag=true;
        }
    }
    if(flag==true)
    {
        System.out.println("monotonic");
    }
    else{
        System.out.println("not monotonic");
    }
    }
}
