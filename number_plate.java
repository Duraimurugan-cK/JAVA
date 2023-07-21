import java.util.*;
public class number_plate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        char a=sc.next().charAt(0);
        char b=sc.next().charAt(0);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int c_possible=((((int)b-(int)a)+1)*2);
        int num_possible=2+2+(2-1)+(2-1);
        int result=c_possible*num_possible*d;
        System.out.println(result);
    }
}
