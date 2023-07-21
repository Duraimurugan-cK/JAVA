import java.util.*;
public class arraylist 
{    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q=sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < n; i++)
        {
            arr.add(sc.nextInt());
        }
        if(q==1)
        {
            int p = sc.nextInt();
            int r = sc.nextInt();
            arr.add(p, r);
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}