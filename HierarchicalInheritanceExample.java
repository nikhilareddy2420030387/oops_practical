package oops_practical;

import java.util.Scanner;

class Being {
    void eat() {
        System.out.println("Eating...");
    }
}

class Lion extends Being {
    void roar() {
        System.out.println("Roaring...");
    }
}

class Tiger extends Being {
    void growl() {
        System.out.println("Growling...");
    }
}

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Do you want lion actions? (yes/no): ");
        String lionChoice = sc.nextLine();

        if (lionChoice.equalsIgnoreCase("yes")) {
            Lion l = new Lion();
            l.eat();
            l.roar();
        }

        System.out.print("Do you want tiger actions? (yes/no): ");
        String tigerChoice = sc.nextLine();

        if (tigerChoice.equalsIgnoreCase("yes")) {
            Tiger t = new Tiger();
            t.eat();
            t.growl();
        }

        sc.close();
    }
}



