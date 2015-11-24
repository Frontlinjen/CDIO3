package game;
import java.awt.Color;
import java.util.Random;

import desktop_fields.Tax;
import desktop_resources.GUI;
import game.Field.Types;
public class GameBoard {
	public final static int FIELDCOUNT = 21;
	Field[] fields;
	
	private void initializeBoard()
	{	//translateID, type, pos, price, ...
		int[] positions = new int[FIELDCOUNT];
		for(int i=1;i<=FIELDCOUNT;++i)
		{
			positions[i-1] = i;
		}
		desktop_fields.Brewery b = new desktop_fields.Brewery.Builder().setRent("2000").build();
		
		
		//ShuffleBag shuffle = new ShuffleBag(positions);
		fields = FieldLoader.parseFields("Fields.xml");
		for(Field f : fields)
		{
			System.out.println(f.getName());
		}
		ShuffleBag<Field> shuffle = new ShuffleBag<Field>(fields);
		/*fields = new Field[] {
				new Territory(1,Types.TERRITORY, shuffle.getNext(), 1000, 100),
				new Territory(2,Types.TERRITORY, shuffle.getNext(), 1500, 300),
				new Territory(3, Types.TERRITORY, shuffle.getNext(), 2000, 500), 
				new Territory(4, Types.TERRITORY, shuffle.getNext(), 3000, 700),
				new Territory(5, Types.TERRITORY, shuffle.getNext(), 4000, 1000),
				new Territory(6, Types.TERRITORY, shuffle.getNext(), 4300, 1300),
				new Territory(7, Types.TERRITORY, shuffle.getNext(), 4750, 1600),
				new Territory(8, Types.TERRITORY, shuffle.getNext(), 5000, 2000),
				new Territory(9, Types.TERRITORY, shuffle.getNext(), 5500, 2600),
				new Territory(10, Types.TERRITORY, shuffle.getNext(), 6000, 3200),
				new Territory(11, Types.TERRITORY, shuffle.getNext(), 8000, 4000),
				new Refuge(12, Types.REFUGE, shuffle.getNext(), 5000),
				new Refuge(13, Types.REFUGE, shuffle.getNext(), 500),
				new LaborCamp(14, Types.LABORCAMP, shuffle.getNext(), 2500, 100),
				new LaborCamp(15, Types.LABORCAMP, shuffle.getNext(), 2500, 100),
		}
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
		GUI.create(fields);*/
	}
}
