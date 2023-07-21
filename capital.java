import java.util.*;
class capital
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String str="";
        for(int i=0;i<s.length();i++)
        {
            if((int)s.charAt(i)>=65&&(int)s.charAt(i)<=90)
            {
                str=str+s.charAt(i);
            }
        }
        System.out.println(str);
    }
}