package oops_practical;
//This program uses a parameterized method

class Box3 {
 double width;
 double height;
 double depth;

 // Method to compute and return volume
 double volume() {
     return width * height * depth;
 }

 // Method to set dimensions using parameters
 void setDim(double w, double h, double d) {
     width = w;
     height = h;
     depth = d;
 }
}

public class BoxDemo6 {
 public static void main(String[] args) {
     Box3 mybox1 = new Box3();
     Box3 mybox2 = new Box3();

     // Set dimensions for both boxes
     mybox1.setDim(10, 20, 15);
     mybox2.setDim(3, 6, 9);

     // Get volume of first box
     double vol1 = mybox1.volume();
     System.out.println("Volume of box1 is: " + vol1);

     // Get volume of second box
     double vol2 = mybox2.volume();
     System.out.println("Volume of box2 is: " + vol2);
 }
}
