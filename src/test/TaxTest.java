package test;

import static org.junit.Assert.*;

import org.junit.Test;

import game.Account;
import game.Player;
import slots.Field.Types;
import slots.Tax;

public class TaxTest {

	@Test
	public void test() {
		Tax tax = new Tax(1, Types.TAX, 3000);

		Player player = new Player("Test");

		tax.pushToGUI(1);
		player.move(1);
		tax.landOnField(player);
		System.out.println(player.getAccount().getGold());
		
		assertFalse(player.getAccount().getGold()!= 27000);
	}

}
