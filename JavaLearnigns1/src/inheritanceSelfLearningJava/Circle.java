package inheritanceSelfLearningJava;

public class Circle{
	
	Operation op;
	double pi= 3.14, areaOfCircle;
	
	double area(int radius)
	{
		op=new Operation();
		int rSquare= op.square(radius);
		return( pi*rSquare);
	}
	
	public static void main(String[] arg)
	{
		Circle c=new Circle();
		double result=c.area(5);
		System.out.println(result);
	}
}
