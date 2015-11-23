package game;

import desktop_resources.GUI;

public class Fleet extends Ownable{

	private final int RENT_1 = 500;
	private final int RENT_2 = 1000;
	private final int RENT_3 = 2000;
	private final int RENT_4 = 4000;
	
	public Fleet(int i, Types type, int pos, int price) {
		super(i, type, pos, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getRent() {
	switch (getOwner().getProperty().getFleetOwned()){
	case 1: {
		return RENT_1;
	}
	case 2: {
		return RENT_2;
	}
	case 3: {
		return RENT_3;
	}
	case 4: {
		return RENT_4;
	}
	default: {
		
	}
	}
		return 0;
	}

	@Override
	public void landOnField(Player player) {
		if(checkOwner(player)){
			GUI.showMessage(Translator.getString("PAYTHEOWNER", getRent()));
			player.getAccount().transferTo(getOwner().getAccount(), getRent());
		}
		
	}
}
