package WeekTwo;

import java.util.ArrayList;

import ecs100.UI;

public class MarksOfStudent {
	private ArrayList<Double> marksList=new ArrayList<Double>();
	public MarksOfStudent()
	{
		UI.initialise();
		UI.addTextField("getMarks",this::addMarks);
		UI.addButton("Display Marks",this::displayMarks);
		UI.addButton("Check pass or fail",this::passFail);
		UI.addButton("Average of marks",this::calAverage);
		UI.addTextField("Scale Marks", this::scaleMarksToPass);
		UI.addButton("Check decending order", this::checkOrdered);
		//UI.addButton("Convert numbers into negative values",this::toNegetive);
		//UI.addButton("Double all numbers", this::toDoubleNumbers);
		//UI.addButton("Quiet",this::quit);
	}
	public void checkOrdered()
	{
		if (isOrderedDecending())
		{
			UI.println("List is decending order");
		}
		else
		{
			UI.println("not in decending order");
		}
	}
	public boolean isOrderedDecending() {
		/// YOUR CODE HERE
		//for(Double check:marksList)
	//	{
			double prev=marksList.get(0);
			for(int i=1;i<marksList.size();i++)
			{
				UI.println("prev is "+prev);
				if(marksList.get(i)>prev)
				{
						return false;
				}
				prev=marksList.get(i);
			}
			return true;
		}

		
  public void addMarks(String marks)
  {
	 if(marks!=null && !marks.contains(" "))
	 {
		 marksList.add(Double.valueOf(marks));
		 
	 }
	  
  }
  
  public void displayMarks()
  {
	  int i=1;
	  for(double marks:marksList)
	  {
		  UI.println(" Subject :: "+i+" Marks is "+marks);
		  i++;
	  }
	  
  }
  public void passFail()
  {
	  if (checkPass())
	  {
		  UI.println("Pass");
	  }
	  else
	  {
		  UI.println("Fail");
	  }
  }
  
  public boolean checkPass()
  {
	  int count=0;
	  for(double m:marksList)
	  {
		  if(m>30 && m<=100)
		  {
			  count++;
			  if(count==marksList.size())
			  {
				   return true;
			  }
		  }
	  }
	  return false;
  }

public void scaleMarksToPass(String sStr)
{
	double sStrD=Double.valueOf(sStr);
	if(!checkPass())
	{
		for(int i=0;i<marksList.size();i++)
		{
			double m=marksList.get(i);
			if(m< 30)
			{
				marksList.set(i, m+sStrD);
			}
					
		}
	}
}

  public void calAverage()
  {
	  double sum=0, avg;
	  for(double m:marksList)
	  {
		  sum=sum+m;
	  }
	  avg=sum/marksList.size();
	  UI.println("Average marks of all subjects is "+avg);
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MarksOfStudent();
	}

 }