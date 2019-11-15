package WeekTwo;
import ecs100.*;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Drawer {

	private List<Circle> circleList;
	/** Constructor: Set up interface */
	public Drawer() {
		circleList = new ArrayList<>();
		UI.setMouseListener(this::doMouse); //Handle mouse events
	}

	public  void doMouse(String action, double x, double y) {
		if (action.equals("released")) {
			Circle c = new Circle(x,y);
			c.draw();					//--> or later use for loop to print circles 
			circleList.add(c);
			//c.
		}
	}

	public static void main(String[] args) {
		UI.initialise();
		new Drawer();
	}
}
