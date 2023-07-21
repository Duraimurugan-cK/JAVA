import java.util.*;
public class e_commerce {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f3=0;
        int f1=0;
        int f2=1;
        while(n-1>0)
        {
            f3=f1+f2;
            f1=f2;
            f2=f3;
            n--;
        }
        System.out.println(f3);
    }
}
