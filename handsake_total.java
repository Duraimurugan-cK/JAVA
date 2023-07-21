import java.util.*;
public class handsake_total {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int i=1;
        int temp=n;
        while(temp!=0)
        {
            sum+=(n-i);
            i++;
            temp--;
        }
        System.out.println(sum);
    }
}
