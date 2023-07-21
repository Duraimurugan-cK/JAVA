import java.util.*;
public class decreasing_freq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int max=0;
        char h1[]=s1.toCharArray();
        HashMap<Character,Integer> s=new HashMap<Character,Integer>();
        for(int i=0;i<s1.length();i++)
        {
            int count=1;
            for(int j=i+1;j<s1.length();j++)
            {
                if(h1[i]==h1[j] && h1[i]!=0 )
                {
                    count++;
                    h1[j]=0;
                }
            }
            if(count>max)
            {max=count;}
            if(h1[i]!=0)
            {
                s.put(h1[i],count);
            }
        }
        for(int i=max;i>=0;i--)
        {
            for(Map.Entry<Character,Integer> entry:s.entrySet())
            {
                if(entry.getValue()==i)
                {
                    System.out.println(entry.getKey()+"="+entry.getValue());
                }
            }
        }


    }
}
