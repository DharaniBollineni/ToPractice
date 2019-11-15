package island.db;

public class Sparrow extends Creature
{

	// Sparrows that can live on the island.
	public Sparrow(String name, char symbol, String size, int xPosition, int yPosition,IslandWorld world) {
			super(name, "animal", 'S', 30, "Land-Air","yes","small-size",xPosition, yPosition,world);
		}
		
	}


