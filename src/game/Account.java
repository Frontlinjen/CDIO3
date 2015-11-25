package game;

import desktop_resources.GUI;

public class Account {	
	private int gold = 0;
	private String ownerName;
	Account(int balance, String name)
	{
		ownerName = name;
		gold = balance;
	}
	public int getGold() {
		return gold;
	}
	/** 
	 * Attempts to withdraw gold from the player's account.
	 * @param gold
	 * The amount of gold that needs to be withdrawn 
	 * @return
	 * true if the withdrawal was sucessful, false if not. 
	 */
	public boolean withdraw(int gold)
	{
		if(this.gold<gold)
		{
			return false;
		}
		removeGold(gold);
		return true;
	}
	public void setGold(int gold) {
		this.gold = gold;
		if(getGold()<0)
		{
			setGold(0);
		}
		GUI.setBalance(ownerName, getGold());
	}
	
	public void transferTo(Account other, int amount){
		if((getGold()-amount)<=0){
			other.addGold(getGold());
			setGold(0);
		}else{
			removeGold(amount);
			other.addGold(amount);
		}
	}
	
	public void addGold(int gold){
		setGold(gold+getGold());
	}
	
	public void removeGold(int gold){
		setGold(getGold()-gold);
	}
	
	@Override
	public String toString() {
		return "Currently contains: " + gold + " gold";
	}
}
