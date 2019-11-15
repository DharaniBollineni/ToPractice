package mathProgarms;
/*
Program: How to get absolute value in java?

Description:
In mathematics, the absolute value (or modulus) |a| of a real number a is the numerical value of a without 
regard to its sign. So, for example, the absolute value of 3 is 3, and the absolute value of -3 is also 3. 
The absolute value of a number may be thought of as its distance from zero. 
Below example shows how to get absolute value using Math.abs() method.*/

public class AbsoluteValue {

	public static void main(String[] args) {
		double a = -343.232;
        int b = -34;
        double c = 9809.90;
        System.out.println("absolute value of a: "+Math.abs(a));
        System.out.println("absolute value of b: "+Math.abs(b));
        System.out.println("absolute value of c: "+Math.abs(c));
		
	}

}
