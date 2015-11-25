package slots;

import java.awt.Color;

import desktop_resources.GUI;
import slots.Ownable;
import game.Player;
import game.Translator;

public class Territory extends Ownable{

	private int rent;
	desktop_fields.Street territory;

	public Territory(int i, Types type, int price, int rent) {
		super(i, type,price);
		this.rent = rent;
	}


	public int getRent() {
		return rent;
	}

	@Override
	public void landOnField(Player player) {
		if(checkOwner(player)){
			GUI.showMessage(Translator.getString("PAYTHEOWNER", rent));
			player.getAccount().transferTo(getOwner().getAccount(), rent);
		}
	}

	@Override
	public desktop_fields.Field pushToGUI(int position) {
		this.position = position;
		territory = new desktop_fields.Street.Builder().setRent(rent+"").setBgColor(Color.GREEN).build();
		territory.setDescription(this.getDescription());
		territory.setTitle(this.getName());
		territory.setSubText(this.price+"");
		return territory;
	}
}