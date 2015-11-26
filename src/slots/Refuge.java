package slots;

import java.awt.Color;

import desktop_resources.GUI;
import game.Player;
import game.Translator;
import slots.Field.Types;

public class Refuge extends Field{


	private int bonus;
	desktop_fields.Street refuge; 
	
	
	public Refuge(int i, Types type, int bonus) {
		super(i, type);
		this.bonus = bonus;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void landOnField(Player player) {
		refuge.displayOnCenter();
		GUI.showMessage(Translator.getString("LANDONREFUGE", bonus));
		player.getAccount().addGold(bonus);		
	}
	@Override
	public desktop_fields.Field pushToGUI(int position){
		this.position = position;
		refuge = new desktop_fields.Street.Builder().setBgColor(new Color(223f/255, 255f/255, 43f/255)).build();
		refuge.setDescription(this.getDescription());
		refuge.setTitle(this.getName());
		refuge.setSubText(this.bonus+"");
		return refuge;
	}
	
}
