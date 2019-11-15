package island.db;

public class Rat extends Creature{

	public Rat(String name, String size,int xPosition, int yPosition,IslandWorld world) {
		super(name, "animal", 'T', 60, "Land","No","small-size",xPosition, yPosition,world);
	}
	
public void eat()  //Rats, large rodents that eat worms and eggs
{
	
}
public void move()
{
	
}

public void seekFood() {}
public void seekWater()	{}
public String toText() {
	return (getName() + " - " + getSpecies() + " - " + getEnergy() + " - " + getxPosition()	+ " - " + getyPosition() + " ");
}

}
