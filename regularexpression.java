import java.util.Scanner; 
public class regularexpression {
    static int c = 0;

    public static int counting(int start, int end, int rec) {
        if (rec == 0)
            return 0;
        for (int i = start; i < end; i++)
         {
            if (counting(i, end, rec - 1) == 0)
                c++;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int l = scan.nextInt();
        int r = scan.nextInt();
        int len = r - l + 1;
        for (int i = 1; i <= n; i++) {
            counting(0, len, i);
        }
        System.out.println(c);
        scan.close();
 }
}