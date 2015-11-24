package slots;

import desktop_resources.GUI;
import slots.Field;

public abstract class Ownable extends Field{

	public Ownable(int i, Types type, int pos, int price) {
		super(i, type, pos);
		this.price = price;
		// TODO Auto-generated constructor stub
	}

	protected int price;
	private Player owner;
	
	public abstract int getRent();

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}
	
	public boolean checkOwner(Player visitor){
		if(getOwner()!=null && getOwner()!=visitor)
			return true;
			
				if(GUI.getUserLeftButtonPressed(Translator.getString("BUYFIELD", price), Translator.getString("YES"), Translator.getString("NO"))){
					if(visitor.getAccount().withdraw(price)){
						setOwner(visitor);
					}else{
						GUI.showMessage(Translator.getString("NOTENOUGHGOLD"));
					}
				}
				else{
					GUI.showMessage(Translator.getString("ENDTURN"));
				}
			return false;
	}
}