package game;

import slots.*;
import desktop_resources.GUI;

public class GameBoard {

	Field[] fields;
	public void initializeBoard()
	{	
		//desktop_fields.Brewery b = new desktop_fields.Brewery.Builder().setRent("2000").build();
		
		
		fields = FieldLoader.parseFields("Fields.xml");
		for(Field f : fields)
		{
			System.out.println(f.getName());
		}
		ShuffleBag<Field> shuffle = new ShuffleBag<Field>(fields);
		desktop_fields.Field[] guiFields = new desktop_fields.Field[fields.length];
		
		int pos = 1;
		while(shuffle.elementsLeft()>0)
		{
			Field f;
			try {
				f = shuffle.getNext();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			desktop_fields.Field guiField = f.pushToGUI(pos++);
			guiFields[pos-1] = guiField;
		}
		
		GUI.create(guiFields);
	}
	public int getFieldCount()
	{
		return fields.length;
	}
	public Field getField(int index)
	{
		try
		{
			return fields[index];
		}
		catch(IndexOutOfBoundsException e)
		{
			throw new IndexOutOfBoundsException("Attempt to access a non-existing field");
		}
	}
}
