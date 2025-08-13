package oops_practical;

import java.util.Scanner;


public class PublicExample {
    public String name; // public variable

    // public method
    public void display() {
        System.out.println("Hello, " + name + "! This is a public method.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PublicExample obj = new PublicExample();

        System.out.print("Enter your name: ");
        obj.name = sc.nextLine(); // directly accessible because it's public

        obj.display();
        sc.close();
        // call public method
    }
}
