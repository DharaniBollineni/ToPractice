package island.db;

public class Creature extends Thing
{
	
	private String name;
	private String species;
	private char symbol;
	private int energy;
	private String livesOn;
	private String flyStatus;
	private String size;
	private IslandWorld world;

	public Creature(String name, String speices, char symbol, int energy,String livesOn,String flyStatus,String size,int xPosition, int yPosition, IslandWorld world) {
			super(xPosition, yPosition);
			this.name = name;
			this.species = speices;
			setSymbol(symbol);
			this.energy = energy;
			this.world = world;	
			this.livesOn =livesOn;
			this.flyStatus = flyStatus;
			this.size=size;
			setxPosition(xPosition);
			setyPosition(yPosition);

		
	}

	@Override
	public String toText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void move()
	{
		for (int i = 0; i < 10; i++) {
		int direction = (int) (Math.random() * 4 + 1);
		if (direction == 1)
		{ // added world --> check this
			setyPosition(getyPosition() - 1);
		} else if (direction == 2) {
			setyPosition(getyPosition() + 1);
		} else if (direction == 3) {
			setxPosition(getxPosition() + 1);
		} else {
			setxPosition(getxPosition() - 1);

		}
		}
	}
	
	protected void seekFood()       // Perform method overriding
	{
		// if energy is < hugryLevel
	}
	protected void seekWater()       // Perform method overriding
	{
		// if energy is < hugryLevel
	}

	@Override
	public void grow() {
		// TODO Auto-generated method stub
		
	}
	
	// getter and setter
	

}
