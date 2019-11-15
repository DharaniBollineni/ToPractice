package island.db;

import java.util.ArrayList;
import java.util.List;

public class IslandWorld {

	int width;
	int height;
	public static char worldScreen[][];
	private List<Thing> allList = new ArrayList<>();
	
	public IslandWorld(int width, int height) {
		this.width=width;
		this.height=height;
		worldScreen = new char[width][height];
	}
	
	
	// add plant to the list
		public void addPlant(Plant p) {
			allList.add(p);
		}
		// add Food to the list 
		public void addCreature(Creature c) {
			allList.add(c);
		}
		
		public void addWaterArea(Water w)
		{
			allList.add(w);
			
		}
		public void drawWorld() {
			for (int i = 0; i < width; i++) {
				for (int j = 0; j < height; j++) {
					if (j == 0 || j == height - 1) {
						worldScreen[i][j] = '|'; // left and right
					} else if ((i == 0 || i == width - 1)) { // top and bottom
						worldScreen[i][j] = '-';
					} else {
						worldScreen[i][j] = ' '; // other/inside
					}
				}
			}
			
			for (Thing t : allList) {
				int x = t.getxPosition(); // eg:30
				int y = t.getyPosition(); // eg:40
				System.out.println("Item" + t.getSymbol());
				worldScreen[x][y] = t.getSymbol();

			}
			// print all objects
			for (int i = 0; i < width; i++) {
				for (int j = 0; j < height; j++) {
					System.out.print(worldScreen[i][j]);
				}
				System.out.println();
			}
			

		}
		public void updateWorld(IslandWorld world)
		{
			// move creatures 
			for (Thing b : allList) {				
					if (b instanceof Creature) {
						// check use of this
						((Creature) b).move();					
				}
		}
			// grow plants 
			for (Thing b : allList) {				
				if (b instanceof Plant) {
					// check use of this
					((Plant) b).grow();					
			}
			
			drawWorld();
			
		}
		}
		public void printDetails()
		{
			
		}
		
		// get each object type list
		private List<Plant> getAllPlants() {
			List<Plant> list = new ArrayList<>();
			for (Thing s : allList) {
				if (s instanceof Plant) {
					list.add((Plant) s);
				}
			}
			return list;
		}

		private List<Creature> getAllCreature() {
			List<Creature> list = new ArrayList<>();
			for (Thing s : allList) {
				if (s instanceof Creature) {
					list.add((Creature) s);
				}
			}
			return list;
		}

		private List<Water> getAllWater() {
			List<Water> list = new ArrayList<>();
			for (Thing s : allList) {
				if (s instanceof Water) {
					list.add((Water) s);
				}
			}
			return list;
		}
		
		// getter and setters
		public int getWidth() {
			return width;
		}


		public void setWidth(int width) {
			this.width = width;
		}


		public int getHeight() {
			return height;
		}


		public void setHeight(int height) {
			this.height = height;
		}


		public static char[][] getWorldScreen() {
			return worldScreen;
		}


		public static void setWorldScreen(char[][] worldScreen) {
			IslandWorld.worldScreen = worldScreen;
		}


		public List<Thing> getAllList() {
			return allList;
		}


		public void setAllList(List<Thing> allList) {
			this.allList = allList;
		}
		
}
