package studio7;

public class Fraction {
	private int demon;
	private int numer;

	public Fraction( int numer,int demon)
	{
		this.demon = demon;
		this.numer = numer;
	}

	public Fraction getAdding( Fraction other )
	{
		if ( this.demon == other.demon)
		{
			int newNumer = (this.numer + other.numer);
			Fraction sum = new Fraction(newNumer, this.demon);
			return sum;
		}
		else 
		{
			int newDemon = (this.demon * other.demon);
			int newNumerOne = (this.numer* other.demon);
			int newNumerTwo = (other.numer*this.demon);

			Fraction sum = new Fraction ( (newNumerOne+newNumerTwo), newDemon);
			return sum;
		}

	}

	public Fraction getProduct(Fraction other)
	{
		int newNumer = (this.numer * other.numer);
		int newDemon = ( this.demon * other.demon);
		Fraction product = new Fraction ( newNumer, newDemon);
		return product;
	}

	public static void main(String[] args) {
		Fraction one = new Fraction(2,5);
		Fraction two = new Fraction(3,7);
		Fraction sum = one.getAdding(two);
		System.out.println( sum.numer + "/" + sum.demon);
		Fraction product = one.getProduct(two);
		System.out.println( product.numer + "/" + product.demon);

	}

}
