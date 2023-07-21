import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.security.auth.callback.CallbackHandler;

public class trycatch {
    public static void main(String[] args) {
        int a=3,b=0;
        int c;
        try{
            //c=a/b;
            int k[]=null;
            System.out.println(k[0]);
        }
        catch(ArithmeticException e)
        {
            System.err.println("Arithmetic exception occured");
        }
        catch(NullPointerException e)
        {
            System.out.println("null pointer exception ocurred");
        }
        catch(Exception e)
        {
            System.out.println("error occurred");
        }
        File file=new File("abc.txt");
        try{
            FileInputStream fs=new FileInputStream(file);
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        finally{
            System.out.println("always executed");
        }
        int balance=500;
        int withdraw=1000;
        int y;
        try{
            if(balance<withdraw)
            {
                throw new notsufficientmoney(withdraw-balance);
            }
        }
            catch(notsufficientmoney e)
            {
                System.out.println("new exception created");
            }
        System.out.println("hii");

    }
    
}
