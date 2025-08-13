package oops_practical;
import java.util.Scanner;

class Person {
    protected int age;

    protected void inputAge() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        sc.close();
        
    }

    protected void displayAge() {
        System.out.println("Age is: " + age);
    }
}

public class ProtectedExample extends Person {
    public static void main(String[] args) {
        ProtectedExample obj = new ProtectedExample();
        obj.inputAge();    // calling protected method from superclass
        obj.displayAge();  // calling protected method from superclass
    }
}
