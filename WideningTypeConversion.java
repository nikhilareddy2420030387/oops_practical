package oops_practical;
import java.util.Scanner;

public class WideningTypeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        int ascii = ch;
        float f = ascii;
        System.out.println("Char: " + ch);
        System.out.println("ASCII (int): " + ascii);
        System.out.println("Float: " + f);
   sc.close();
   }
}

