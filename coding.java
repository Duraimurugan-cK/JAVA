import java.util.*;
public class coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int maxLoss = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int loss = a[i] - a[j];
                maxLoss = Math.max(maxLoss, loss);
            }
        }
        System.out.println(maxLoss);
    }
}
