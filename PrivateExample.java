package oops_practical;

import java.util.Scanner;

public class PrivateExample {
    private String secret; // private variable

    // public method to set the value (because direct access is not allowed)
    public void setSecret(String secret) {
        this.secret = secret;
    }

    // public method to display the value
    public void showSecret() {
        System.out.println("Your secret is: " + secret);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrivateExample obj = new PrivateExample();

        System.out.print("Enter your secret: ");
        String input = sc.nextLine();

        obj.setSecret(input); // set using public method
        obj.showSecret(); 
        sc.close();
        // display using public method
    }
}
