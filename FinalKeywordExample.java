package oops_practical;

public class FinalKeywordExample {
    final int MAX = 100; // final variable

    void show() {
        System.out.println("MAX = " + MAX);
    }

    public static void main(String[] args) {
        FinalKeywordExample obj = new FinalKeywordExample();
        obj.show();
    }
}
