import java.util.*;
public class petrol_diesel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int a1=sc.nextInt();
        int b=sc.nextInt();
        int b1=sc.nextInt();
        int c=sc.nextInt();
        int c1=sc.nextInt();
        int d=sc.nextInt();
        int d1=sc.nextInt();
        int e=sc.nextInt();
        int e1=sc.nextInt();
        int petrol=c+((d/a*b)*60)+(e*60);
        int diesel=c1+((d1/a1*b1)*60)+(e1*60);
        if(petrol<diesel)
        {
            System.out.println("petrol car is efficient");
        }
        else
        {
            System.out.println("diesel car is efficient");
        }
    }
}
