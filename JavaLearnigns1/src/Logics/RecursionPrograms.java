package Logics;

public class RecursionPrograms {

	static int x=0,y=1,t=0;  
	static int num=1;
	// factorial of 5 (5!) is 5*4*3*2*1
	public static int factorial(int n) {  
		if (n == 1)
			return n;
		else
			System.out.println(n);
			return (n * factorial(n - 1));
	}

	//Fibonacci Series :: 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377
	public static void printFibonacci(int count)
	{
		if(count>0)    
		{
			t=x+y;  // 0+1
			x=y;    //=1
			y=t;    //=1
			System.out.print(t+" ");
			printFibonacci(count-1);     // recursion stops if count is zero
		}
	}
	// n natural numbers using recursion
	
	public static void printNumbers(int count)
	{
		if (count > 0) {
			System.out.print(num+" ");
			num++;
			printNumbers(count - 1);
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Factorial is "+factorial(70));
		System.out.println("Factorial is ");
		System.out.print(x+" "+y+" ");
		printFibonacci(30);
		System.out.printf("\nNumber Series \n");
		printNumbers(30);
		
	}

}
