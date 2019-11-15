package island.db;

public class Rabbit extends Creature
{

	//Rabbits that can live on the island and move about randomly each turn.
	
	public Rabbit(String name, String size,int xPosition, int yPosition,IslandWorld world) {
		super(name, "animal", 'R', 40, "Land","No","mid-size",xPosition, yPosition,world);
	}
	
	public String toText() {
		return (getName() + " - " + getSpecies() + " - " + getEnergy() + " - " + getxPosition()	+ " - " + getyPosition() + " ");
	}
	
	public void seekFood() {}
	public void seekWater()	{}
//		System.out.println("test1"+xPosition);
//		System.out.println("test2"+yPosition);
	}
	// serachForFood() if hungry
	
	// eat () --> increase the energy
	// move()--> 10 and search for food.


