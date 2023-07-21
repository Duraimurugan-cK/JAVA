import java.util.*;
class lucids {
    static int pow(int k)
    {
        int j;
        for(int i=1;i<k;i++)
        {
            int m=1;
            for( j=1;j<=i;j++)
            {
                m*=i;
            }
            if(m==k)
            {
                System.out.println("k ="+i);
                i=k;
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int k,count=0;
       for(int i=1;i<n;i++)
       {
           k=n-(i*i);
               if(pow(k)==1)
               {
                   System.out.println("YES "+"d= "+i);
                   count++;
               }
       }
       if(count==0)
       {
           System.out.println("no");
        }
    }
}
/* Given a positive number N, we have to find whether N can be converted to the form KK where K is also a positive integer, using the following operation any number of times :

Choose any digit less than the current value of N, say d.
KK = N – d2, change d each time
     If it is possible to express the number in the required form then print “Yes” otherwise print “No”.

Example:

Input: N = 13 
Output: Yes 
Explanation: 
For integer 13 choose d = 3 : 13 – 32 = 4, 4 is of the form 22. Hence, the output is 4.


 
Input: N = 90 
Output: No 
Explanation: 
It is not possible to express the number 90 in required form*/
