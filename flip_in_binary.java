import java.util.*;
public class flip_in_binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int count=0;
        while(n1!=0&&n2!=0)
        {
            int rem1=n1%2;
            int rem2=n2%2;
            if(rem1==rem2)
            {
                count++;
            }
            n1/=2;
            n2/=2;
        }
        System.out.println(count);
    }
    
}
