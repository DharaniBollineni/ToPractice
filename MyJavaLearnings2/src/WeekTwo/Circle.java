package WeekTwo;
import ecs100.UI;

public class Circle {
	private double x,y, radius = 90;
	
	Circle(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void draw() {
		//UI.println("x and y are  "+this.x+" " + this.y);
		//UI.println("x and y are  "+x+" " + y);
		UI.drawOval(x - radius, y - radius, radius * 2, radius * 2);
	}
}
