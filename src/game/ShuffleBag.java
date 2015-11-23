package game;

import java.util.Random;

public class ShuffleBag {
	int[] values;
	int currentPos;
	Random rng = new Random(System.currentTimeMillis());
	public ShuffleBag(int[] values)
	{
		this.values = values;
		Reset();
	}
	public void Reset()
	{
		currentPos = values.length-1;
	}
	
	private void swapToEnd(int index)
	{
		int tmpValue = values[index];
		values[index] = values[currentPos];
		values[currentPos] = tmpValue;
		//Removed the used index out of scope. 
		--currentPos;
	}
	public int getNext() throws Exception
	{
		if(currentPos==-1)
		{
			throw new Exception("Shuffle bag has run out of free variables. If this is intended call reset before getting the next variable.");
		}
		//+1 due to the last index being exclusive
		int index = rng.nextInt(currentPos+1);
		int value = values[index];
		swapToEnd(index);
		return value;		
	}
	public static void main(String[] args) {
		ShuffleBag bag = new ShuffleBag(new int[]{1, 2, 3, 4, 5, 6, 7, 8 , 9, 9 ,9});
		try{
			while(true)
			{
				System.out.println(bag.getNext());
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
