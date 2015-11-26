package test;

import static org.junit.Assert.*;
import game.DiceCup;
import game.DiceResult;

import org.junit.Test;

public class DiceCupTest {

	@Test
	public void testArrayLength() {
		final int TRUELENGTH = 1000;
		DiceCup dice = new DiceCup(TRUELENGTH);
		int a = dice.rollDice().getDiceAmount();
		
		assertTrue("Failed to create array with requested length", a == TRUELENGTH);
		
	}

	@Test
	public void testProbability(){
		
		
	}
}
