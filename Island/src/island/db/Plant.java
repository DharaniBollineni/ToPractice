package island.db;

public class Plant extends Thing
{
	private char symbol;
	private int size;//=0;
	private IslandWorld world;

	public Plant(int xPosition, int yPosition,int size,IslandWorld world) {
		super(xPosition, yPosition);
		//this.size=size;
		setSize(size);
		setSymbol((char)(size+'0'));
		this.world = world;
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
		if(getSize()<9)
		{
			size=getSize();
			setSize(size+1);
			setSymbol((char)(getSize()+'0'));
		}
	}

}
