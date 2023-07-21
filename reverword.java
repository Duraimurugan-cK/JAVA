import java.util.*;
public class reverword {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str =sc.nextLine();
       int count = 0;
        str = str.toLowerCase();
       String[] words = str.split(" ");
       for(int i=words.length-1;i>=0;i--)
       {
            System.out.print(words[i]+" ");
       }
    }
}
