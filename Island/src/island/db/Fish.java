package island.db;

public class Fish extends Creature{

	public Fish(String name, char symbol, String size,int xPosition, int yPosition,IslandWorld world) {
		super(name, "Fish", 'F', 30, "Water","No","mid-size",xPosition, yPosition,world);
	}
}
