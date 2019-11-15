package nz.ac.currency.convert;
// Assignment final1
import ecs100.UI;

public class DateMonthYear2 {
	public int day;
	public int month;
	public int year;
	public String monthString;
		
	public DateMonthYear2() {
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
		if (!((day>=1 && day<32) && (month>0 && month<13) && (year>=1)))
		{
			UI.printf(" invalid input.... please re-enter \n", day);
		}
	}
	public void longCheckDays()
	{
		if ((day>0 && day<=31))
		{
			UI.printf("valied input and the values are day = %d month = %s year = %d \n", day,monthString,year);
		}
		else
		{
			UI.printf(" invalid because of day = %d please re-enter \n", day);
		}

	}
	
	public void shortCheckDays()
	{
		if ((day>0 && day<=30))
		{
			UI.printf("valied input and the values are day = %d month = %s year = %d \n", day,monthString,year);
		}
		else
		{
			UI.printf("1 is invalid because of day = %d please re-enter \n", day);
		}
		
	}
	public void checkLeapYear()
	{
		if (!((year%4==0 && year%100!=0) || year%400==0))
		{ 
			UI.println("given year is not a leap year so February has 28 days");
			if (day>0 && day<=28)
			{
				UI.printf("valied input and the values are day = %d month = %s year = %d \n", day,monthString,year);
			}
			else 
			{
				UI.println("Invalied input");
			}
		}
		else
		{			
			UI.println("given is a leap year so February has 29 days");
			if (day>0 && day<=29)
			{
				UI.printf("valied input and the values are day = %d month = %s year = %d \n", day,monthString,year);
			}
			else 
			{
				UI.println("Invalied input");
			}
		}
	}
		public void validateDateCore()
	{
		if ((day>=1 && day<32) && (month>0 && month<13) && (year>=1))
		{
			switch (month)
			{
			case 1:
				UI.println(" Given month is January which has 31 days" );
				monthString = "January";
				longCheckDays();				
				break;
			case 2:
				UI.println(" Given month is February which has 28 or 29 days" );
				monthString = "February";
				checkLeapYear();				
				break;
			case 3: 
				UI.println(" Given month is March which has 31 days" );
				monthString = "March";
				longCheckDays();
				break;
			case 4:
				UI.println(" Given month is April  which has 30 days" );
				monthString = "April";
				shortCheckDays();
				break;
			case 5:
				UI.println(" Given month is May which has 31 days" );
				monthString = "May";
				longCheckDays();
				break;
			case 6: 
				UI.println(" Given month is June which has 30 days" );
				monthString = "June";
				shortCheckDays();
				break;
			case 7: 
				UI.println(" Given month is July which has 31 days" );
				monthString = "July";
				longCheckDays();
				break;
			case 8:
				UI.println(" Given month is August which has 31 days" );
				monthString = "August";
				longCheckDays();
				break;
			case 9:
				UI.println(" Given month is September  which has 30 days" );
				monthString = "September";
				shortCheckDays();
				break;
			case 10: 
				UI.println(" Given month is October which has 31 days" );
				monthString = "October";
				longCheckDays();
				break;
			case 11: 
				UI.println(" Given month is July which has 30 days" );
				monthString = "July";
				shortCheckDays();
				break;
			case 12: 
				UI.println(" Given month is December which has 31 days" );
				monthString = "December";
				longCheckDays();
			}			
			
		}
		else 
		{
			UI.printf("is invalid input..... please re-enter \n", day);
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
		new DateMonthYear2();

	}

}
