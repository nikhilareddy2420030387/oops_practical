package oops_practical;

public class ConstructorExample {
    String name;

    // Default constructor
    ConstructorExample() {
        name = "Unknown";
    }

    // Parameterized constructor
    ConstructorExample(String n) {
        name = n;
    }

    void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        ConstructorExample obj1 = new ConstructorExample();
        ConstructorExample obj2 = new ConstructorExample("Nikhila");
        obj1.display();
        obj2.display();
    }
}
