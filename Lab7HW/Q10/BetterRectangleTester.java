
import org.junit.Test;
import org.junit.Assert;

public class BetterRectangleTester
{
	BetterRectangle box = new BetterRectangle(20, 20, 40, 10);
	
	@Test
	public void testPerimeter()
	{	
		double perimeter = box.getPerimeter();
		double expected = 140;
		
		Assert.assertEquals(expected, perimeter, 0.01);
	}
	
	@Test
	public void testArea()
	{
		double area = box.getArea();
		double expected = 1000;
		
		Assert.assertEquals(expected, area, 0.01);
	}
}
