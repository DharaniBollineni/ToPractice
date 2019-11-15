package WeekTwo;

import java.util.ArrayList;

import ecs100.UI;

public class TimesTableUsingArrayList {

	// arraylist declaration
	public ArrayList<Integer> timesTableList = new ArrayList<Integer>();
	// constructor declaration
	public TimesTableUsingArrayList()
	{
		UI.initialise();
		UI.addTextField("Enter the limit", this::calculateTimesTableGrid);
		UI.addTextField("Enter the limit", this::calculateTimesTable);
	}
	
	//method declaration 
		public void calculateTimesTableGrid(String lStr)
		{
			Integer limitValue= Integer.valueOf(lStr);
			int mul;
			for(int i=1;i<=limitValue;i++)
	       	{     		
	    		for(int j=1;j<=limitValue;j++)
	    		{
	    			mul=i*j;
	    			UI.printf("%3d", mul);
	    		}
	    		UI.println("");    		
	    	}
		}
		
		//method declaration 
		public void calculateTimesTable(String lStr)
		{
			Integer limitValue= Integer.valueOf(lStr);
			for(int i=1;i<=limitValue;i++)
	       	{ 
				for(Integer mul: getTimestable(i,limitValue))
				{
					UI.printf("%3d", mul);
										
				}
				timesTableList.clear();
				UI.println("");    
	       	}
			
		}
		
		public ArrayList<Integer> getTimestable(int i,Integer limitValue)
		{
			Integer mul;
				for(int j=1;j<=limitValue;j++)
	    		{
	    			mul=i*j;
	    			//UI.println(mul);
	    			timesTableList.add(mul);
	    			//UI.printf("%3d", mul);
	    		}
				return timesTableList;
	  	}
		
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TimesTableUsingArrayList();
	}

}
