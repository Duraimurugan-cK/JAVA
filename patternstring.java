import java.util.*;
public class patternstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        String f = words[0];
        String s = words[1];

        for (int i = 1; i <= f.length(); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(f.charAt(j));
            }
            if (i >= s.length()) {
                System.out.print(s);
            } else {
                for (int m = 0; m < i; m++) {
                    System.out.print(s.charAt(m));
                }
            }
            System.out.println();
        }
    }
}
