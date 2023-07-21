import java.util.*;
public class binary_count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int count1=0,count2=0;
        String s="";
        while(n!=0)
        {
            int rem=n%2;
            if(rem==0)
            {
                count1++;
            }
            else{
                count2++;
            }
            s=rem+s;
            n/=2;
        }
        System.out.println("the binary number is "+s);
        System.out.println("the number of 0 is "+count1);
        System.out.println("the number of 1 is "+count2);
    }
}
