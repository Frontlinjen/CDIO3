package slots;

import desktop_resources.GUI;
import game.Player;
import game.Translator;

public class Tax extends Field{

	private int taxAmount;
	private int taxRate = -1;
	desktop_fields.Tax tax;
	
	public Tax(int i, Types type, int price) {
		super(i, type);
		this.taxAmount = price;
	}

	@Override
	public void landOnField(Player player) {
		if (GUI.getUserLeftButtonPressed(getDescription(), Translator.getString("YES"), Translator.getString("NO"))) {
			player.getAccount().withdraw((player.getAccount().getGold()/10));
		}
		else {
			player.getAccount().withdraw(taxAmount);
		}
	}

	@Override
	public desktop_fields.Field pushToGUI(int position) {
		this.position = position;
		tax = new desktop_fields.Tax.Builder().build();
		tax.setDescription(this.getDescription());
		tax.setTitle(this.getName());
		tax.setSubText(taxAmount + "");
		return tax;
	}
	
}
