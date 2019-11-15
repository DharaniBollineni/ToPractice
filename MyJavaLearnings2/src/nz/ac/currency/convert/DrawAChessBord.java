package nz.ac.currency.convert;

import ecs100.UI;

public class DrawAChessBord {
	public DrawAChessBord()
	{
		UI.initialise();
		UI.addButton("ChessBord", this::drawCBord);		
	}
public void drawCBord() {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     new DrawAChessBord();
	}

}
