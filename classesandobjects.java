import java.security.spec.PSSParameterSpec;
import java.util.*;
public class classesandobjects {
    int age;
    String name;
    public classesandobjects(String name,int age){
        this.name=name;
        this.age=age;
    }
     void say()
    {
        System.out.println("my name is"+name+"and age is"+age);
    }
    public static void main(String[] args) {
        classesandobjects obj=new classesandobjects("durai",15);
    obj.say();
    }
}
