package nz.ac.currency.convert;
import ecs100.*;
import java.awt.Color;


public class GraphicsPractice {
	
	public GraphicsPractice()
	{
		UI.initialise();
		UI.addButton("Draw Line", this::drawLineFunction);
		//UI.addButton("Draw Circle", this::drawCircle);
	}
	public void drawLineFunction()
	{
		UI.setColor(Color.red);
		UI.drawLine(100, 200, 100, 300);
		UI.setColor(Color.green);
		UI.drawLine(0,0,500,500);
		UI.setColor(Color.black);
		UI.drawLine(0, 250, 960, 250);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicsPractice();

	}

}
