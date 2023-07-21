import java.util.*;
public class doctor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[20];
        for(int i=0;i<20;i++)
        {
            if(sc.nextLine().isEmpty())
            {
                break;
            }
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<20;i++)
        {
            if(a[i]>0 && a[i]<17)
            {
                sum+=200;
            }
            else if(a[i]>=17 && a[i]<=40)
            {
                sum+=400;
            }
            else  if(a[i]>40)
            {
                sum+=300;
            }
            else
            {
                System.out.println("invalid syntax");
                break;
            }
        }
        System.out.println(sum);
    }
}
