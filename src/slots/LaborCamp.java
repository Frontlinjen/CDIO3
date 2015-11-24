package slots;

import desktop_resources.GUI;
import game.Ownable;
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
}
