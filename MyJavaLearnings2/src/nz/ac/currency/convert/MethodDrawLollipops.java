package nz.ac.currency.convert;
import ecs100.*;
import java.awt.Color;
public class MethodDrawLollipops {
	
	public MethodDrawLollipops()
	{
		UI.initialise();
		UI.addButton("Draw Lollis", this::drawLollipops);
		UI.addButton("Draw Many Lollis", this::drawManyLollipops);
		UI.addButton("Clear Screen", this::clearScreen);
	}
	
	
	public void clearScreen()
	{
		UI.clearGraphics();
	}
	
	public void drawManyLollipops()
	{
		int n = UI.askInt("Enter no of lolls you want to draw");
		double count=100;
		while(!(n==0))
		{
			
			
			double x = (n*count)+200,y=n+100,size =100,lenght=100;			
			//x= UI.askDouble("Enter x");
			//y= UI.askDouble("Enter y");
			//size= UI.askDouble("Enter size");
			//lenght=UI.askDouble("Enter lenght");
			this.drawLolli(x,y,size,lenght);
			n--;
			//count+=30;
		}
	}
	
	public void drawLollipops()
	{
		int n = UI.askInt("Enter no of lolls you want to draw");
		
		while(!(n==0))
		{
			double x,y,size,lenght;
			x= UI.askDouble("Enter x");
			y= UI.askDouble("Enter y");
			size= UI.askDouble("Enter size");
			lenght=UI.askDouble("Enter lenght");
			this.drawLolli(x,y,size,lenght);
			n--;
		}
	}
	
	public void drawLolli(double x,double y, double size, double lenght)
	{
		UI.setLineWidth(10);
		UI.setColor(Color.black);
		UI.drawLine(x, y, x, y+lenght);
		UI.setColor(Color.red);
		//UI.fillOval
		UI.fillOval(x-size/2,y-size/2,size,size);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MethodDrawLollipops();

	}

}
