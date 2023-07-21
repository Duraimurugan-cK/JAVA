import java.util.*;
public class string_segmentation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String str[]=new String[n];
        for(int i=0;i<n;i++)
        {
            str[i]=sc.next();
        }
        String largestring=sc.next();
        String str1;
        String str2;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                str1=str[i];
                str2=str[j];
                if(largestring.contains(str1) && largestring.contains(str2))
                {
                    System.out.println(str1+" and "+str2+" can be segmented");
                    count++;
                }
            }
            if(count==0)
             {
                System.out.println("cannot be segmented");
                i=n;
             }
        }   
    }
}
