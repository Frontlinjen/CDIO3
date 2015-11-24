package slots;

import desktop_resources.GUI;
import slots.Ownable;
import game.Player;
import game.Translator;
import slots.Field.Types;

public class LaborCamp extends Ownable{

	private int baseRent;
	
	public LaborCamp(int i, Types type, int pos, int price, int baseRent) {
		super(i, type, pos, price);
		this.baseRent = baseRent;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getRent() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	@Deprecated 
	public void landOnField(Player player) {
		if(checkOwner(player)){
			GUI.showMessage(Translator.getString("PAYTHEOWNER", baseRent));
			player.getAccount().transferTo(getOwner().getAccount(), baseRent);
		}
	}
	public desktop_fields.Field pushToGUI(int position){
		desktop_fields.Brewery LaborCamp = new desktop_fields.Brewery.Builder().build();
		LaborCamp.setDescription(this.getDescription());
		LaborCamp.setTitle(this.getName());
		LaborCamp.setSubText(price+"");
		LaborCamp.setSubText(baseRent+"");
		return LaborCamp;
	}
}
