package nz.ac.currency.convert;

import ecs100.UI;

public class PatternDrawer { // Definition of class

	// Create buttons and define constants;
	// public int boardLeft, boardTop,boardSize;

	public PatternDrawer() // Constructor
	{
		UI.initialise();
		UI.addButton("Draw Grid", this::drawGrid); // Core
		UI.addButton("Draw Triangle", this::drawTriangleReverse);// Core
		UI.addButton("Draw CheckersBoard", this::drawCheckersBoard); //Completion
		UI.addButton("Gride of concentric circles", this::gConcentricCircles);//Challenge
		//UI.addButton("ClearScreen", this::clearTheScreen);
	}

	/*public void clearTheScreen() { // Definition of method
		UI.clearGraphics();
	}*/

	public void drawGrid() {
		UI.clearGraphics();
		int boardSize = UI.askInt("Enter boardSize");
		int hWd = 20;
		for (int r = 0; r < boardSize; r++) {
			for (int c = 0; c < boardSize; c++) {
				int xC = 20 + c * hWd; // x coordinates keeps changing, so using columns
				int yC = 50 + r * hWd; // y coordinates remains same, so using row.
				UI.drawRect(xC, yC, hWd, hWd); // width and height is same for square

			}

		}

	}

	public void drawTriangleReverse() {
		UI.clearGraphics();
		int boardSize = UI.askInt("Entre boardSize");
		int hWd = 20;
		double left,top;
		for(int i=0;i<=boardSize;i++)
		{
			for(int j=0;j<boardSize-i;j++)
			{
				left = 100 + j * (hWd+1); // x coordinates keeps changing, so using changing variable
			    top = 50 + i * (hWd+1); // y coordinates remains same, so using row.
				UI.fillRect(left, top, hWd, hWd); // width and height is same for square
			}
		}
		
		
	}
	// int x =20 + col*diam;
	// int y =50 + row *diam;
	public void drawCheckersBoard() {
		UI.clearGraphics();
		int rows=UI.askInt("Enter no of rows");
		int cols=UI.askInt("Enter no of colums");
		
		int diam = 20;
		int row = 0;
			
		while (row < rows)
		{
			int col =0;
			while(col < cols)
			{
				int x =20 + col*diam;
				int y =50 + row *diam;
				
				if ((row+col)%2==0)
				{			
					UI.fillRect(x,y,diam, diam);
							
				}
				else
				{
					UI.drawRect(x,y,diam, diam);
							
				}
				col++;
			}
			row++;
		}
		}
	public void gConcentricCircles()
	{
		UI.clearGraphics();
		int boardSize = UI.askInt("Entre boardSize");
		for(int i=1;i<=boardSize;i++)
		{
		for (int j=1;j<=boardSize;j++)
		{
		int radius = 30, conWd = 60*i, conHt = 60*j;
		do {
			int x = conWd - radius, y = conHt - radius;
			UI.drawOval(x, y, 2 * radius, 2 * radius);
			//UI.drawOval(x, y, width, height);
			radius -= 5;
		} while (radius > 0);
		}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// class creation, object creation, execute constructor
		new PatternDrawer();
	}

}
