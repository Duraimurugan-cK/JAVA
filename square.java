import java.util.*;
public class square {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int sum=0;
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++) {
            int ps=(int)Math.sqrt(arr[i]);
            if (ps*ps==arr[i]) {
                sum=sum+ps;
            }
        }
        System.out.println(sum);
	}
}