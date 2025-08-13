package oops_practical;

class Box4 
{  
    double width;
    double height;
    double depth;

    // Correct constructor name (same as class name)
    Box4(double w, double h, double d) 
    {   
        width = w;
        height = h;
        depth = d;
    }

    double volume()
    { 
        return width * height * depth;
    }
}

public class ParameterizedConstructor
{
    public static void main(String[] args) 
    { 
        // declare, allocate, and initialize Box objects
        Box4 mybox1 = new Box4(10, 20, 15); 
        Box4 mybox2 = new Box4(3, 6, 9); 
        double vol; 

        // get volume of first box 
        vol = mybox1.volume(); 
        System.out.println("Volume is " + vol);

        // get volume of second box 
        vol = mybox2.volume(); 
        System.out.println("Volume is " + vol);
    }
}
