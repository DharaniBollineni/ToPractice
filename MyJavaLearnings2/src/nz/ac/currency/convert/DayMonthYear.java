package nz.ac.currency.convert;

import ecs100.UI;

public class DayMonthYear {

	public int day;
	public int month;
	public int year;
	public int leapCheck;
	
	public DayMonthYear() {
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
	public void longMonth()
	{
		switch (month)
		{
		case 1:
			UI.println(" Given month is January which has 31 days" );
			break;
		case 3: 
			UI.println(" Given month is March which has 31 days" );
			break;
		case 5:
			UI.println(" Given month is May which has 31 days" );
			break;
		case 7: 
			UI.println(" Given month is July which has 31 days" );
			break;
		case 8:
			UI.println(" Given month is August which has 31 days" );
			break;
		case 10: 
			UI.println(" Given month is October which has 31 days" );
			break;
		case 12: 
			UI.println(" Given month is December which has 31 days" );
			
		}
	}
		public void shortMonth()
		{
			switch (month)
			{
			case 4:
				UI.println(" Given month is April  which has 30 days" );

				break;
			case 6: 
				UI.println(" Given month is June which has 30 days" );
				break;
			case 9:
				UI.println(" Given month is September  which has 30 days" );
				break;
			case 11: 
				UI.println(" Given month is July which has 30 days" );
				break;
			case 8:
				UI.println(" Given month is November  which has 30 days" );
			
			}
	  
	}
	public void checkLeapYear()
	{
		if ((year%4==0 && year%100!=0) || year%400==0)
		{ 
			UI.println("its a leap year so February has 29 days");
			leapCheck=1;
		}
		else
		{
			UI.println("its a not a leap year so February has 28 days");
		}
	}
	public void longcheckDays()
	{
		if ((day>0 && day<=30)|| day>30)
		{
			UI.printf("valied input and the values are day = %d month = %d year = %d \n", day,month,year);
		}
		else
		{
			UI.printf("1 is invalid because of day = %d please re-enter \n", day);
		}

	}
	
	public void shortCheckDays()
	{
		if ((day>0 && day<=30) && day>30)
		{
			UI.printf("2 is invalid because of day = %d please re-enter \n", day);
		}
		else
		{
			UI.printf("valied input and the values are day = %d month = %d year = %d \n", day,month,year);
			
		}

	}	
	public void febMonth()
	{
		if ((day>0 && day>28) && day<=29 && leapCheck== 1)
		{
			UI.printf("valied input and the values are day = %d month = %d year = %d \n", day,month,year);
			
		}
		else
		{
			UI.printf("3 is invalid because of day = %d please re-enter \n", day);
			
		}

	}	

	public void validateDateCore()
	{
		if ((day>=1 && day<32) && (month>0 && month<13) && (year>=1))
		{
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )
		{
			longMonth();
			longcheckDays();
			checkLeapYear();
						
		}
		else if ( month == 4 || month == 6 || month == 9 || month == 11 )
		{
			shortMonth();
			shortCheckDays();
			
		}
		else if ( month == 2 )
		{
			checkLeapYear();
			febMonth();
		}
		else 
		{
			UI.printf("4 is invalid because given month = %d  which should be 1 to 12\n please re-enter \n", month);
		}
		}
		else 
			UI.printf("invalid input \n please re-enter \n");
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
		new DayMonthYear();

	}

}
