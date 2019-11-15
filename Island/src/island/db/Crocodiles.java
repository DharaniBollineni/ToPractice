package island.db;

public class Crocodiles extends Creature{

	public Crocodiles(String name, char symbol, String size,int xPosition, int yPosition,IslandWorld world) {
		super(name, "Reptiles", 'O', 20, "Land","No","mid-size",xPosition, yPosition,world);
	}
}
