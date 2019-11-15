package island.db;

public abstract class Thing {

	private int islandWidth;
	private int islandHeight;
	private int xPosition;
	private int yPosition;
	private char symbol;
	private int size;
	private String liveOn;
	private String canFly;
	private int hungryLevel=2;
	private String name;
	private String species;
	private String energy;
	
	public Thing(int x, int y) {
		this.islandWidth = x;
		this.islandHeight = y;
	}
	
	public abstract String toText();
	public abstract void move();
	public abstract void grow();
	
	// getter and setters 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getEnergy() {
		return energy;
	}

	public void setEnergy(String energy) {
		this.energy = energy;
	}
	public int getIslandWidth() {
		return islandWidth;
	}

	public void setIslandWidth(int islandWidth) {
		this.islandWidth = islandWidth;
	}

	public int getIslandHeight() {
		return islandHeight;
	}

	public void setIslandHeight(int islandHeight) {
		this.islandHeight = islandHeight;
	}

	public int getxPosition() {
		return xPosition;
	}

	public void setxPosition(int xLocation) {
		if (xLocation >= islandWidth+1) { // update the position as per the boarder height and width: here i have taken 50
			// and 50
			this.xPosition = islandWidth - 1;
		} else {
			if (xLocation <= 1) {
				xLocation = 1;
			} else {
				this.xPosition = xLocation;
			}
}
	}

	public int getyPosition() {
		return yPosition;
	}

	public void setyPosition(int yLocation) {
		if (yLocation >= islandHeight+1) {
			this.yPosition = islandHeight - 1;
		} else {
			if (yLocation <= 1) {
				yLocation = 1;
			} else {
				this.yPosition = yLocation;
			}
		}
	}

	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getLiveOn() {
		return liveOn;
	}

	public void setLiveOn(String liveOn) {
		this.liveOn = liveOn;
	}

	public String getCanFly() {
		return canFly;
	}

	public void setCanFly(String canFly) {
		this.canFly = canFly;
	}

	public int getHungryLevel() {
		return hungryLevel;
	}

	public void setHungryLevel(int hungryLevel) {
		this.hungryLevel = hungryLevel;
	}
}
	// methods move()
	// grow()
	


