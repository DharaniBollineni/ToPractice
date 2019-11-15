package selfLearning;


public class ConstructorChainingAndOverLoading5 extends ParentClassConstructorOverLading5
{

	public ConstructorChainingAndOverLoading5() {
		this(10);  // calls arg constructor in the class --> ConstructorChainingAndOverLoading5
		System.out.println("Inside child class no arg constructor");
	}
	
	public ConstructorChainingAndOverLoading5(int a)
	{
		super();      // calls no arg constructor parent class --> ParentClassConstructorOverLading5
		System.out.println("Inside child class single arg constructor");
	}
	public static void main(String[] arg)
	{
		ConstructorChainingAndOverLoading5 objRef= new ConstructorChainingAndOverLoading5();
	}
}
