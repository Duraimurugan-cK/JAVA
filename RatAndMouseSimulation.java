import java.util.*;

public class RatAndMouseSimulation {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            String s=sc.nextLine();
            String[] words=s.split(" ");
            for( i=0;i<words.length;i++)
            {
                for(int j=i+1;j<words.length;j++)
                {
                    if(words[i]==words[j])
                    {
                        words[j]="0";
                        break;
                    }
                }
            }
            for(int k=0;i<words.length;k++)
            {
                if(words[k]!="0")
                {
                    System.out.print(words[k]+" ");
                }
            }
            System.out.println();
        }
    }
}
