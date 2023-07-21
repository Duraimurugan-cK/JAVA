import java.util.*;
abstract class Animal {
    abstract void jump();
    abstract void bite();
}
interface BasicAnimal {
    void eat();
    void sleep();
}
class Monkey extends Animal {
    void jump() {
        System.out.println("Jump");
    }
    void bite() {
        System.out.println("Bite");
    }
}
class Human extends Monkey implements BasicAnimal {
    public void eat() {
        System.out.println("Eat");
    }
    public void sleep() {
        System.out.println("Sleep");
    }
}
