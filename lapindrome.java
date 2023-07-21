import java.util.*;
public class lapindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] ch=s.toCharArray();
        String r="";
        String l="";
        int n=s.length()/2;
        for(int i=0;i<s.length();i++)
        {
            if(i<n)
            {
                r+=s.charAt(i);
            }
            else{
                l+=s.charAt(i);
            }
        }
        if(r.equals(l))
        {
            System.out.println("true");
       }
       else{
        System.out.println("false");
       }
    }
}
