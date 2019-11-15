package nz.ac.currency.convert;

import ecs100.UI;

public class TimesTable {
	
	public TimesTable()
	{
		UI.initialise();
		UI.addButton("NormalTimesTable", this::calculateTimesTableNormal);	
		UI.addButton("GridTimeTable",this::calculateTimesTableGrid);
		
	}
	
    public void calculateTimesTableNormal()
    {
    	int n=UI.askInt("Enter the limit");
    	for(int i=1;i<=n;i++)
    	{
    		int mul;
    		for(int j=1;j<=n;j++)
    		{
    			mul=i*j;
    			UI.printf("%d * %d = %d\n", i,j,mul);
    		}
    		
    		//UI.printf(\t);
    		UI.println();
    	}
    	}
    	public void calculateTimesTableGrid()
        {
        	int n1=UI.askInt("Enter the limit");
        	for(int i=1;i<=n1;i++)
           	{ 
        		//String str=" ";
           		int mul;
        		for(int j=1;j<=n1;j++)
        		{
        			mul=i*j;
        			//str=str+" "+mul;
        			//UI.printf("%d * %d = %d\n", i,j,mul);
        			UI.printf("%3d", mul);
        		}
        		
        		//UI.printf(\t);
        		UI.println("");
        		//UI.println(str);
        	}
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new TimesTable();
	}

}
