package week1;

public class ShareVariable { /// make it abstract

	private int xPosition;
	private int yPosition;
	private char symbol;
	private int size;
	private int id;
	private int screenWidth = 50;
	private int screenHeight = 50;
	
	// getters and setters
	public int getxPosition() {
		return xPosition;
	}

	public void setxPosition(int xLocation) {
		if (xLocation >= screenWidth) { // update the position as per the boarder height and width: here i have taken 50
										// and 50
			this.xPosition = screenWidth - 1;
		} else {
			if (xLocation <= 0) {
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
		if (yLocation >= screenHeight) {
			this.yPosition = screenHeight - 1;
		} else {
			if (yLocation <= 0) {
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
		size= (int) (Math.random() * 9);
		this.size = size;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
			this.id = id;
	}

}
