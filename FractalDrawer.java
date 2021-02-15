// FractalDrawer class draws a fractal of a shape indicated by user input
import java.awt.*;
import java.util.Scanner; // for user input
public class FractalDrawer {
    private double totalArea = 0;  // member variable for tracking the total area

    //HOW DO YOU CALCULATE TOTAL AREA set a variable that you keep adding to that doesn't get reset (global variable)
    public FractalDrawer(String shape) {
        // constructor

    }

    //TODO:
    // drawFractal creates a new Canvas object
    // and determines which shapes to draw a fractal by calling appropriate helper function
    // drawFractal returns the area of the fractal
    public double drawFractal(String type) {
        Canvas myCanvas = new Canvas(400, 400);
        if (frac_shape.equals("Triangle") || frac_shape.equals("triangle")) {
            Random r = new Random(); // https://stackoverflow.com/questions/10249103/how-to-generate-random-numbers-of-random-colors-for-canvas-drawcolor
            Color rand_color = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
            drawTriangleFractal(100, 100, 400, 400, rand_color, myCanvas, 7);
        }
        /*else if (frac_shape.equals("Circle") || frac_shape.equals("Circle")){
            Color rand_color = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
            drawCircleFractal(100, 100, 400, 400, rand_color, myCanvas, 7);
        }
        else if (frac_shape.equals("Rectangle") || frac_shape.equals("rectangle")){
            Color rand_color = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
            drawRectangleFractal(100, 100, 400, 400, rand_color, myCanvas, 7);
        }
        else {
            System.out.println("Invalid shape. BRUH");
        }*/
    }

    //TODO:
    // drawTriangleFractal draws a triangle fractal using recursive techniques
    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
        if (level == 0) {
            return;
        }
        else {
            Triangle myTriangle = new Triangle(x, y, width, height);
            myTriangle.setColor(Color.c);
            drawing.drawShape(myTriangle);
            Color next_color = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
            drawTriangleFractal(width / 3, height / 3, x / 2, height / 2, next_color, can, level--); // left
            drawTriangleFractal(width / 3, height / 3, x + x / 4, height + height / 2, next_color, can, level--);// upper middle
            drawTriangleFractal(width / 3, height / 3, x + x / 2, height / 2, next_color, can, level--); //right

        }

    }

    // TODO:
    // drawCircleFractal draws a circle fractal using recursive techniques
    /*public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {
        return ;

    }

    //TODO:
    // drawRectangleFractal draws a rectangle fractal using recursive techniques
    public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
       return;
    }

    // TODO:
    // main should ask user for shape input, and then draw the corresponding fractal.
    // should print area of fractal
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a shape (square, triangle, or rectangle): ");
        String user_shape = myScanner.nextLine();
        FractalDrawer myFractalDrawer = new FractalDrawer(); //creating new fractal drawer object
    }

}*/
}
