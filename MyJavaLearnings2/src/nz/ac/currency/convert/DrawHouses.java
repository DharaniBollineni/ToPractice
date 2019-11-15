package nz.ac.currency.convert;

import ecs100.UI;

public class DrawHouses {
	public double houseWd= 40, road=400;  // we need mid, width, road they are constants 
	public DrawHouses()
	{
		UI.initialise();
	//	UI.addButton("Draw A House",this::drawAHouse);
		UI.addButton("Draw A Street", this::drawAStreet);
	}
	
	//public void drawAHouse(){ 	}
	public void drawAStreet()
	{
		int count=50;
		int n= UI.askInt("Enter no of house");
		while(!(n==0))
		{
		this.drawAHouse(50+(n*count),road,(50+ Math.random()*60)); //need location--> x,y and height--> use math() for random height of the house they keep changing
		n--;
		
		//drawAHouse(x,y,height)
		}
	}
	public void drawWindow(double wX, double wbot, double wWd)
	{
		double midW=wWd/2;
		UI.drawRect(wX-midW,wbot-midW,wWd,wWd);
		UI.drawLine(wX-midW,wbot,wX+midW,wbot);
		UI.drawLine(wX,wbot-midW, wX,wbot+midW);
						
	}
	public void drawAHouse(double midOHouse,double bot, double height)
	{
		// Draw the house using rectangle and line method
		double left=midOHouse - houseWd/2.0;
		double right=midOHouse +houseWd/2.0;
		double top= bot-height;
		double tip= top-houseWd*0.7;
		UI.drawRect(left,top, houseWd, height);
		UI.drawLine(left, top, midOHouse, tip);
		UI.drawLine(right, top, midOHouse, tip);
		double winL= midOHouse - houseWd*0.25;
		// Draw the windows:
		double winR= midOHouse + houseWd*0.25;
		double winWd= houseWd*0.33;
		double lev1 = bot -height *0.75;
		double lev2 = bot -height *0.25;
		this. drawWindow(winL, lev1,winWd);
		this. drawWindow(winR, lev1,winWd);
		this.drawWindow(winL, lev2,winWd);
		this.drawWindow(winR, lev2,winWd);
				
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DrawHouses();

	}

}
