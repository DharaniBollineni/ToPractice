package MyClassPrograms;

import java.util.ArrayList;

import ecs100.UI;

public class DrawCirclesClass2 {
	
	private ArrayList<CircleClass1> cList = new ArrayList<CircleClass1>();
	
	public DrawCirclesClass2()
	{
		UI.initialise();
		UI.setMouseListener(this::clickedDoMouseMethod);
	}
	
	public void clickedDoMouseMethod(String action, double x,double y)
	{
		if (action.equals("released"));
		{
		CircleClass1 c=new CircleClass1(x,y);
		//ArrayList<CircleClass1> cList = new ArrayList<CircleClass1>();
		c.drawMethod();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DrawCirclesClass2();
	}

}
