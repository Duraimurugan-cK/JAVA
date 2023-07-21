import java.util.*;
class power {
    public static int pow(int j)
    {
        for(int i=1;i<j;i++)
        {
            if(i*i==j && i==j)
            {
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        int p=0;
        for (int i = 1; i < n; i++) {
            k = n - (i * i);
                int l=pow(k);
                if(l!=0)
                {
                    System.out.println("yes k="+k+" i="+ i);
                    p++;
                    i=n;
                }
            }
        if(p==0)
        {
            System.out.println("no");
        }
    }
}
