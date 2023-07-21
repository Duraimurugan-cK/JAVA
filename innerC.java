class A{
    int a=1;
    void show()
    {
        System.out.println("in a");
    }
    class B{
        void show1()
        {
        System.out.println(a);
        }
    }
}
public class innerC {
    public static void main(String[] args) {
        A obj=new A();
        A.B obj1=obj.new B();
        obj1.show1();
        
    }
}
