import java.awt.*;
/**
 * @author Max Valek
 * This class has getter and setter methods for Circle objects as well
 * as including a constructor for the Circle objects
 */
public class Circle
{
	//pi constant for calculating area and perimeter
	private final double pi = 3.14159;
	//Radius, x position, and y position of a Circle object
	private double rad, xPos, yPos;
	//Color of a Circle object
	private Color color;

	/**
	 * Constructor for a Circle object
	 * @param pos_x the desired x position
	 * @param pos_y the desired y position
	 * @param radius the desired radius
	 */
	public Circle(double pos_x, double pos_y, double radius)
	{
		this.rad = radius;
		this.xPos = pos_x;
		this.yPos = pos_y;
	}

	/**
	 * Method to calculate the perimeter of a Circle object
	 * @return the calculated perimeter
	 */
	public double calculatePerimeter()
	{
		return pi * this.rad * 2;
	}

	/**
	 * Method to calculate the area of a Circle object
	 * @return the calculated area
	 */
	public double calculateArea()
	{
		return pi * this.rad * this.rad;
	}

	/**
	 * Setter method to set the color of a Circle object
	 * @param c the desired color
	 */
	public void setColor(Color c)
	{
		this.color = c;
	}

	/**
	 * Method to determine the color of the next Circle in the fractal based on the color of the last Circle
	 * @return the next color
	 */
	public Color nextColor() {
		if(getColor().equals(Color.BLUE)){
			return Color.GREEN;
		}
		else if(getColor().equals(Color.GREEN)) {
			return Color.red;
		}
		else {
			return Color.BLUE;
		}
	}

	/**
	 * Setter method to set the position of a Circle object
	 * @param pos_x the desired x position
	 * @param pos_y the desired y position
	 */
	public void setPos(double pos_x, double pos_y)
	{
		this.xPos = pos_x;
		this.yPos = pos_y;
	}

	/**
	 * Steer method to set the radius of a Circle object
	 * @param radius the desired radius
	 */
	public void setRadius(double radius)
	{
		this.rad = radius;
	}

	/**
	 * Getter method to access the color of a Circle object
	 * @return the color of the Circle
	 */
	public Color getColor()
	{
		return color;
	}

	/**
	 * Getter method to access the x position of a Circle object
	 * @return the x position of the Circle
	 */
	public double getXPos()
	{
		return this.xPos;
	}

	/**
	 * Getter method to access the y position of a Circle object
	 * @return the y position of the Circle
	 */
	public double getYPos()
	{
		return this.yPos;
	}

	/**
	 * Getter method to access the radius of a Circle object
	 * @return the radius of the Circle
	 */
	public double getRadius()
	{
		return this.rad;
	}
}