package game;

public class LaborCamp extends Ownable{

	private int baseRent;
	
	public LaborCamp(int i, Types type, int pos, int price, int baseRent) {
		super(i, type, pos, price);
		this.baseRent = baseRent;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getRent() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void landOnField(Player player) {
		// TODO Auto-generated method stub
		
	}
}
