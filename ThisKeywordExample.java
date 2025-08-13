package oops_practical;

public class ThisKeywordExample {
    int a, b;

    ThisKeywordExample(int a, int b) {
        this.a = a;  // this.a refers to instance variable
        this.b = b;
    }

    void display() {
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        ThisKeywordExample obj = new ThisKeywordExample(10, 20);
        obj.display();
    }
}
