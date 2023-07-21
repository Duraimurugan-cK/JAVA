import java.util.*;
class DuraiException extends Exception{
    public DuraiException(String  s)
    {
        super(s);
    }
}
public class exception {
    public static void main(String[] args) {
        int i=0,j=0,k;
        int a[]=new int[2];
        try{
         j=18/20;
         if(j==0)
         {
            throw new DuraiException("I dont want to print");
         }
         int l=a[3];
        }
        catch(DuraiException e)
        {
            System.out.println("it is the default output\n"+e);
        }
        catch(ArithmeticException e)
        {
            System.out.println("num cannot be divided by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array size is greater");
        }
        catch(Exception e)
        {
            System.out.println("error");
        }
        finally{
            System.out.println("excecution is finished");
        }
        System.out.println("hii");
    }
}
