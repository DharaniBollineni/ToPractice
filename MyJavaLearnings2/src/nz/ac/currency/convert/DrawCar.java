package nz.ac.currency.convert;

import java.awt.Color;

import javax.swing.JColorChooser;

import ecs100.UI;

public class DrawCar {
	double height,width,x,y;
	public DrawCar() {
		// TODO Auto-generated constructor stub
		UI.initialise();
		//UI.addButton("Draw a Car",this::drawCar);
		UI.addButton("Get info", this::getInfo);
		UI.addButton("Clear screen", this::clearScreen);
		
	}

	public void getInfo()
	{
		int n=UI.askInt("Need to draw a car: Enter value >0");
		while(n>0) {
			height= UI.askDouble("Enter height");
			width=UI.askDouble("Enter width");
			x=UI.askDouble("enter x");
			y=UI.askDouble("Enter y");
			int changeModel=0;
			changeModel= UI.askInt("To change modle enter 1 otherwise any value");
			Color stripe1 = JColorChooser.showDialog(null, "Color of the car", Color.white);
			Color stripe2 = JColorChooser.showDialog(null, "Color of the wheels", Color.white);
			this.drawCar(height,width,changeModel,stripe1,stripe2);
			n=UI.askInt("Need to draw a car: Enter value >0");
			
		}
		
		
	}
	public void drawCar(double height, double width, int changeModel,Color carColor,Color wheelColor)
	{
		double tCHw;//=20;//bTwoY;
		//Set color to red for car
		UI.setColor(carColor);
		//Draw a box1 for car design
		UI.fillRect(x, y, width/3, height/2);
		//draw a box2 for car design
		UI.fillRect(x,y+height/2 , width, height/2);
		// to change 	Model
		if (changeModel==1)
		{
			// draw rectangle 3 
			UI.setColor(Color.black);
		    UI.fillRect(x+width/3,y+height/6,width/3, height/3);
		}
		//Set Color for the wheels
		UI.setColor(wheelColor);
		// Draw wheel 1
		tCHw= height/3+width*0.2;	
		//tCHw= height/4+width*0.2;			// wheel height and width
		UI.fillOval(x+(height/3)-height*0.5, y+(height/2)+10, tCHw, tCHw);
		// Draw wheel 2
		UI.fillOval(x+width-width*0.25, y+(height/2)+10, tCHw, tCHw);
		
	}
	public void clearScreen()
	{
		UI.clearGraphics();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DrawCar();

	}

}
