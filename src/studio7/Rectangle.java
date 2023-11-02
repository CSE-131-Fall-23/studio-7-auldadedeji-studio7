package studio7;

public class Rectangle {
	private double width;
	private double length;
	private double yLeftCorner;
	private double xleftCorner;

	public Rectangle (double width, double length, double yLeftCorner, double xLeftCorner)
	{
		this.width = width;
		this.length = length;
		this.yLeftCorner = yLeftCorner;
		this.xleftCorner = xLeftCorner;


	}
	public double getArea()
	{
		return this.width * this.length;
	}

	public double getPerimeter()
	{
		return (this.width*2)+(this.length*2);
	}
	public boolean isSquare()
	{
		return this.width == this.length;
	}
	public String whatsBigger( Rectangle other)
	{
	if ( other.getArea() > this.getArea())
	{
		return "The other rectangle is bigger";
	}
	else 
	{
		return "This rectangle is biggeer";
	}
	}
	public static void main(String[] args) {
		Rectangle one = new Rectangle( 5.2, 4.5, 1, 1 );
		Rectangle two = new Rectangle( 3.4, 2.3, 1, 1);
		System.out.println( one.getArea());
		System.out.println( one.getPerimeter());
		System.out.println(one.isSquare());
		System.out.println( one.whatsBigger(two));
	}

}
