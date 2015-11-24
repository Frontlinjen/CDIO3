import java.awt.Color;

import desktop_fields.Tax;
import desktop_resources.GUI;
import game.Slot;
import slots.Field;

public class GameBoard {
	public final static int FIELDCOUNT = 21;
	Field[] fields = new Field[FIELDCOUNT];
	
	private void initializeBoard()
	{
		fields = new Field[] {new Field(1,250), new Field(2,-100), new Field(3,100), new Field(4,-20), new Field(5,180), new Field(6,0), new Field(7,-70), new Field(8,60), new Field(9, -80), new Field(10,-50), new Field(11,650)};
		fields = new Tax[11];
		
		for (int i = 0; i < fields.length; i++) {
			Color col;
			if (i%2 == 0)
			{
				col = new Color(212, 109, 6);
			}
			else
			{
				col = new Color(79, 161, 131);
			}
			Tax t = new Tax.Builder().setBgColor(col).build();
			fields[i] = t;
		}
		for (int i = 0; i < 11; i++){
			fields[i].setDescription(slot[i].getDescription());
			fields[i].setTitle(slot[i].getName());
			fields[i].setSubText(slot[i].getValue()+"");
		}
		GUI.create(fields);
	}
}
