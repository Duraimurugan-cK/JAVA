import java.util.*;
public class greater_smaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int result = gs(a, n);
        System.out.println(result);
    }

    public static int gs(int a[], int n) {
        boolean flag = false;
        for (int i = 1; i < n-1; i++) {
            flag = false;
            for (int j = 0; j < i; j++) {
                if (a[i] <= a[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag) continue;
            for (int j = i+1; j < n; j++) { //fixed typo, changed i to j
                if (a[i] >= a[j]) { // fixed typo, changed <= to >=
                    flag = true;
                    break;
                }
            }
            if (!flag) return i;
        }
        return -1;
    }
}
