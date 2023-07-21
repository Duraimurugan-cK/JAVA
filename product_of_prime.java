import java.util.*;
class product_of_prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int prime1=0;
        int prime2=0;
        for(int i=2;i<=p/2;i++)
        {
            if(p%i==0&&isprime(i))
            {
                prime1=i;
                prime2=p/i;
            }
        }
        if(prime1!=0 && prime2!=0 && prime1!=prime2 && isprime(prime2))
        {
            System.out.println(prime1+"*"+prime2+"="+p);
        }
        else
        {
            System.out.println("no product");
        }
    }
    static boolean isprime(int num)
    {
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
}