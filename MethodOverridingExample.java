package oops_practical;

class Parent {
    void show() {
        System.out.println("Parent's show()");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child's show()");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();  // calls overridden method in Child
    }
}

