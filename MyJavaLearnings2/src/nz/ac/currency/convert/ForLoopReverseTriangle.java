package nz.ac.currency.convert;

import ecs100.UI;

public class ForLoopReverseTriangle {
	public double hWd=100;
	public ForLoopReverseTriangle()
	{
		UI.initialise();
		UI.addButton("Draw Reverse Triangle", this::revTri);
		
	}
	public void revTri()
	{	int n=4,i,j,l=100,t=110;
		double left,top;
		for(i=0;i<=4;i++)
		{
			for(j=0;j<n-i;j++)
			{
				left = 100 + j * (hWd+1); // x coordinates keeps changing, so using columns
			    top = 50 + i * (hWd+1); // y coordinates remains same, so using row.
				UI.fillRect(left, top, hWd, hWd); // width and height is same for square
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ForLoopReverseTriangle();

	}

}
