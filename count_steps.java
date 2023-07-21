import java.util.*;
public class count_steps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n>0)
        {
            if(n%2==0)
            {
                n/=2;
            }
            else
            {
                n--;
            }
            count++;
        }
    System.out.println(count);
    }
}
