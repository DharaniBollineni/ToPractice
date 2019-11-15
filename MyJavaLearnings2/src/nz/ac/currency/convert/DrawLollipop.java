package nz.ac.currency.convert;
// import jar files
import ecs100.*;
import java.awt.Color;
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
		//UI.drawLine(x1, y1, x2, y2);
		UI.setLineWidth(1);
		UI.setColor(Color.red);
		UI.fillOval(260, 160, 80, 80);
		//UI.drawO
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DrawLollipop();
	}

}
