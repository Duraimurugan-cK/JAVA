import java.util.*;

public class MinOfOPeration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        char[] S = s.toCharArray();
        char[] S1 = s1.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s1.length(); j++) {
                if (S[i] == S1[j] && S[i] != 0 && S1[j] != 0) {
                    S[i] = 0;
                    S1[j] = 0;
                    break;
                }
            }
        }
        int count = 0, count1 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (S[i] != 0) {
                count++;
            }
        }
        for (int i = 0; i < s1.length(); i++) {
            if (S1[i] != 0) {
                count1++;
            }
        }
        if (count == 0)
            System.out.println(count1);
        else if (count1 == 0)
            System.out.println(count);
        else
            System.out.println(count / 2);
    }
}
