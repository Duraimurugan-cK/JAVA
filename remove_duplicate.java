import java.util.*;
public class remove_duplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] dup=s.toCharArray();
        for(int i=0;i<dup.length;i++)
        {
            for(int j=i+1;j<dup.length;j++)
            {
                if(dup[i]==dup[j])
                {
                    dup[j]='0';
                }
            }
        }
        for(int i=0;i<dup.length;i++)
        {
            if(dup[i]!='0')
            {
                System.out.print(dup[i]);
            }
        }
    }

    
}
