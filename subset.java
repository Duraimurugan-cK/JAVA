import java.util.*;
public class subset{
    public static void subsets(int[] a, int n, int index, int[] b) {
        if (index == n) {
            for (int i = 0; i < n; i++) {
                if (b[i] == 1) {
                    System.out.print(b[i] + " ");
                }
            }
            System.out.println();
            return;
        }
        b[index] = 1;
        subsets(a, n, index + 1, b);
        b[index] = 0;
        subsets(a, n, index + 1, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        subsets(a, n, 0, b);
    }
}
