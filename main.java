abstract class AbstractClass {
    public AbstractClass() {
        System.out.println("This is the constructor of the abstract class");
    }

    public abstract void a_method();

    public void normal_method() {
        System.out.println("This is a normal method of the abstract class");
    }
}

class SubClass extends AbstractClass {
    @Override
    public void a_method() {
        System.out.println("This is the abstract method");
    }
}

public class main {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.a_method(); // Call the abstract method
        obj.normal_method(); // Call the non-abstract method
    }
}