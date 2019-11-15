package island.db;

public class Platypu extends Creature
{

	public Platypu(String name, String size,int xPosition, int yPosition,IslandWorld world) {
		super(name, "animal", 'P', 40, "Land-Water","No","medium-sized",xPosition, yPosition,world);
	}
	
public void eat()  //Rats, large rodents that eat worms and eggs
{
	
}
public void move()
{
	
}
public void layEggs()
{
	// medium-sized egg-laying amphibians
}
public void seekFood() {}
public void seekWater()	{}
public String toText() {
	return (getName() + " - " + getSpecies() + " - " + getEnergy() + " - " + getxPosition()	+ " - " + getyPosition() + " ");
}

}
