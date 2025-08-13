package oops_practical;
import java.util.Scanner;


class DefaultAccess {
    String name;  // default access (no modifier)

    void input() {  // default access
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        sc.close();
        
    }

    void display() {  // default access
        System.out.println("Name is: " + name);
        
    }
}

public class DefaultAccessTest {
    public static void main(String[] args) {
        DefaultAccess obj = new DefaultAccess();
        obj.input();
        obj.display();
        
    }
   
}
