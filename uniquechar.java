import java.util.Scanner;
import java.util.Arrays;

public class uniquechar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String v = sc.nextLine();
        char[] ch=s.toCharArray();
        char[] sh=v.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(sh);
        int n=ch.length-sh.length;
        int c=sh.length-ch.length;
        for(int i=0;i<ch.length-1;i++)
        {
            if(ch[i]==ch[i+1]||ch[i]==sh[sh.length-n])
            {
                ch[i+1]='0';
            }
        }
        for(int i=0;i<sh.length-1;i++)
        {
            if(sh[i]==sh[i+1]||sh[i]==ch[ch.length-c])
            {
                sh[i+1]='0';
            }
        }
        char[] combined =new char[ch.length+sh.length];
        for(int i=0;i<ch.length;i++)
        {
            combined[i]=ch[i];
        }
        for(int i=0;i<sh.length;i++)
        {
            combined[ch.length+i]=ch[i];
        }

        // Sort the combined array
        Arrays.sort(combined);

        // Iterate through the combined array to find unique characters
        for (int i = 0; i < combined.length - 1; i++) {
            if (combined[i] != combined[i + 1]&&combined[i]!='0') {
                System.out.print(combined[i]);
            }
        }

        System.out.println(combined[combined.length - 1]);
    }
}