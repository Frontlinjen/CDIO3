package slots;

import game.Player;
import slots.Field.Types;

public class Refuge extends Field{


	private int bonus;
	desktop_fields.Refuge refuge; 
	
	
	public Refuge(int i, Types type, int bonus) {
		super(i, type);
		this.bonus = bonus;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void landOnField(Player player) {
		player.getAccount().addGold(bonus);		
	}
	@Override
	public desktop_fields.Field pushToGUI(int position){
		this.position = position;
		refuge = new desktop_fields.Refuge.Builder().build();
		refuge.setDescription(this.getDescription());
		refuge.setTitle(this.getName());
		refuge.setSubText(this.bonus+"");
		return refuge;
	}
	
}
