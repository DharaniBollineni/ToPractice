package island.db;

import java.util.Scanner;

public class EntryPointTest {
	
	private static int xPosition, yPosition;
	private static int size;
	int height =50, width= 30;
	public IslandWorld world = new IslandWorld(width,height); // An island, of a given finite size.
	public IslandWorld world1 = new IslandWorld(60,60); 
	public EntryPointTest() {
		// creating Creature and adding to list allList
		getLocation();
		Rabbit rabbits = new Rabbit("Bubby","mid-size",xPosition, yPosition,world);
		world.addCreature(rabbits);
		getLocation();
		Rat rat = new Rat("jerry","mid-size",xPosition, yPosition,world);		
		world.addCreature(rat);
		getLocation();
		Platypu platypu = new Platypu("Platypu","mid-size",xPosition, yPosition,world);
		world.addCreature(platypu);
				
		// creating plants and adding to list allList
		getLocation();
		Apple apple = new Apple(xPosition, yPosition,2,world);
		world.addPlant(apple);
		
		// creating river and adding to list allList
		getLocation();
		River river = new River(xPosition, yPosition,4,world);
		world.addWaterArea(river);
				
		world.drawWorld();
		world.updateWorld(world);
		
		
		// world2
		// creating Creature and adding to list allList
				getLocation();
				Rabbit rabbits1 = new Rabbit("Bubby","mid-size",xPosition, yPosition,world1);
				world1.addCreature(rabbits1);
				getLocation();
				Rat rat1 = new Rat("jerry","mid-size",xPosition, yPosition,world1);		
				world1.addCreature(rat1);
				getLocation();
				Platypu platypu1 = new Platypu("Platypu","mid-size",xPosition, yPosition,world1);
				world1.addCreature(platypu1);
						
				// creating plants and adding to list allList
				getLocation();
				Apple apple1 = new Apple(xPosition, yPosition,3,world1);
				world1.addPlant(apple1);
				
				// creating river and adding to list allList
				getLocation();
				River river1 = new River(xPosition, yPosition,3,world1);
				world1.addWaterArea(river1);
						
				world1.drawWorld();
				world.updateWorld(world1);
	}	
	
	public void getLocation() {
					
					xPosition = (int)(Math.random() * (width-10)) +1;
					if (xPosition==0)
					{
						xPosition=1;
					}
					yPosition = (int)(Math.random() *( height-10)) +1;
					if (yPosition==0)
					{
						yPosition=1;
					}
				}
			
	public static void main(String[] args) {
		new EntryPointTest();

	}

}


/*
Add grass to your simulation. Grass should grow each turn, but the rabbits do not need to seek it out at this point. Add some grass to each island when it is created.
Add kiwi to your simulation. Assume grubs are found in the ground everywhere and the kiwi can eat wherever it is.
Make rabbits search for food when they are hungry.
Add streams to your simulation. Ensure your creatures act on their thirst.
Have your islands be randomly populated with streams, grass, and creatures.
Add cats. Cats will seek other animals to eat.
Add sparrows. Sparrows can fly.
Add rats.
Add other creatures, plants, or features from the list.
*/