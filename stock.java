import java.util.*;
public class stock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        b[0] = 1;
        for (int i = 1; i < n; i++) {
            int count = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (a[j] <= a[i]) {
                    count++;
                }
            }
            b[i] = count;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
