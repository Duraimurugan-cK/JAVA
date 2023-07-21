import java.util.*;
interface A{
    void show(int i);
}
public class lambda {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        A obj=i -> System.out.println(i);
        obj.show(5);
    }
}
