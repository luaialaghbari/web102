
import java.awt.Rectangle;


public class BetterRectangle extends Rectangle
{
	
	public BetterRectangle(int xLeft, int yLeft, int width, int height)
	{
		super.setLocation(xLeft, yLeft);
		super.setSize(width, height);
	}
	
	
	public double getPerimeter()
	{	
		return (getWidth() * 2) + (getHeight() * 2);
	}
	
	
	public double getArea()
	{
		return getWidth() * getHeight();
	}
}
