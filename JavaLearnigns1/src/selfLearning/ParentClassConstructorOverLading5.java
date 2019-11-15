package selfLearning;

public class ParentClassConstructorOverLading5 {

	public ParentClassConstructorOverLading5() {
		this(10);
		System.out.println("inside parent no arg constructor ");
	}
	public ParentClassConstructorOverLading5(int a)
	{
		System.out.println("Inside parent single arg constructor and the arg value is "+ a);
	}
	
	//new A().getA().msg(); 
	
	// A a = new A();
	// A b = a.getA();
	// b.msg();
}

