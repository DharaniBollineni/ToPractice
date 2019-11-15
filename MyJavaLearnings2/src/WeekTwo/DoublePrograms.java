package WeekTwo;
import ecs100.*;
import java.util.*;
//import java.io;
public class DoublePrograms {
	private ArrayList<Double> allNumbers=new ArrayList<Double>();
	
	public DoublePrograms()
	{
		UI.initialise();
		UI.addButton("New List", this::newList);
		//UI.addTextField("Add",this::addList);
		UI.addButton("Add",this::addList);
		UI.addButton("Display List",this::displayList);
		UI.addButton("Average of Numbers",this::calAverage);
		UI.addButton("Convert numbers into negative values",this::toNegetive);
		UI.addButton("Double all numbers", this::toDoubleNumbers);
		UI.addButton("Quiet",this::quit);
	}
	
	public void newList()
	{
		this.allNumbers=new ArrayList<Double>();
		this.displayList();
	}
	public void addList()
	{
		double valueD;
		valueD = UI.askDouble("Enter a value");
		if (valueD>0)
		{
			do {
				this.allNumbers.add(valueD);
				valueD = UI.askDouble("Enter a value");
				} while(valueD>0);
		}
		
		this.displayList();
		
	}
	public void displayList()
	{
		UI.clearText();
		UI.println("allNumbers arrayList has %d"+this.allNumbers.size());
		for(int i=0;i<this.allNumbers.size();i++)
		{
			UI.printf("%3d: %.2f %n",i,this.allNumbers.get(i));
		}
		UI.println("---------------------");
		
	}
	

	public void calAverage()
	{
		 double avg,sum=0.0;
		 for(int i=0;i<this.allNumbers.size();i++)
		 {
			 sum=sum+this.allNumbers.get(i);
		 }
		 
		 avg=sum/this.allNumbers.size();
		 UI.println("average of all elements in array list :: "+avg);
		 
	}
	public void toNegetive()
	{
		double negValue;
		int size=this.allNumbers.size();
		for(int i=0;i<size;i++)
		 {
			
			negValue = this.allNumbers.get(i)*-1;
			this.allNumbers.set(i,negValue);
			
			//this.allNumbers.add(allNumbers.get(i)*-1);
			//this.allNumbers.add(i)=this.allNumbers.get(i)*-1;
		 }
		this.displayList();
			
	}
	public void toDoubleNumbers()
	{
		double doubleValue;
		
		for(int i=0;i<this.allNumbers.size();i++)
		 {
			//doubleValue = this.allNumbers.get(i)*2;
			//this.allNumbers.set(i,doubleValue);
			
			this.allNumbers.set(i,(allNumbers.get(i)*2));
			//this.allNumbers.add(i)=this.allNumbers.get(i)*-1;
		 }
		this.displayList();
		 
	}
	
	public void quit()
	{
		UI.quit();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new DoublePrograms();
	}

}
