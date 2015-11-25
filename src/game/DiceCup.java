package game;

import java.util.Random;

public class DiceCup {

	private int[] diceArray;
	private Random rGen = new Random(System.currentTimeMillis());
	
	public DiceCup(int numberOfDice){
		
		diceArray = new int[numberOfDice];
				
	}
		public DiceResult rollDice(){
		
			for(int i=0; i < diceArray.length; i++){
				diceArray[i] = rGen.nextInt(6)+1;
			}
			return new DiceResult(diceArray);
		}
}
