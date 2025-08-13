package oops_practical;

import java.util.Scanner;

class Animall {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animall {
    void bark() {
        System.out.println("Barking...");
    }
}

public class SingleInheritanceExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Does the dog eat? (yes/no): ");
        String eatInput = sc.nextLine();

        Dog d = new Dog();
        if (eatInput.equalsIgnoreCase("yes")) {
            d.eat();
        }

        System.out.print("Does the dog bark? (yes/no): ");
        String barkInput = sc.nextLine();

        if (barkInput.equalsIgnoreCase("yes")) {
            d.bark();
        }
        sc.close();
    }
}


