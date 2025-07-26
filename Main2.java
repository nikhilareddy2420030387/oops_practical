package oops_practical;

import java.util.Scanner;

public class Main2 {
public static void main(String args[]) {
	Scanner myObj = new Scanner(System.in);
	System.out.println("Enter a: ");
	int a = myObj.nextInt();
	System.out.println("Enter b: ");
	int b = myObj.nextInt();
	int result = a&b;
	System.out.println("a&b = "+result);
	int result1 = a|b;
	System.out.println("a|b = "+result1);
	myObj.close();
	
	
}
}
