package MyClassPrograms;

import ecs100.UI;

public class CircleClass1 {

	private double x,y,radius =40;							// variable declaration 
	
	public CircleClass1(double x, double y)					// Constructor with parameters 
	{
		this.x=x;											// assign values to class level variables  
		this.y=y;
	}
	
	public void drawMethod()								// method to draw circles using x and y coordinates
	{
		UI.drawOval(x-radius, y-radius, radius*2, radius*2);
	}
	
}
