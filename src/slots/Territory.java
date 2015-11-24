package slots;

import desktop_fields.Field;
import desktop_resources.GUI;
import game.Ownable;
import game.Player;
import game.Translator;
import slots.Field.Types;

public class Territory extends Ownable{

	private int rent;

	public Territory(int i, Types type, int pos, int price, int rent) {
		super(i, type, pos, price);
		this.rent = rent;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getRent() {
		// TODO Auto-generated method stub
		return 0;
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
		desktop_fields.Field territory = new desktop_fields.Street.Builder().build();
		territory.setDescription(this.getDescription());
		territory.setTitle(this.getName());
		territory.setSubText(this.price+"");
		return null;
	}
}