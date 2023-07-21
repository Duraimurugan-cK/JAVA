import java.util.*;
public class len
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str = str + '0';
        int count = 0;
    
        for (int i = 0; str.charAt(i) != '0'; i++) {
            count++;
        }
        System.out.println(count);
    }
    
}
