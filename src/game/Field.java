package game;


public class Field {

	private int id;
	private Types type;
	//private String type;
	
	public enum Types {
		TERRITORY, REFUGE, LABORCAMP, TAX, FLEET
	}
		
	
	
	public Field(int i, Types type){
		id = i;
		this.type = type;
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
	
	
}
