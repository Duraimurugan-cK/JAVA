import java.io.*;
import java.util.*;
public class longestpalindrome {
    public static int palin(String s)
    {
        String k="";
        int flag=0;
        for(int i=s.length()-1;i>=0;i--)
        {
             k+=s.charAt(i);
        }
        if(k.equals(s))
        {
            flag=1;
        }
        return flag; 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String empty="";
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
                String check=s.substring(i,j);
                if(palin(check)==1 && check.length()>empty.length())
                {
                    empty=check;
                }
            }
        }
        System.out.print(empty);
    }
}