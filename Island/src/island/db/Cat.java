package island.db;

public class Cat extends Creature{

	// Cats that can live on the island.
	public Cat(String name, char symbol, String size,int xPosition, int yPosition,IslandWorld world) {
		super(name, "animal", 'C', 30, "Land","No","mid-size",xPosition, yPosition,world);
	}
	
	/*construtor helps to create object by passing values to parent(Creature).
	Cats that can live on the island and Cats, mid-sized land animals with good vision and high speed that prefer to eat birds, but will eat rodents
	eat()Cats will seek other animals to eat  --> increase the energy 
	move()--> 10 and search for food etc rat*/
	public void seekFood() {}
	public void seekWater()	{}
	public void eat()  //Rats, large rodents that eat worms and eggs
	{
		
	}
	public void move()
	{
		
	}

	
}
