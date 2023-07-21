import java.util.Arrays;
public class union {
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5};
        int b[]={1,2,3};
        int count=0;
        Arrays.sort(a);
        Arrays.sort(a);
        
        for(int i=0;i<b.length;i++)
        {
            if(a[i]==b[i])
            {
                count++;
            }
            else
            {
                continue;
            }
        }
        System.out.println(count);
    }
    
}
