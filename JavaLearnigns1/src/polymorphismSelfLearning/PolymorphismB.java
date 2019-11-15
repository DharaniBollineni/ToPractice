package polymorphismSelfLearning;

//static binding

public class PolymorphismB extends PolymorphismA
{
	@Override
	void method()
	{
		System.out.println("From Class B");
	}
	void methodB()
	{
		System.out.println("From Class B method");
	}
	
	
	
}