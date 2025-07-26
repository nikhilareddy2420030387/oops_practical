package oops_practical;

import java.util.Scanner;

public class Main1 {
	public static void main(String args[]) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = myObj.nextInt();
		System.out.println("Enter b: ");
		int b = myObj.nextInt();
		int result1 = ++a;
		System.out.println("After increment: " + result1);
		int result2 = --b;
		System.out.println("After decrement: "+ result2);
		myObj.close();
		
		
	}

}



