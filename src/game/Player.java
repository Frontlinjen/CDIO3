package game;

import desktop_resources.GUI;

public class Player {
	
	private String name;
	private int position;
	/**
	 * Each player has their own set of dice which keeps track of their rolls. 
	 */
	private BaseDice dice = new DicePair();
	private Account account = new Account();
	
	
	public Player(String s)
	{
		name = s;
		setPoints(30000);
	}
	public String getName()
	{
		return name;	
	}
	public int getPoints()
	{
		return account.getGold();
	}
	public void setPoints(int p)
	{
		//GUI.removeAllCars(name);
		account.setGold(p);
		//GUI.setCar(Math.min(points, 40), name);
		GUI.setBalance(name, getPoints());
	}
	public void addPoints(int p)
	{
		setPoints(getPoints()+p);
	}
	public BaseDice getDice()
	{
		return dice;
	}

	@SuppressWarnings("unused")
	private Player()
	{}

	@Override
	public String toString() {
		return "Playername : " + getName() + " " + account.getGold() + "gold";
	}
	
	public void move (int afstand){
		final int ANTALSLOTS = 21;
		position =+ afstand; //læg den flyttede afstand til den gamle position
		
		if(position >= ANTALSLOTS){ //Bestem om den nye position er overskrider spillepladen. Hvis den gør trækker man antallet af pladser fra positionen for at finde den nye position
			position =- ANTALSLOTS;
		}
	}
}
 