package nz.ac.currency.convert;
import ecs100.UI;
public class Completion {
	public int month;
	public int year;
	public int days;

	public Completion() {
		
		UI.initialise();
		UI.addButton("get deatails", this::getDetails);		
		UI.addButton("Validator", this::dateValidatorCore);	
	}
			
	public void getDetails()
	{
		days = UI.askInt("Enter the days"); 
		month = UI.askInt("Enter the month"); 
		year = UI.askInt("Enter the years"); 
	}
	
	public void dateValidatorCore()
	{
		
	}

	public void dateValidatorCompletion()
	{
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Completion();

	}

}
