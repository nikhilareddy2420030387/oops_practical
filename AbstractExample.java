package oops_practical;

abstract class Animal {
    abstract void sound();

    void sleep() {
        System.out.println("Sleeping...");
    }
}

public class AbstractExample extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        AbstractExample obj = new AbstractExample();
        obj.sound();
        obj.sleep();
    }
}


