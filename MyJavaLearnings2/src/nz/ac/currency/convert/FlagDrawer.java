package nz.ac.currency.convert;

import java.awt.Color;

import javax.swing.JColorChooser;

import ecs100.UI;

public class FlagDrawer {
	
	public static final double width = 200;
    public static final double height = 133;
  //  public  stripe1,stripe2,stripe3;
    
	public FlagDrawer() // Constructor
	{
		UI.initialise();
		UI.addButton("singleFlag ", this::testCore); // Core
		UI.addButton("FlagCollection", this::testCompletion ); //Completion
		//UI.addButton("ClearScreen", this::clearTheScreen);
	}
	
	public void clearTheScreen() { // Definition of method
		UI.clearGraphics();
	}
	public void testCore(){
        double left = UI.askDouble("left of flag");
        double top = UI.askDouble("top of flag");
        UI.println("Now choose the colours");
        Color stripe1 = JColorChooser.showDialog(null, "First Stripe", Color.white);
        Color stripe2 = JColorChooser.showDialog(null, "Second Stripe", Color.white);
        Color stripe3 = JColorChooser.showDialog(null, "Third Stripe", Color.white);
        //int n=3;
        //// Uncomment this line when you start work on the core:
        this.drawThreeColourFlagCore(left, top, stripe1, stripe2, stripe3 );
       // UI.println("You need to uncomment the line above this in testCore.");
    }

	public void drawThreeColourFlagCore(double left,double top, Color stripe1, Color stripe2,Color stripe3)
	{
		double leftInc;
			for(int i=1;i<=3;i++)
		{
			if (i==1)
			{	
				UI.setColor(stripe1);
				leftInc=left+width*i;
				UI.fillRect(leftInc, top, width, height);
			}
			else if (i==2)
			{
				UI.setColor(stripe2);
				leftInc=left+width*i;
				UI.fillRect(leftInc, top, width, height);
			}
			else
			{
				UI.setColor(stripe3);
				leftInc=left+width*i;
				UI.fillRect(leftInc, top, width, height);
			}
		}
	}
	
	public void drawThreeColourFlagCompletion(Boolean flagType, double left, double top, Color colorA, Color colorB,Color colorC) {
		double leftInc,topInc;
		if (flagType==true) 
		{
			for (int i = 1; i <= 3; i++)
			{
				if (i == 1) {
					UI.setColor(colorA);
					leftInc = left + width * i;
					UI.fillRect(leftInc, top, width, height);
				} 
				else if (i == 2) 
				{
					UI.setColor(colorB);
					leftInc = left + width * i;
					UI.fillRect(leftInc, top, width, height);
				} 
				else
				{
					UI.setColor(colorC);
					leftInc = left + width * i;
					UI.fillRect(leftInc, top, width, height);
				}
			}
		}
		else {
			for (int i = 1; i <= 3; i++)
			{
				if (i == 1) {
					UI.setColor(colorA);
					topInc = top + height * i;
					UI.fillRect(left, topInc, width, height);
				} 
				else if (i == 2) 
				{
					UI.setColor(colorB);
					topInc = top + height * i;
					UI.fillRect(left, topInc, width, height);
				} 
				else
				{
					UI.setColor(colorC);
					topInc = top + height * i;
					UI.fillRect(left, topInc, width, height);
				}
			}
		}
			
	}

	 public void testCompletion(){
	        double left=100;
	        double top=20;
	        //// Uncomment these lines when you start working on the completion:
	        this.drawThreeColourFlagCompletion(true, 0, 50, Color.black, Color.yellow, Color.red);               // Belgium
	        this.drawThreeColourFlagCompletion(false, 250, 100, Color.black, Color.red, Color.yellow);            // Germany
	        this.drawThreeColourFlagCompletion(true, 140, 430, Color.blue, Color.white, Color.red);               // France
	        this.drawThreeColourFlagCompletion(false, 470, 30, Color.red, Color.white, Color.blue);               // The Netherlands
	        this.drawThreeColourFlagCompletion(false, 50, 250, Color.white, Color.blue, Color.red);               // Russia
	        this.drawThreeColourFlagCompletion(true, 290, 270, Color.red, Color.yellow, Color.green.darker());    // Guinea
	        //UI.println("You need to uncomment the lines above this in testCompletion.");
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlagDrawer();
	}

}
