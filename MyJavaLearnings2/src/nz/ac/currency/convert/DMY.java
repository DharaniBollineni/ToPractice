package nz.ac.currency.convert;

import ecs100.UI;

public class DMY {
	
		public int day;
		public int month;
		public int year;
		public boolean checkError;
		
		public DMY() {
			UI.initialise();
			UI.addButton("get day month and year", this::getInfo);
			//UI.addButton("check core", this::validateDateCore);	
			//UI.addButton("check Completion", this::validateDateCompletion);
		}
		public void getInfo()
		{
			checkYear();
			if (checkError)
			{
				checkMonth();
				//checkday();
			}
			else 
			{
				UI.println("Invalied input");
			}
			
			}
		 public void checkMonth()
		 {
			month=UI.askInt("Enter month");
			if(month>=0 && month<13)
			{
				checkError=true;
			}
			else checkError=false;
		 }
			//day=UI.askInt("Enter day");
			
		 public void checkday()
		 {
			day=UI.askInt("Enter day");
			if(day>=0 && day<32)
			{
				checkError=true;
			}
			else checkError=false;
		 }
		
		public void checkYear()
		{
		  int y= UI.askInt("Enter year");
			if (y>=1)
			{ 
				year=y;
				checkError=true;
			}
			else
			{
				checkError=false;
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DMY();
	}

}
