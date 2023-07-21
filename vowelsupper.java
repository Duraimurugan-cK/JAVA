import java.util.*;
public class vowelsupper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String g="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                char n=(char)((int)s.charAt(i)-32);
                g+=n;
            }
            else{
                g+=s.charAt(i);
            }
        }
        System.out.println(g);
    }
}
