package game;


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
		return Translator.getString("SLOT" + id);
	}

	public String getDescription() {
		return Translator.getString("SLOTDSC" + id);
	}

	@Override
	public String toString() {
		return "Slot [id=" + id + ", title" + getName() + "]";
	}
	
	public abstract void landOnField (Player player);
}

