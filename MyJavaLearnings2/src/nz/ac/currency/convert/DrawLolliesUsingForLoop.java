package nz.ac.currency.convert;

import java.awt.Color;

import ecs100.UI;

public class DrawLolliesUsingForLoop {

	public DrawLolliesUsingForLoop() {
		// TODO Auto-generated constructor stub
		UI.initialise();
		UI.addButton("DrawLolli using ForLoop", this::drawLolliFor);
	}
	
	public void drawLolliFor()
	{
		/*UI.setLineWidth(10);
		UI.setColor(Color.black);
		UI.drawLine(300, 200, 300, 400);
		UI.setLineWidth(1);
		UI.setColor(Color.red);
		UI.fillOval(260, 160, 80, 80);*/
		int n=2,x1,x2,y1,y2,d=10;
		for(int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				UI.setLineWidth(10);
				UI.setColor(Color.red);
				x1=100+100*j;
				y1=200+200*i;
				x2=100+100*j;//=x1
				y2=300+200*i;
				UI.drawLine(x1, y1, x2, y2);
				//d=d+10;
			}
		}
		//UI.drawLine(10, 20, 10, 40);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DrawLolliesUsingForLoop();
	}

}
