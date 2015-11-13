package game;

import java.util.Random;

public class DicePair extends BaseDice{
	private DiceResult latestRoll;

	
	Random psudoGen = new Random(System.currentTimeMillis());

	@Override
	public void rollDice()
	{
		int firstDie = psudoGen.nextInt(6)+1; //Returns a number between 1 and 6 since 6 is exclusive. 
		int secondDie = psudoGen.nextInt(6)+1;
		latestRoll = new DiceResult(firstDie, secondDie);
 	}
	@Override
	public int result(){
		return latestRoll.getSum();
	}

	@Override
	public String toString() {
		return "DicePair [getFirstDie " + latestRoll.getFirstDice() + ", getSecondDie " + latestRoll.getSecondDice() + ", getSum " + latestRoll.getSum() + "]";
	}

	
}
