import java.awt.*;
import java.util.Scanner;
/**
@author Max Valek
This class uses recursive algorithms to draw a fractal from the user's choice of circles, triangles, or rectangles
 and displays to them the total area of all of the shapes in the fractal.
 */
public class Fractal {
    //Sets initial area to zero
    private static double area = 0;
    //the canvas used to draw the fractal
    private static Canvas frac;

    /**
    Recursive algorithm for drawing the rectangular fractal and calculating the total area of the fractal
    @return area the area of the fractal
     */
    public static double rectangleFractal(Rectangle r) {
        //Adding to the total area
        area += r.calculateArea();
        if (r.getHeight() > 1 && r.getWidth() > 1) {
            frac.drawShape(r);
            //Reducing the height and width for the next Rectangles in the fractal
            double newHeight = r.getHeight() / 2;
            double newWidth = r.getWidth() / 2;
            //Creation of the new Rectangles in the fractal
            Rectangle botL = new Rectangle(r.getXPos() - newWidth, r.getYPos() - newHeight, newWidth, newHeight);
            Rectangle topL = new Rectangle(r.getXPos() - newWidth, r.getYPos() + r.getHeight(), newWidth, newHeight);
            Rectangle botR = new Rectangle(r.getXPos() + r.getWidth(), r.getYPos() - newHeight, newWidth, newHeight);
            Rectangle topR = new Rectangle(r.getXPos() + r.getWidth(), r.getYPos() + r.getHeight(), newWidth, newHeight);
            //Determining the next color to use
            Color next = r.nextColor();
            topR.setColor(next);
            botR.setColor(next);
            topL.setColor(next);
            botL.setColor(next);
            rectangleFractal(botL);
            rectangleFractal(topL);
            rectangleFractal(botR);
            rectangleFractal(topR);
        }
        return area;
    }

    /**
     Recursive algorithm for drawing the circular fractal and calculating the total area of the fractal
     @return area the area of the fractal
     */
    public static double circleFractal(Circle c){
        //Adding to the total area
        area += c.calculateArea();
        if (c.getRadius()>1){
            frac.drawShape(c);
            //Reducing the radius of the circles in the fractal
            double nextRadius=c.getRadius()/2;
            //Creation of the new Circles in the fractal
            Circle right= new Circle((c.getXPos()+c.getRadius()+nextRadius),c.getYPos(), nextRadius);
            Circle left= new Circle((c.getXPos()-c.getRadius()-nextRadius),c.getYPos(), nextRadius);
            Circle top= new Circle(c.getXPos(),(c.getYPos()+c.getRadius()+nextRadius),nextRadius);
            Circle bottom= new Circle(c.getXPos(),(c.getYPos()-c.getRadius()-nextRadius), nextRadius);
            //Determining the next color to use
            Color next = c.nextColor();
            right.setColor(next);
            left.setColor(next);
            top.setColor(next);
            bottom.setColor(next);
            circleFractal(right);
            circleFractal(left);
            circleFractal(top);
            circleFractal(bottom);
        }
        return area;
    }

    /**
     Recursive algorithm for drawing the triangular fractal and calculate the total area of the fractal
     @return area the area of the fractal
     */
    public static double triangleFractal(Triangle t) {
        //Adding to the total area
        area += t.calculateArea();
        if (t.getWidth() > 1 && t.getHeight() > 1) {
            frac.drawShape(t);
            //Reducing the width and height for the next Triangles in the fractal
            double newWidth = t.getWidth() / 2;
            double newHeight = t.getHeight() / 2;
            //Creation of the next Triangles in the fractal
            Triangle left = new Triangle((t.getXPos() - newWidth), t.getYPos(), newWidth, newHeight);
            Triangle right = new Triangle((t.getXPos() + t.getWidth()), t.getYPos(), newWidth, newHeight);
            Triangle top = new Triangle((t.getXPos() + t.getWidth() / 2 - newWidth / 2), (t.getYPos() - t.getHeight()), newWidth, newHeight);
            //Determining the next color to use
            Color next = t.nextColor();
            left.setColor(next);
            right.setColor(next);
            top.setColor(next);
            triangleFractal(left);
            triangleFractal(right);
            triangleFractal(top);
        }
        return area;
    }

    /**
     * The main method for the program. It asks the user to input either a circle, triangle or rectangle.
     * If the user does not input one of these three options, it prompts them to try again.
     * If the user inputs one of the three options, it creates a new canvas and shape of their choice,
     * along with setting the color of the shape. Then it calls the respective fractal method, which draws the shape
     * and returns the total area of the fractal.
     * @param args the command line argument
     */
    public static void main(String[] args){
        //initialization of the scanner
        Scanner s = new Scanner(System.in);
        System.out.println("To choose a shape, type in one of the following: circle, triangle, or rectangle");
        String input;
        while(s.hasNext()) {
            input = s.nextLine().toLowerCase();
            //setting the initial color of the first shape to blue
            Color col = Color.blue;
            if(input.equals("circle")){
                //Creation of a canvas
                frac = new Canvas();
                //Creation of a Circle object
                Circle myCir = new Circle(400,400,150);
                myCir.setColor(col);
                System.out.println("Total Area of Fractal: ");
                System.out.println(circleFractal(myCir));
                break;
            }
            else if(input.equals("triangle")){
                //Creation of a canvas
                frac = new Canvas();
                //Creation of a Triangle object
                Triangle myTri = new Triangle(250,600,250,250);
                myTri.setColor(col);
                System.out.println("Total Area of Fractal: ");
                System.out.println(triangleFractal(myTri));
                break;
            }
            else if(input.equals("rectangle")){
                //Creation of a canvas
                frac = new Canvas();
                //Creation of a Rectangle object
                Rectangle myRec = new Rectangle(300,300,200,200);
                myRec.setColor(col);
                System.out.println("Total Area of Fractal: ");
                System.out.println(rectangleFractal(myRec));
                break;
            }
            else{
                System.out.println("Sorry that is not an option, try again.");
            }
        }
    }
}
