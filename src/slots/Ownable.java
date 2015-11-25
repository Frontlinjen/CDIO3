package slots;

import game.*;
import desktop_resources.GUI;
import slots.Field;

public abstract class Ownable extends Field{

	public Ownable(int i, Types type, int price) {
		super(i, type);
		this.price = price;
		// TODO Auto-generated constructor stub
	}

	protected int price;
	private Player owner;
	
	public abstract int getRent();

	public Player getOwner() {
		return owner;
	}
	public void removeOwner()
	{
		this.owner = null;
		GUI.setOwner(getPosition(), null);
		
	}
	public void setOwner(Player owner) {
		System.out.println(getName() + " now has " + owner.getName() + " as their owner" + " at slot " + getPosition());
		this.owner = owner;
		//desktop_codebehind.Player player = desktop_board.Board.getInstance().getPlayer(owner.getName());
		GUI.setOwner(getPosition(), owner.getName());
	}
	
	public boolean checkOwner(Player visitor){
		if(getOwner()!=null && getOwner()!=visitor)
			return true;
		
			return false;
	}
}