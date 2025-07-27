package oops_practical;

import java.util.Scanner;

public class UnboxingExample {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer value: ");
        Integer a = sc.nextInt();
        int i = a.intValue();
        int j = a;
        System.out.println(a + " " + i + " " + j);
        sc.close();
        
}
}
