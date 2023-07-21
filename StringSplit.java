import java.util.*;
public class StringSplit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int i;
        for(i=1;s.charAt(i)!='\0';i++);
        System.out.println(i);
    }
}
