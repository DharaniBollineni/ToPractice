package nz.ac.currency.convert;
import ecs100.UI;


public class PracticeConCircles {
	public PracticeConCircles() {
		UI.initialise();
		// UI.addButton("Draw a single house",this::singleHouse);
		//UI.addButton("Draw circles", this::circles);
		UI.addButton("Gride of concentric circles", this::gConcentricCircles);
	}

	public void gConcentricCircles() {
		for(int i=1;i<=4;i++)
		{
		for (int j=1;j<=4;j++)
		{
		int radius = 30, conWd = 60*i, conHt = 60*j;
		while (radius > 0)
			{
			int x = conWd - radius, y = conHt - radius;
			UI.drawOval(x, y, 2 * radius, 2 * radius);
			//UI.drawOval(x, y, width, height);
			radius -= 5;
		} 
		}
		}

	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PracticeConCircles();

	}

}
