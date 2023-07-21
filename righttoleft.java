import java.util.*;

public class righttoleft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String[] words = s.split(" ");
        String max = "";
        int maxLength = -1;
        for (int i = 0; i < n; i++) {
            String word = words[i];
            if (word.length() % 2 == 1 && word.length() > maxLength) {
                maxLength = word.length();
                max = word;
            }
        }
        if (maxLength == -1) {
            System.out.println("better luck next time");
        } else {
            System.out.println(max);
        }
    }
}
