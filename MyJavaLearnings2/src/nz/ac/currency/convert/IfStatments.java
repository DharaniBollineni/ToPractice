package nz.ac.currency.convert;
import ecs100.*;
import java.awt.Color;


public class IfStatments {
	public IfStatments()
	{
		
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}

/** Draw little pictures on the graphics pane*/
public class DrawLollipop {
	public DrawLollipop() {
		UI.addButton("Draw it", this::drawLollipop);
		
	}
	/** Draw an orange face with a brimmed hat */
	public void drawLollipop() {
		UI.setLineWidth(10);
		UI.setColor(Color.black);
		UI.drawLine(300, 200, 300, 400);
		UI.setLineWidth(1);
		UI.setColor(Color.red);
		UI.fillOval(260, 160, 80, 80);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DrawLollipop();