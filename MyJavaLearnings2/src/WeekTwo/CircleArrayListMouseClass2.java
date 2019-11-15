package WeekTwo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ecs100.UI;
public class CircleArrayListMouseClass2 {
	private static int i=0;
	private List<Circle> circleList;
	public CircleArrayListMouseClass2()
	{
		circleList = new ArrayList<>();
		UI.initialise();
		int j=0;
		do {
			UI.setMouseListener(this::doMouse);	
			j=UI.askInt("Enter -ve value to stop");			
		}while(j>=0);
		this.display();
		
	}
	
	public  void doMouse(String action, double x, double y) 
	{
		if (action.equals("released")) {
			//DrawArrayListClass1 c = new DrawArrayListClass1(x1, x2,y1, y2);
			addToArrayList(x,y);	
		}
	}
	public void addToArrayList(double x,double y)
	{
		this.circleList.add(i,new Circle(x,y));
		i++;
	}
	
	public void display()
	{
		Iterator itr=circleList.iterator();			// to iterate through arrayList 
		UI.println(itr);
		while(itr.hasNext())
		{
			Circle obj = (Circle)itr.next();
			obj.draw();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CircleArrayListMouseClass2();
	}

}
