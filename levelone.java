import java.util.*;
public class levelone
{
    public static void main(String args[])
    {
        int length=0,i=0;
            Scanner sc = new Scanner(System.in);
            System.out.println(“Enter a String”);
            String s = sc.next();
            String n=s+’\0′;
            while(n.charAt(i) != '\0')
            {
            length++;
            i++;
            }
            System.out.println(“length of String is “+length); }    
    }
    
}
