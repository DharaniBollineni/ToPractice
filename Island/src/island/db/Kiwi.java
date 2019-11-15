package island.db;

public class Kiwi extends Creature
{

	//Kiwi that can live on the island.
	public Kiwi(String name, char symbol, String size, int xPosition, int yPosition,IslandWorld world) {
		super(name, "Bird", 'K', 30, "Land","yes","mid-size",xPosition, yPosition,world);
	
	}

}
