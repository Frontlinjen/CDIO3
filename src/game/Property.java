package game;

public class Property {

	private int fleetOwned=0;
	private int laborCampOwned=0;
	
	public int getFleetOwned()
	{
		return fleetOwned;
	}
	
	public int getLaborCampOwned()
	{
		return laborCampOwned;
	}
	
	public void expandFleet() {
		++fleetOwned;
	}
	public void expandLaborCamp() {
		++laborCampOwned;
	}
}
