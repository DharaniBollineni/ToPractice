package island.db;

public class Worm extends Creature{

	public Worm(String name, char symbol, String size,int xPosition, int yPosition,IslandWorld world) {
		super(name, "worm", 'W', 30, "Land-water","No","mid-size",xPosition, yPosition,world);
	}

}
