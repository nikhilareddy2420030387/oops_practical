package oops_practical;

public class ConstructorOverloading {
    int x, y;

    ConstructorOverloading() {
        x = 0;
        y = 0;
    }

    ConstructorOverloading(int a) {
        x = a;
        y = 0;
    }

    ConstructorOverloading(int a, int b) {
        x = a;
        y = b;
    }

    void display() {
        System.out.println("x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading(5);
        ConstructorOverloading obj3 = new ConstructorOverloading(3, 7);

        obj1.display();
        obj2.display();
        obj3.display();
    }
}
