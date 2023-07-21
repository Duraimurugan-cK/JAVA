import java.util.*;
public class triangle
 {
    static void triangle(int num)
    {
        int i,j;
        for(i=0;i<num;i++)
        {
            System.out.print(" ");
        }
        for(j=0;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int num=5;
        triangle(num);
    }
    
}
