package WeekTwo;

import java.util.ArrayList;

import ecs100.UI;

public class ForLoopAndForEach {
	private ArrayList<Double> markesList= new ArrayList<Double>();
	public int noOfSubjects=5;
	
	public ForLoopAndForEach() {
		// TODO Auto-generated constructor stub
		UI.initialise();
		UI.addButton("Add Markes", this::addArrayMarkes);
		UI.addButton("Display", this::displayArray);
		UI.addButton("Average", this::calAverage);
		UI.addTextField("Change Original Markes",this::changeOriginal);
		UI.addTextField("Change Markes by a fraction", this::newChangeMarkes);
		//pass or fail 
		UI.addButton("Change marks by a fraction",)
	}

	public void addArrayMarkes()
	{
			Double marksValue= UI.askDouble("Enter the elements in the list");
			this.markesList.add(marksValue);
	}
	public void displayArray()
	{
		for(Double markes:this.markesList)
		{
			UI.println(markes);
		}
	}
	
	public void calAverage()
	{
		Double sum=0.0,avg;
		for(Double markes:this.markesList)
		{
			sum=sum+markes;
		}
		avg=sum/this.markesList.size();
		UI.println("Average of markes is "+avg);
	}
	public void changeOriginal(String fraction)
	{
		Double frac= Double.valueOf(fraction);
	  for(int i=0;i<this.markesList.size();i++)
	  {
		  this.markesList.set(i, markesList.get(i)*frac);
	  }
	}
	public void newChangeMarkes(String fraction)
	{
		Double frac= Double.valueOf(fraction);
		ArrayList<Double> newList= new ArrayList<Double>();
		  for(Double markes:this.markesList)
		  {
			  newList.add(markes*frac);
		  }
		  UI.println("Modified list is ");
		  for(Double markes:newList)
		  {
			  UI.println(markes);

		  }
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ForLoopAndForEach();
	}

}
