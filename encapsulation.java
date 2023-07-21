import java.util.*;
class human{
    private int age;
    private String name;
    public void setage(int a)
    {
        age=a;
    }
    public void setname(String n)
    {
        name=n;
    }
    public int getage(){
        return age;
    }
    public String getname()
    {
        return name;
    }
}
class encapsulation{
    public static void main(String[] args) {
        human obj=new human();
        obj.setage(10);
        obj.setname("durai");
        System.out.println("The name is"+obj.getname()+" and age is "+obj.getage());
    }//encapsulation is used for binding data and code together
}//it is used to protect data from outer world