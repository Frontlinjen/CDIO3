package test;

import static org.junit.Assert.*;

import org.junit.Test;

import game.Player;
import slots.Tax;
import slots.Territory;
import slots.Field.Types;

public class TerritoryTest {

	@Test
	public void test() {
		Territory territory = new Territory(1, Types.TERRITORY, 2500, 1000);

		Player player = new Player("Test");
		Player player2 = new Player("Test2");
		player.getName();

		territory.pushToGUI(1);
		player.move(1);
		territory.landOnField(player);
		player2.move(1);
		territory.landOnField(player2);
		
		assertTrue(
				player.getAccount().getGold()== 28500 && player2.getAccount().getGold()== 29000 ||
				player.getAccount().getGold()== 30000 && player2.getAccount().getGold()== 27500 ||
				player.getAccount().getGold()== 30000 && player2.getAccount().getGold()== 30000 
				);
		}

}
