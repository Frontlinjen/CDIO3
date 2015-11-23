package game;

import desktop_resources.GUI;

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

	public void setOwner(Player owner) {
		this.owner = owner;
	}
	
}