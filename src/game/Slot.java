package game;


public class Slot {

	private int price;
	private int id;
	private int rent;
	private Types type;
	//private String type;
	
	public enum Types {
		TERRITORY, REFUGE, LABORCAMP, TAX, FLEET
	}
		
	
	
	public Slot(int i, int pr, int ren, Types type){
		price = pr;
		id = i;
		rent = ren;
		this.type = type;
	}

	public int getPrice() {
		return price;
	}
	public String getName() {
		return Translator.getString("SLOT" + id);
	}
	public int getRent(){
		return rent;
	}
	public String getDescription() {
		return Translator.getString("SLOTDSC" + id);
	}

	@Override
	public String toString() {
		return "Slot [Price=" + price + ", rent=" + rent + ", id=" + id + ", title" + getName() + "]";
	}
	
	
}
