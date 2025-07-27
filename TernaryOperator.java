package oops_practical;
import java.util.Scanner;
public class TernaryOperator {
	public static void main(String args[]) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Print number of days in feb: ");
		int februaryDays = myObj.nextInt();
		
	    String result;
	    result = (februaryDays == 28) ? "Not a leap year" :
            (februaryDays == 29) ? "Leap year" :
            "Invalid number of days";
	  
	    System.out.println(result);
	    myObj.close();
	    
	}

}
