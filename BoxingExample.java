package oops_practical;
import java.util.Scanner;

public class BoxingExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = sc.nextInt();
        Integer aObj = a;
        System.out.println("Primitive int: " + a);
        System.out.println("Boxed Integer object: " + aObj);
        sc.close();
    }
}
