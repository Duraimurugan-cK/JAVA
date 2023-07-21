import java.util.*;
public class hii {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String str =sc.nextLine();
        String str1="";
       //int count = 0;
        str = str.toLowerCase();
        String[] words = str.split(" ");
       for(int i = 0; i < words.length; i++)
       {
         int count = 1;
         for(int j = i + 1; j < words.length; j++) 
         { 
          if(words[i].equals(words[j])) { 
           count++;  
          words[j] = "0"; 
         } 
        }  
        
       }
       for (int i=0;i<words.length;i++)
       {
        if (words[i]!="0")
        {
          str1+=words[i]+" ";

        }
       }
       System.out.println(str1);
     }
    }