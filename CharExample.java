package oops_practical;
import java.util.Scanner;
public class CharExample {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a character: ");
	        char c = sc.next().charAt(0);
	        System.out.println("Character entered: " + c);
	        sc.close();
	        
	    }
}
