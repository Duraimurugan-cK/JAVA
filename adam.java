import java.util.*;
public class adam {
    static int Square(int num)
    {
        return (num*num);
    }
    static int reverse(int num)
    {
        int rev = 0;    
    while (num > 0)  
    {  
        rev = rev * 10 + num % 10;  
        num = num / 10;  
    }    
    return rev;
    }
    static boolean one(int num)
    {
        int a=Square(num);
        int b=Square(reverse(num));
        if(a==reverse(b))
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.print("enter the number:");
       int num=sc.nextInt();
       if(one(num))
       System.out.println("adam number");
       else
       System.out.println("not adam number"); 
    }
}