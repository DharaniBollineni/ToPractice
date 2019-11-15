package nz.ac.currency.convert;

import ecs100.UI;

public class CalculateGrade {
	public double s1,s2,s3,s4, total;
	
	public CalculateGrade()
	{
		UI.initialise();
		UI.addButton("get marks", this::getMarks);
		UI.addButton("Check grade", this::grade);			
	}
	public void getMarks()
	{
		s1=UI.askDouble("Enter markes");
		s2=UI.askDouble("Enter markes");
		s3=UI.askDouble(question)
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CalculateGrade();

	}

}
