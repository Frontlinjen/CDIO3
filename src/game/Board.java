package game;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import desktop_fields.Tax;
import desktop_resources.GUI;
import slots.Ownable;

public class Board {
	private GameBoard slots = new GameBoard();
	private Tax[] fields;
	private List<Player> players = new ArrayList<Player>();
	
	private Player currentPlayer;
	
	public Player getCurrentPlayer()
	{
		return currentPlayer;
	}
	public void createPlayer(String name)
	{
		Player newPlayer = new Player(name);
		players.add(newPlayer);
		GUI.addPlayer(name, 30000);
		desktop_board.Board.getInstance().updatePlayers();
	}
	boolean verifyName(String s)
	{
		if(s.isEmpty())
		{
			return false;
		}
		
			//Checks if the string contains a whitespace character
			Pattern pattern = Pattern.compile("\\s");
			java.util.regex.Matcher m = pattern.matcher(s);
			
			return (!m.find());
		
	}
	private boolean setupPlayer(String user){
		if (!verifyName(user) || user.length() > 15)
		{
			return false;
		}
		for(Player i : players) {
			if (i.getName().equals(user)){
				return false;
			}
		}
		createPlayer(user);
		return true;
	}
	
	private void setupPlayers(int i) {
		for(int j = 0; j < i; j++) {
			String user;
			if(players.isEmpty())
			{
				 user = GUI.getUserString(Translator.getString("ENTERNAME1"));
			}
			else
			{
				user = GUI.getUserString(Translator.getString("ENTERNAME2"));
			}
		while(setupPlayer(user) == false) {
			user = GUI.getUserString("NAMEERROR");
		}
		}
	}

	/**
	 * Advances to the next player. 
	 */
	private void swapPlayers()
	{
		int pos = players.indexOf(currentPlayer);
		//Checks to see if we will surpass the bonds 
		if(pos+1 >= players.size())
		{
			//If it does, then we have reached the end of the list and shall therefore start over
			currentPlayer = players.get(0);

		}
		else
		{
			//If it doesn't, then advance to the next player. 
			currentPlayer = players.get(pos+1);
		}
	}

	private void AdvanceGame(BaseDice dice)
	{
		int tempResult = dice.result()-2;
		GUI.removeAllCars(currentPlayer.getName());
		GUI.setCar(tempResult+1, currentPlayer.getName());
		//currentPlayer.addPoints(slot[tempResult].getValue());
		fields[tempResult].displayOnCenter();
	}
	
	public void startGame(){
		System.out.println("Starting game..");
		slots.initializeBoard();
		int amount = GUI.getUserInteger(Translator.getString("NUMBEROFPLAYERS"));
		setupPlayers(amount);
		//GUI.addPlayer("Test", 0);
		setupPlayer("Test");
		for (int i = 0; i < slots.getFieldCount(); i++) {
			slots.Field f = slots.getField(i);
			
			if(f instanceof Ownable)
			{
				((Ownable)f).setOwner(players.get(0));
			}
		}
	
		GUI.showMessage("HI!");
		/*setupPlayers(amount);
		boolean running = true;
		while(running)
		{
			currentPlayer = players.get(0);
			
			while(true){

				GUI.getUserButtonPressed(Translator.getString("NEXTTURN") + " " + currentPlayer.getName(), Translator.getString("ROLL"));

				BaseDice tempDice = currentPlayer.getDice();
				tempDice.rollDice();
				AdvanceGame(tempDice);
				if(currentPlayer.getPoints() >= 3000){
				
					break;
				}
				*/
				/*When tempDice.result is equal to 10, it results in 8 (see tempResult), 
				 * so the player lands on array[8], which gives another turn.
				 */
		/*
				else if(tempDice.result() == 10){
					GUI.getUserButtonPressed(currentPlayer.getName() + " " + Translator.getString("EXTRATURN"), Translator.getString("OK"));
					continue;
				}
				else{
					swapPlayers();
				}	
				
			}
			if(GUI.getUserLeftButtonPressed(currentPlayer.getName() + " " + Translator.getString("ENDGAMEBUTTON1"), Translator.getString("ENDGAMEBUTTON2"), Translator.getString("ENDGAMEBUTTON3"))) {
				for(Player player : players) {
					player.setPoints(1000);
					GUI.removeAllCars(player.getName());
				}

			}
			else {
				running = false;
			}
		}
		*/
		//GUI.close();

	}
	public static void main(String[] args) {
		Board board = new Board();
		board.startGame();
	}
	@Override
	public String toString() {
		return "Board []";
	}
	

}
