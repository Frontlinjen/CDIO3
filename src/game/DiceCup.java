package game;

import java.util.Random;

public class DiceCup {

	int[] diceArray;
	Random rGen = new Random(System.currentTimeMillis());
	
	public DiceCup(int numberOfDice){
		
		int[] diceArray = new int[numberOfDice];
				
	}
		public DiceResult rollDice(){
		
			for(int i=0; i < diceArray.length; i++){
				diceArray[i] = rGen.nextInt(6)+1;
			}
			return new DiceResult(diceArray);
		}
}
