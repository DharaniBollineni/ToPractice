package mathProgarms;

public class MathFunctions {

	public void mathCeiling()
	{
		System.out.println("Ceiling value of 45: "+Math.ceil(45));
        System.out.println("Ceiling value of -45.6: "+Math.ceil(-45.6));
        System.out.println("Ceiling value of 72.1: "+Math.ceil(72.1));
        System.out.println("Ceiling value of 45.3: "+Math.ceil(45.3));
	}
	
	/*
	 * Description: Math.copySign() method returns the first argument with the sign
	 * of the second argument.
	 * 
	 */
	public void mathCopysign()
	{
		System.out.println("After copying sign from -10, the value is: " + Math.copySign(20.5, -10));
		System.out.println("After copying sign from -3, the value is: " + Math.copySign(23.1, -3));
		System.out.println("After copying sign from -10, the value is: " + Math.copySign(-10.5, 1));
		
	}
	
	/*
	 * Description: Math.exp() method gives you the exponential value of the given
	 * number. Below example shows how to get exponential value.
	 */
	// The number e is an irrational number, whose value is constant and is approximately equal to 2.7182
	public void mathExponential()
	{
		System.out.println("(Exponential value-1) of 5: "+Math.expm1(5));
        System.out.println("(Exponential value-1) of 25: "+Math.expm1(25));
        System.out.println("(Exponential value-1) of 16: "+Math.expm1(16));
	}
	
	//The Math.floor() method returns the largest integer which is not grater than the argument value.
	public void mathFloor()
	{
		System.out.println("Floor value of 45: "+Math.floor(45));
        System.out.println("Floor value of -45.6: "+Math.floor(-45.6));
        System.out.println("Floor value of 72.1: "+Math.floor(72.1));
        System.out.println("Floor value of 45.3: "+Math.floor(45.3));
	}
	
	//The Math.max() method returns the maximum number of the given two numbers. Below example shows how to get max number.
	
	public void maxNumber()
	{
		 System.out.println("Max value of 523, 456 is: "+Math.max(523, 456));
         System.out.println("Max value of 34.23, 45 is: "+Math.max(34.23, 45));
         System.out.println("Max value of 41.89, 23.45 is: "+Math.max(41.89, 23.45));
		
	}
	
	
	// The Math.min() method returns the minimum number of the given two numbers. Below example shows how to get min number.
	public void minNumber()
	{
		System.out.println("Min value of 523, 456 is: "+Math.min(523, 456));
        System.out.println("Min value of 34.23, 45 is: "+Math.min(34.23, 45));
        System.out.println("Min value of 41.89, 23.45 is: "+Math.min(41.89, 23.45));
	}
	/*
	 * length of hypotenuse
	 * In geometry, a hypotenuse is the longest side of a right-angled triangle, 
	 * the side opposite the right angle. The length of the hypotenuse of a
	 * right triangle can be found using the Pythagorean theorem, which states that 
	 * the square of the length of the hypotenuse equals 
	 * the sum of the squares of the lengths of the other two sides.
	 */
	public void hypothasis()
	{
		int x = 10;
        int y = 20;
        System.out.println("The length of hypotenuse is: "+Math.hypot(x, y));
	}
	
	//The exponential function is f(x) = ex. The Math.getExponent() method is used to get the x value 
	//of the given parameter, in which the parameter is a result of exponential function calculation.
	public void MyExponentEx()
	{
		 System.out.println("Exponent value of 15.0 is: "+Math.getExponent(15.0));
	        System.out.println("Exponent value of 22.0 is: "+Math.getExponent(22.0));
	        System.out.println("Exponent value of 65 is: "+Math.getExponent(65));
	}
	
	public void MyLogEx()
	{
		System.out.println("Natural logarithm value of 2 is: "+Math.log(2));
		System.out.println("Natural logarithm value of 10 is: "+Math.log(10));
		System.out.println("Natural logarithm value of 15 is: "+Math.log(15));
	}
	//Below example shows how to calculate base 10 logarithm value of a given number using Math.log10() function.
	public void MyLogBase10Ex()
	{
		System.out.println("Base 10 logarithm value of 2 is: "+Math.log10(2));
        System.out.println("Base 10 logarithm value of 10 is: "+Math.log10(10));
        System.out.println("Base 10 logarithm value of 15 is: "+Math.log10(15));
	}
	
	//Math.nextAfter() method returns the floating-point number adjacent to the first argument in the direction of the second argument.
	public void mathNextAfter()
	{
		System.out.println("Next after value of 10 in the direction of 7: " + Math.nextAfter(10, 7));
		System.out.println("Next after value of 10 in the direction of 12: " + Math.nextAfter(10, 12));
	}
	
	// Math.nextUp() method returns the floating-point value adjacent to the given
	// number in the direction of positive infinity.
	public void MyNextUpEx() {
		System.out.println("Next up value for 21.3 is: " + Math.nextUp(21.3));
		System.out.println("Next up value for 29.2 is: " + Math.nextUp(29.4));
	}

	// Math.random() method returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
	public void MyRandomEx()
	{      
	        System.out.println("Random number: "+Math.random());
	        System.out.println("Random number: "+Math.random());
	        System.out.println("Random number: "+Math.random());
	 }
	//Math.rint() method returns the double value that is closest in value to the argument and is equal to a mathematical integer.
	public void MyRintEx()
	{	         
	        System.out.println("rint value of 12.345 is: "+Math.rint(12.345));
	        System.out.println("rint value of 24.298 is: "+Math.rint(24.298));
	        System.out.println("rint value of 76.65 is: "+Math.rint(76.65));
	    }
	
	// Math.round() method returns closest integer or long value for the given decimal value.
	public void MyRoundEx()
	{
	        System.out.println("23.2 after rounding: "+Math.round(23.2));
	        System.out.println("16.8 after rounding: "+Math.round(16.8));
	        System.out.println("15.5 after rounding: "+Math.round(15.5));
	 }
	//Math.signum() function returns zero if the passed argument is zero, 1.0 if the passed argument is greater than zero, -1.0 if the passed argument is less than zero.
	public void MySignumEx() {
	         
	        System.out.println("signum value of 20.23 is: "+Math.signum(20.23));
	        System.out.println("signum value of 0 is: "+Math.signum(0));
	        System.out.println("signum value of -20.23 is: "+Math.signum(-20.23));
	    }
	//Math.sqrt() function returns rounded positive square root of the given number.

	public void MySqrtEx() {
	        System.out.println("Square root of 16 is: "+Math.sqrt(16));
	        System.out.println("Square root of 4.6 is: "+Math.sqrt(4.6));
	        System.out.println("Square root of 21 is: "+Math.sqrt(21));
	    }
	
	//Math.toDegrees() method converts the given angle from radians to degrees format.
	public void MyRadTodegEx() {
	         
	        System.out.println("Radiance 1.0 in degrees: "+Math.toDegrees(1.0));
	        System.out.println("Radiance 2.0 in degrees: "+Math.toDegrees(2.0));
	    }
	//Math.toRadians() method converts the given angle from degrees to radians format.
	public void MyDegToRad() {	         
	        System.out.println("30 Degrees in radians: "+Math.toRadians(30));
	        System.out.println("90 Degrees in radians: "+Math.toRadians(90));
	    }
	public static void main(String[] args) {
		MathFunctions tRef= new MathFunctions();
		tRef.mathCeiling();
		tRef.mathCopysign();
		tRef.mathFloor();
		tRef.maxNumber();
		tRef.minNumber();
		tRef.hypothasis();
		tRef.MyExponentEx();
		tRef.MyLogEx();
		tRef.MyLogBase10Ex();
		tRef.mathNextAfter();
		tRef.MyNextUpEx();
		
	}

}
