package nz.ac.currency.convert;
// Assignment
import ecs100.UI;

public class DateMonthYear {
	public int day;
	public int month;
	public int year;
	
	public DateMonthYear() {
		UI.initialise();
		UI.addButton("get day month and year", this::getInfo);
		UI.addButton("check core", this::validateDateCore);	
		UI.addButton("check Completion", this::validateDateCompletion);
	}
	public void getInfo()
	{
		day=UI.askInt("Enter day");
		month=UI.askInt("Enter month");
		year= UI.askInt("Enter year");
	}
		public void validateDateCore()
	{
		if (day>=1 && day<32)
		{
			if(month>0 && month<13)
			{
				if (year>=1)
				{
					UI.printf("is valid and the values are day = %d month = %d year = %d \n", day,month,year);
				}
				else 
				{
					UI.printf("is invalid because of year = %d please re-enter \n", year);
				}
			}
			else 
			{
				UI.printf("is invalid because of month = %d please re-enter \n", month);
			}
		}
		else 
		{
			UI.printf("is invalid because of day = %d please re-enter \n", day);
		}
	}
		
	public void validateDateCompletion()
	{
		if ( month ==2 && (!((year%4==0 && year%100!=0) || year%400==0)) && day>28)
			{ 
				
				UI.printf("invalied input\n");
			}
		else validateDateCore();
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DateMonthYear();

	}

}
