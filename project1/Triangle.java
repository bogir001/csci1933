import java.awt.Color;

public class Triangle(){
    public Triangle(double x, double y, double w, double h){
      x_pos = x;
      y_pos = y;
      width = w;
      height = h;

    public double calculatePerimeter(){
        return x_pos + y_pos + width;
    }

    public double calculateArea(){
        return width * height * 0.5;
    }

    public void setColor(Color c){
        color = c;
    }

    public void setPos(double x, double y){
        position = [x, y];
    }

    public double setHeight(double h){
        height = h;
    }

    public double setWidth(){
        width = w;
    }

    public Color getColor(){
        return color;
    }

    public double getXPos(){
        return x_pos;
    }

    public double getYPos(){
        return y_pos;
    }

    public double getHeight(){
        return height;
    }

    public double getWidth(){
        return width;
    }
}

