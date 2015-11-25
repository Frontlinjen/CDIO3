package slots;

import game.Player;
import slots.Field.Types;

public class Refuge extends Field{


	private int bonus;
	
	
	public Refuge(int i, Types type, int pos, int bonus) {
		super(i, type, pos);
		this.bonus = bonus;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void landOnField(Player player) {
		player.getAccount().addGold(bonus);		
	}
	@Override
	public desktop_fields.Field pushToGUI(int position){
		desktop_fields.Refuge refuge = new desktop_fields.Refuge.Builder().build();
		refuge.setDescription(this.getDescription());
		refuge.setTitle(this.getName());
		refuge.setSubText(this.bonus+"");
		return refuge;
	}
	
}
