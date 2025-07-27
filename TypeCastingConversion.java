package oops_practical;
import java.util.Scanner;

public class TypeCastingConversion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an int value: ");
        int i = sc.nextInt();
        byte b = (byte) i;
        System.out.println("i and b: " + i + " " + b);

        System.out.print("Enter a double value: ");
        double d = sc.nextDouble();
        i = (int) d;
        System.out.println("d and i: " + d + " " + i);

        b = (byte) d;
        System.out.println("d and b: " + d + " " + b);
        sc.close();
    }
}