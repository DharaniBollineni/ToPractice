package WeekTwo;

import java.util.ArrayList;
import java.util.Iterator;

import ecs100.UI;

public class ArraysListDrawLines {
	//private ArrayList<Line> shapeList = new ArrayList<Shape>();
	//private ArrayList<Double> shapeList = new ArrayList<Double>();
	
	public ArraysListDrawLines()
	{
		UI.initialise();
		double x1=UI.askDouble("Enter the x1");
		double y1=UI.askDouble("Enter the y1");
		double x2=UI.askDouble("Enter the x2");
		double y2=UI.askDouble("Enter the y2");
		
		drawClass(x1,y1,x2,y2);
		
	}
	public void drawClass(double x1,double x2,double y1,double y2)
	{
		UI.println("test");
		ArrayList<DrawArrayListClass1> lineList = new ArrayList<DrawArrayListClass1>(); // create an arrayList
		DrawArrayListClass1 cObj1= new DrawArrayListClass1(x1,y1,x2,y2);				// create objects
		DrawArrayListClass1 cObj2= new DrawArrayListClass1(x1+120,y1+120,x2+120,y2+120);
		DrawArrayListClass1 cObj3= new DrawArrayListClass1(x1+200,y1+200,x2+200,y2+200);
		
		// add objects into the arraylist
		lineList.add(cObj1);
		lineList.add(cObj2);
		lineList.add(cObj3);
		
		Iterator itr=lineList.iterator();			// to iterate through arrayList 
		UI.println(itr);
		while(itr.hasNext())
		{
			DrawArrayListClass1 obj = (DrawArrayListClass1)itr.next();
			obj.drawLineMethod();
		}
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ArraysListDrawLines();
	}

}
