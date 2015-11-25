package game;


public class Player {
	
	private String name;
	private int position = 0;
	/**
	 * Each player has their own set of dice which keeps track of their rolls. 
	 */
	private Account account;
	private Property propertyOwned = new Property();
	
	DiceCup dice = new DiceCup(2);
	
	public DiceCup getDice()
	{
		return dice;
	}
	
	public Player(String s)
	{
		name = s;
		account = new Account(30000, name);
	}
	public String getName()
	{
		return name;	
	}
	public Account getAccount()
	{
		return account;
	}
	public Property getProperty()
	{
		return propertyOwned;
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
		position += afstand; //l�g den flyttede afstand til den gamle position
		
		if(position > ANTALSLOTS){ //Bestem om den nye position er overskrider spillepladen. Hvis den g�r tr�kker man antallet af pladser fra positionen for at finde den nye position
			position -= ANTALSLOTS;
		}
	}
	
	public int getPosition(){
		return position;
	}
}
 