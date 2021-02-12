// FractalDrawer class draws a fractal of a shape indicated by user input
import java.awt.Color;
import java.util.Scanner; // for user input
public class FractalDrawer {
    private double totalArea=0;  // member variable for tracking the total area
    //HW DO YOU CALCULATE TOTAL AREA
    public FractalDrawer(String shape) {}  // constructor
        String frac_shape = shape;
    //TODO:
    // drawFractal creates a new Canvas object
    // and determines which shapes to draw a fractal by calling appropriate helper function
    // drawFractal returns the area of the fractal
    public double drawFractal(String type) {
        Canvas myCanvas = Canvas();
        if (frac_shape.equals("Triangle") || frac_shape.equals("triangle")){
            drawTriangleFractal();
        }
        else if (frac_shape.equals("Circle") || frac_shape.equals("Circle")){
            //drawCircleFractal();
        }
        else if (frac_shape.equals("Rectangle") || frac_shape.equals("rectangle")){
            //drawRectangleFractal();
        }
        else {
            System.out.println("Invalid shape.");
        }
    }


    //TODO:
    // drawTriangleFractal draws a triangle fractal using recursive techniques
    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level){
        if (level == 0) return ;
        Canvas triangle = new Canvas(height, width);
        Triangle myTriange = new Triangle(x, y);
        drawing.drawShape(myTriangle);

    }


    // TODO:
    // drawCircleFractal draws a circle fractal using recursive techniques
    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {
    }


    //TODO:
    // drawRectangleFractal draws a rectangle fractal using recursive techniques
    public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
    }

    //TODO:
    // main should ask user for shape input, and then draw the corresponding fractal.
    // should print area of fractal
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a shape (square, triangle, or rectangle): ");
        String user_shape = myScanner.nextLine();
        FractalDrawer myFractalDrawer = new FractalDrawer(); //creating new fractal drawer object
    }
}
