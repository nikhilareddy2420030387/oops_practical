package oops_practical;
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int a = sc.nextInt();
        System.out.print("Enter divisor: ");
        int b = sc.nextInt();
        System.out.println("Quotient: " + (a / b));
        System.out.println("Remainder: " + (a % b));
    sc.close();
    }
}

