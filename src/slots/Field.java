package slots;

import game.Player;
import game.Translator;

public abstract class Field {

	private int translateID;
	private Types type;
	private int position;
	//private String type;
	
	public enum Types {
		TERRITORY, REFUGE, LABORCAMP, TAX, FLEET
	}
		
	
	
	public Field(int i, Types type, int pos){
		translateID = i;
		this.type = type;
		position = pos;
	}

	public String getName() {
		return Translator.getString("SLOT" + translateID);
	}

	public String getDescription() {
		return Translator.getString("SLOTDSC" + translateID);
	}

	@Override
	public String toString() {
		return "Slot [id=" + translateID + ", title" + getName() + "]";
	}
	
	public abstract void landOnField (Player player);
}

