package game;

import slots.Ownable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Property {

	private int fleetOwned=0;
	private int laborCampOwned=0;
	private List<slots.Ownable> properties = new ArrayList<slots.Ownable>();
	
	 
	public Iterator<Ownable> getPropertiesOwned()
	{
		return properties.iterator();
	}
	public void addProperty(Ownable p)
	{
		properties.add(p);
	}
	public int getPropertyCount()
	{
		return properties.size();
	}
	public int getLaborCampOwned()
	{
		return laborCampOwned;
	}
	public int getFleetOwned()
	{
		return fleetOwned;
	}
	
	public void expandFleet() {
		++fleetOwned;
	}
	public void expandLaborCamp() {
		++laborCampOwned;
	}
}
