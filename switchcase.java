import java.util.*;
public class switchcase{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=2,c=3;
        switch(n)
        {
            case 1:
            System.out.println(b+c);
            break;
            case 2:
            System.out.println(b-c);
            break;
            case 3:
            System.out.println(b*c);
            break;
            case 4:
            System.out.println(b%c);
            break;
            default:
            System.out.println("exit");

        }
    }
    
}
