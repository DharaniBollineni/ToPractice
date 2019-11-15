package WeekTwo;

import java.util.ArrayList;

import ecs100.UI;

public class MethodOfArrayList {
	private ArrayList<Double> allNumbers=new ArrayList<Double>();
	public MethodOfArrayList()
	{
		UI.initialise();
		UI.addButton("getTwoNumbers",this::addList);
		UI.addButton("Display List",this::displayList);
		UI.addButton("Average of Numbers",this::calAverage);
		UI.addButton("Convert numbers into negative values",this::toNegetive);
		UI.addButton("Double all numbers", this::toDoubleNumbers);
		UI.addButton("Quiet",this::quit);
	}
		
  public void getTwoNumbers()
  {
	 double val1= UI.askDouble("Enter the value1");
	 double val2=UI.askDouble("Entre the value2");
	 
	  
  }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
