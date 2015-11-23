package game;

public class Fleet extends Ownable{

	private final int RENT_1 = 500;
	private final int RENT_2 = 1000;
	private final int RENT_3 = 2000;
	private final int RENT_4 = 4000;
	
	public Fleet(int i, Types type, int pos, int price) {
		super(i, type, pos, price);
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
