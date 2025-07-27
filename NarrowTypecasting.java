package oops_practical;
import java.util.Scanner;

public class NarrowTypecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a double value: ");
        double i = sc.nextDouble();
        short j = (short) i;
        int k = (int) i;
        System.out.println("Original Value before Casting: " + i);
        System.out.println("After Type Casting to short: " + j);
        System.out.println("After Type Casting to int: " + k);
        sc.close();
    }
}

