import java.util.*;

public class CountSpecialCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if((s.charAt(i)>=65 && s.charAt(i)<=90)||s.charAt(i)>=97 && s.charAt(i)<=122||s.charAt(i)>=48 && s.charAt(i)<=57)
            {
                continue;
            }
            else
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
