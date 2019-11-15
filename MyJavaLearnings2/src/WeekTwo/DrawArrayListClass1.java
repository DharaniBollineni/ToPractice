package WeekTwo;

import ecs100.UI;

public class DrawArrayListClass1 {

	double x1,x2,y1,y2;
	public DrawArrayListClass1(double x1,double x2,double y1,double y2)
	{
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
	}
	
	public void drawLineMethod()
	{
		UI.drawLine(x1, y1, x2, y2);
	}
	
}
