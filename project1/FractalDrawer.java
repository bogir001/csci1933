// FractalDrawer class draws a fractal of a shape indicated by user input
import java.awt.Color;
import java.util.Scanner; // for user input
public class FractalDrawer {
    private double totalArea=0;  // member variable for tracking the total area
    //HOW DO YOU CALCULATE TOTAL AREA
    public FractalDrawer(String shape) {}  // constructor
        String frac_shape = shape;
    //TODO:
    // drawFractal creates a new Canvas object
    // and determines which shapes to draw a fractal by calling appropriate helper function
    // drawFractal returns the area of the fractal
    public double drawFractal(String type) {
        Canvas myCanvas = new Canvas();
        if (frac_shape.equals("Triangle") || frac_shape.equals("triangle")){
            Random r = new Random(); // https://stackoverflow.com/questions/10249103/how-to-generate-random-numbers-of-random-colors-for-canvas-drawcolor
            Color rand_color = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
            drawTriangleFractal(100, 100, 50, 50, myCanvas, 7);
        }
        else if (frac_shape.equals("Circle") || frac_shape.equals("Circle")){
            Color rand_color = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
            drawCircleFractal(100, 100, 50, 50, myCanvas, 7);
        }
        else if (frac_shape.equals("Rectangle") || frac_shape.equals("rectangle")){
            Color rand_color = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
            drawRectangleFractal(100, 100, 50, 50, myCanvas, 7);
        }
        else {
            System.out.println("Invalid shape. BRUH");
        }
    }

    //TODO:
    // drawTriangleFractal draws a triangle fractal using recursive techniques
    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
        //if (level == 0) return;
        //find the three midpoints. recursively call the triangle function 3 times,
        if (level > 0) {
            Triangle myTriangle = new Triangle(x, y);
            myTriangle.setColor(Color.c);
            drawing.drawShape(myTriangle);
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    drawing.drawShape(myTriangle);
                    drawTriangleFractal(width / 3, height / 3, width / 2, height / 2, can, level--);
                }
            }
        }
    }


    // TODO:
    // drawCircleFractal draws a circle fractal using recursive techniques
    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {
        /*if(level > 0):
        {
           // Circle myCircle = new Circle(x, y);
            //for(int i =0; i < 3; i++)
               // for(int j=0; j<3. j++){
               )
         */
        //}

    }


    //TODO:
    // drawRectangleFractal draws a rectangle fractal using recursive techniques
    //public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {

   // }

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
