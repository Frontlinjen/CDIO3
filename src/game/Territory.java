package game;

import desktop_resources.GUI;

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
		if(getOwner()==null){
			GUI.getUserLeftButtonPressed(Translator.getString("BUYFIELD", price), Translator.getString("YES"), Translator.getString("NO"));
			if(true){
				//If player have enough money
				if(true){
					setOwner(player);
				}else{
					GUI.showMessage(Translator.getString("NOTENOUGHGOLD"));
				}
			}else{
				GUI.showMessage(Translator.getString("ENDTURN"));
			}
		}


	}
}