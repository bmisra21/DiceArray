
public class DiceArray 
{
	public static void main (String[] args) 
	{
		DiceClass dice1 = new DiceClass();
		DiceClass dice2 = new DiceClass();
		int[] count;
		count = new int[13];
		
		for (int i=0; i<1000; ++i)
		{
			int sum = dice1.roll() + dice2.roll();
			count [sum]+=1;
		}
		
		for (int i = 2; i<13; ++i)
		{
			System.out.println("You rolled");
		}
	}
	
}
