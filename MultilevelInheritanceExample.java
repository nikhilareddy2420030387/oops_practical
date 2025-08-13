package oops_practical;

import java.util.Scanner;

class Creature {
    void eat() {
        System.out.println("Eating...");
    }
}

class dogg extends Creature {
    void bark() {
        System.out.println("Barking...");
    }
}

class BabyDog extends dogg {
    void weep() {
        System.out.println("Weeping...");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BabyDog bd = new BabyDog();

        System.out.print("Does the baby dog eat? (yes/no): ");
        String eatInput = sc.nextLine();
        if (eatInput.equalsIgnoreCase("yes")) {
            bd.eat();
        }

        System.out.print("Does the baby dog bark? (yes/no): ");
        String barkInput = sc.nextLine();
        if (barkInput.equalsIgnoreCase("yes")) {
            bd.bark();
        }

        System.out.print("Does the baby dog weep? (yes/no): ");
        String weepInput = sc.nextLine();
        if (weepInput.equalsIgnoreCase("yes")) {
            bd.weep();
        }

        sc.close();
    }
}



