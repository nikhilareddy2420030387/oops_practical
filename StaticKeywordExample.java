package oops_practical;

public class StaticKeywordExample {
    static int count = 0;

    StaticKeywordExample() {
        count++;  // static variable shared among all objects
    }

    static void displayCount() {
        System.out.println("Number of objects created: " + count);
    }

    public static void main(String[] args) {
        new StaticKeywordExample();
        new StaticKeywordExample();
        StaticKeywordExample.displayCount();
    }
}
