package oops_practical;
public class BoxExample {
    // Method to calculate area of a box
    int volume(int length, int width, int height) {
        return length * width * height;
    }

    public static void main(String[] args) {
        BoxExample box = new BoxExample();
        int vol = box.volume(5, 4, 3);
        System.out.println("Volume: " + vol);
    }
}
