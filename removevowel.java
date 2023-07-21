import java.util.*;
public class removevowel {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String str="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u')
            {
                continue;
            }
            else
            {
                str=str+s.charAt(i);
            }
        }
        System.out.println(str);
    }
    
}
