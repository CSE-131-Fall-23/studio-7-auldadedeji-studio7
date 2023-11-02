package studio7;

public class Die {
private int sides;

public Die(int sides)
{
	this.sides = sides;
}

public int numberRolled()
{
	return (int)(Math.random()*(sides)+1);
}
	public static void main(String[] args) {
		Die one = new Die(6);
		Die two = new Die(12);
		System.out.println(one.numberRolled());
		System.out.println(two.numberRolled());
	}

}
