import java.util.*;
public class EleOrder {
    public static void main(String[] args) {
        char c[] = { '!', '#', '$', '%', '&', '*', '@', '^', '~' };
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char N[] = new char[n];
        char B[] = new char[n];
        for (int i = 0; i < n; i++) {
            N[i] = sc.next().charAt(0);
        }
        for (int i = 0; i < n; i++) {
            B[i] = sc.next().charAt(0);
        }
        int count = 0;
        for (int i = 0; i < N.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (N[i] == B[j]) {
                    count++;
                    break;
                }
            }
        }
        if (count == n) {
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < n; j++) {
                    if (c[j] == N[j]) {
                        char temp = N[i];
                        N[i] = N[j];
                        N[j] = temp;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(N[i] + " ");
            }
        }
        else{
            System.out.println("in");
        }
    }
}
