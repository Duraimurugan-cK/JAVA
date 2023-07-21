package oops;

class A {
    void show() {
        System.out.println("in class A");
    }
}

class B extends A {
    void show() {
        System.out.println("in class B");
    }
}

class C extends A {
    void show() {
        System.out.println("in class C");
    }
}

public class Hier {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}
