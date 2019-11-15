package selfLearning;

public class ThisCurrentClassConstructor1 {
//case 1:	
//	public ThisCurrentClassConstructor1()
//	{
//		System.out.println("Inside the ThisCurrentClassConstructor1 no agr constructor");
//	}
//	public ThisCurrentClassConstructor1(int a)
//	{
//		this();
//		System.out.println("Inside the ThisCurrentClassConstructor1 with argument constructor & given arg is "+a);		
//	}
//	
	// case2: Calling parameterized constructor from default constructor:
	public ThisCurrentClassConstructor1()
	{
		this(100);
		System.out.println("Inside the ThisCurrentClassConstructor1 no agr constructor");
	}
	public ThisCurrentClassConstructor1(int a)
	{
		
		System.out.println("Inside the ThisCurrentClassConstructor1 with argument constructor & given arg is "+a);		
	}
	
}
