
public class Dice {

	
	public static int rollDice(int sides)
	{
		return (int) Math.floor(Math.random() * sides) + 1;
	}
	
}
