import java.awt.*;

/**
 * @author Max Valek
 *
 * This is the Triangle class. It includes getters and setters to access and manipulate the size and location
 * of the triangles, along with a constructor for the the Triangle object.
 */
public class Triangle
{
	//The x position, y position, width, and height of the Triangle object
	private double xPos, yPos, tWidth, tHeight;
	//color of the Triangle
	Color color;

	/**
	 * Constructor for the Triangle object
	 */
	public Triangle(double pos_x, double pos_y, double width, double height)
	{
		this.xPos = pos_x;
		this.yPos = pos_y;
		this.tWidth = width;
		this.tHeight = height;
	}

	/**
	 * Method to calculate the perimeter of the triangle
	 * @return the calculated perimeter
	 */
	public double calculatePerimeter()
	{
		return 2 * (this.tWidth + this.tHeight);
	}

	/**
	 * Mehtod to calculate the area of a triangle
	 * @return the calculated area
	 */
	public double calculateArea()
	{
		return 0.5 * this.tWidth * this.tHeight;
	}

	/**
	 * Setter method to change the color of the triangle
	 * @param c the new color
	 */
	public void setColor(Color c)
	{
		color = c;
	}

	/**
	 * Method to determine the color of the next triangle in the fractal
	 * @return the color to be used on the next triangle
	 */
	public Color nextColor() {
		if(getColor().equals(Color.BLUE)){
			return Color.GREEN;
		}
		else if(getColor().equals(Color.GREEN)) {
			return Color.RED;
		}
		else {
			return Color.BLUE;
		}
	}

	/**
	 * Setter method to set the position of the triangle
	 * @param pos_x the new x position
	 * @param pos_y the new y position
	 */
	public void setPos(double pos_x, double pos_y)
	{
		this.xPos = pos_x;
		this.yPos = pos_y;
	}

	/**
	 * Setter method to set the height of the triangle
	 * @param height the new height
	 */
	public void setHeight(double height)
	{
		this.tHeight = height;
	}

	/**
	 * Setter method to set the width of the triangle
	 * @param width the new width
	 */
	public void setWidth(double width)
	{
		this.tWidth = width;

	}

	/**
	 * Getter method to get the current color being used for the triangles
	 * @return color the current color being used
	 */
	public Color getColor()
	{
		return color;
	}

	/**
	 * Getter method to access the x position of a Triangle
	 * @return the current x position
	 */
	public double getXPos()
	{
		return this.xPos;
	}

	/**
	 * Getter method to access the y position of a Triangle
	 * @return the current y position
	 */
	public double getYPos()
	{
		return this.yPos;
	}

	/**
	 * Getter method to access the height of a Triangle
	 * @return the current height
	 */
	public double getHeight()
	{
		return this.tHeight;
	}

	/**
	 * Getter method to access the width of a Triangle
	 * @return the current width
	 */
	public double getWidth()
	{
		return this.tWidth;
	}
}