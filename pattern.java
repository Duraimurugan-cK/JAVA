import java.util.*;

class pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int a[][] = new int[i][j];
        for (int k = 0; k < i; k++) {
            for (int y = 0; y < j; y++) {
                a[k][y] = sc.nextInt();
            }
        }
        int start = 0;
        int end = j - 1;
        while (start <= end) {
            for (int m = start; m <= end; m++) {
                System.out.print(a[start][m] + " ");
            }
            for (int m = start + 1; m <= end; m++) {
                System.out.print(a[m][end] + " ");
            }
            if (start < end) {
                for (int m = end - 1; m >= start; m--) {
                    System.out.print(a[end][m] + " ");
                }
                for (int m = end - 1; m > start; m--) {
                    System.out.print(a[m][start] + " ");
                }
            }
            start++;
            end--;
 }
}
}