import java.util.*;
class test<T>
{
    T obj;
    test(T obj){
        this.obj=obj;
    }
    public T getobject()
    {
        return this.obj;
    }
}
public class generics {
    public static void main(String args[]){
        test<Integer> obj=new test<Integer>(15);
        System.out.println(obj.getobject());
        test<String> objs=new test<String>("hii");
        System.out.println(objs.getobject());
    }
    
}
