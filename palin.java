import java.util.Scanner;
class palin
{
public static void main(String args[])
{
    int num, rev=0,rem,temp;
    Scanner obj=new Scanner(System.in);
    num=obj.nextInt();
    temp=num;
    while(num>0)
    {
        rem=num%10;
        rev=rev*10+rem;
        num/=10;
    }
        if(temp==rev)
        System.out.println("the given number is palindrome");
        else
        System.out.println("the given number is not a palindrome");
}
}