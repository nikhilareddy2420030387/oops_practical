package oops_practical;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
	Scanner myObj = new Scanner(System.in);
	  System.out.println("Enter a: ");
	  int a = myObj.nextInt(); 
	  System.out.println("Enter b: ");
	 int b = myObj.nextInt(); 
	  System.out.println("a + b = " + (a + b));

	   
	    System.out.println("a - b = " + (a - b));

	    System.out.println("a * b = " + (a * b));

	   
	    System.out.println("a / b = " + (a / b));

	
	    System.out.println("a % b = " + (a % b));
	    myObj.close();
	    
}

}