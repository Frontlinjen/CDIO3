package slots;

import desktop_resources.GUI;
import game.Player;
import game.Translator;

public class Tax extends Field{

	private int taxAmount;
	private int taxRate = -1;
	
	public Tax(int i, Types type, int pos, int price) {
		super(i, type, pos);
		this.taxAmount = taxAmount;
	}

	public void landOnField(Player player) {
		if (GUI.getUserLeftButtonPressed(Translator.getString(getDescription()), Translator.getString("YES"), Translator.getString("NO"))) {
			player.getAccount().withdraw((player.getAccount().getGold()/10));
		}
		else {
			player.getAccount().withdraw(taxAmount);
		}
	}
}
