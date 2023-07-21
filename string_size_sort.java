import java.util.*;
public class string_size_sort{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      String a[]=s.split(" ");
      for(int i=0;i<a.length;i++)
      {
        for(int j=0;j<a.length;j++)
        {
          if(a[i].length()<a[j].length())
          {
            String temp=a[i];
            a[i]=a[j];
            a[j]=temp;
          }
        }
      }
      for(int i=0;i<a.length;i++)
      {
        System.out.print(a[i]+" ");
      }
    }
}
