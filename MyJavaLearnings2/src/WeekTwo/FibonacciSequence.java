package WeekTwo;
import java.util.ArrayList;

import ecs100.UI;

public class FibonacciSequence {

	public FibonacciSequence() {
		UI.initialise();
		UI.addButton("Fibonacci Sequence", this::findFibonacci);

	}

	public void findFibonacci() {
		ArrayList<Double> fibArray= new ArrayList<Double>();
		double fib = 0;
		double x1 = 0, x2 = 1;
		for (int i = 0; i < 100; i++) {
			fib = x1 + x2;
			x1 = x2;
			x2 = fib;
			fibArray.add(fib);
		}
		for(int i=0;i<100;i++)
		{
			UI.println(fibArray.get(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FibonacciSequence();
	}

}
