import java.util.*;
public class basepower {
    static void powvalue(int base,int power)
    {
        int value;
        value=(int)Math.pow(base,power);
        System.out.println(value);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int power=sc.nextInt();
        powvalue(base,power);

    }
}
