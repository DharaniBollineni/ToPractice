package island.db;

public class Water extends Thing{

	private int size;
	private IslandWorld world;
	private char symbol;
	
	//Water patches or streams that can appear on the island.
	public Water(int xPosition, int yPosition,char symbol, int size,IslandWorld world) {
		super(xPosition, yPosition);
		this.size=size;
		this.world = world;
		setSymbol(symbol);
		setxPosition(xPosition);
		setyPosition(yPosition);	
		
	}

	@Override
	public String toText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void grow() {
		// TODO Auto-generated method stub
		
	}
		
	

}
