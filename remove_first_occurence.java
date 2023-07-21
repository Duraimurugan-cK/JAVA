import java.util.*;
public class remove_first_occurence{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] words=s.split(" ");
        s="";
        for(int i=0;i<words.length;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                if(words[i].equals(words[j]))
                {
                    words[i]="";
                    break;
                }
            }
            s+=words[i]+" ";
        }
        System.out.println(s);
    }
}