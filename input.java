import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class input {
    public static void main(String[] args) throws IOException {
        InputStreamReader in =new InputStreamReader(System.in);
        BufferedReader bj=new BufferedReader(in);
        int n=Integer.parseInt(bj.readLine());
        System.out.println(n);
    }
}
