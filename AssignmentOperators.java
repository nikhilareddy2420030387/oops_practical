package oops_practical;
import java.util.Scanner;

public class AssignmentOperators {
	public static void main(String args[]) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = myObj.nextInt();
		
		int var = myObj.nextInt();
		var = a;
		var += a;
		System.out.println("var using +=" +var);
		 var *= a;
		 System.out.println("var using *= "+var);
		 myObj.close();
		 
		
	}

}
