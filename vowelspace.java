import java.util.*;
public class vowelspace
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int i;
        char[] str=s.toCharArray();
        char ch;
        for(i=str.length-1;i>=0;i--)
        {
            System.out.print(str[i]);
        }
    }
}