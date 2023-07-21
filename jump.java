import java.util.*;
public class jump 
{
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5,6,7,8,9};
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int j=(int) Math.sqrt(a.length);
        int low=0;
        int high=j;
        int i=high;
        int sum=a.length-j;
        if(n>=a[low]&&n<=a[high])
        {
            for( i=high;high>=low;high--)
            {
                if(a[i]==n)
                {
                    System.out.println(a[i]+"is present in the list");
                    break;
                }
            }
        }
        else
        {
            low=low+j;
            high=high+j;
            if(high==sum)
            {
                for(i=high;high<=a.length;high++)
                {
                    if(a[i]==n)
                    {
                        System.out.println(a[i]+"is present in the list");
                        break;
                    }
                    else{
                            System.out.println("not in the list");
                            break;
                    }
                }
            }
        }
        
    }
}