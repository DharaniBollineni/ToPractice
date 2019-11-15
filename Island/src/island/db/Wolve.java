package island.db;

public class Wolve extends Creature{

	public Wolve(String name, char symbol, String size,int xPosition, int yPosition,IslandWorld world) {
		super(name, "animal", 'V', 30, "Land","No","large-size",xPosition, yPosition,world);
	}

}
