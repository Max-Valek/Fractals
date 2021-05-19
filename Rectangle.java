import java.awt.*;

/**
 * @author Max Valek
 * This class has getter and setter methods for Rectangle objects as well
 * as including a constructor for the Rectangle objects
 */
public class Rectangle
{
	//x position, y position, width, and height of the Rectangle object
	private double xPos, yPos, rWidth, rHeight;
	//The color of the Rectangle object
	private Color color;

	/**
	 * The constructor for Rectangle objects
	 * @param pos_x the desired x position
	 * @param pos_y the desired y position
	 * @param width the desired width
	 * @param height the desired height
	 */
	public Rectangle(double pos_x, double pos_y, double width, double height)
	{
		this.xPos = pos_x;
		this.yPos = pos_y;
		this.rWidth = width;
		this.rHeight = height;
	}

	/**
	 * Method to calculate the perimeter of a Rectangle object
	 * @return the calculated perimeter
	 */
	public double calculatePerimeter()
	{
		return (2 * this.rWidth) + (2 * this.rHeight);
	}

	/**
	 * Method to calculate the area of the Rectangle object
	 * @return the calculated area
	 */
	public double calculateArea()
	{
		return this.rWidth * this.rHeight;
	}

	/**
	 * Method to set the color of a Rectangle object
	 * @param c the desired color
	 */
	public void setColor(Color c)
	{
		color = c;
	}

	/**
	 * Method to determine the color of the next Rectangle object based on the current color being used.
	 * @return the color to be used on the next Rectangle
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
	 * Setter method to set the position of a Rectangle object
	 * @param pos_x the desired x position
	 * @param pos_y the desired y position
	 */
	public void setPos(double pos_x, double pos_y)
	{
		this.xPos = pos_x;
		this.yPos = pos_y;
	}

	/**
	 * Setter method to set the height of a Rectangle object
	 * @param height the desired height
	 */
	public void setHeight(double height)
	{
		this.rHeight = height;
	}

	/**
	 * Setter method to set the width of a Rectangle object
	 * @param width the desired width
	 */
	public void setWidth(double width)
	{
		this.rWidth = width;
	}

	/**
	 * Getter method to access the color of a Rectangle object
	 * @return the color of the Rectangle object
	 */
	public Color getColor()
	{
		return color;
	}

	/**
	 * Getter method to access the x position of a Rectangle object
	 * @return the x position of the Rectangle
	 */
	public double getXPos()
	{
		return this.xPos;
	}

	/**
	 * Getter method to access the y position of a Rectangle object
	 * @return the y position of the Rectangle
	 */
	public double getYPos()
	{
		return this.yPos;
	}

	/**
	 * Getter method to access the height of a Rectangle object
	 * @return the height of the Rectangle
	 */
	public double getHeight()
	{
		return this.rHeight;
	}

	/**
	 * Getter method to access the width of a Rectangle object
	 * @return the width of the Rectangle
	 */
	public double getWidth()
	{
		return this.rWidth;
	}
}