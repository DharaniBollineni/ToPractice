package polymorphismSelfLearning;

public class MethodOverLoadingBasic {

	
	void display()
	{
		System.out.println("1");		
	}
		
	void display(int a)
	{
		System.out.println("2");
	}
	void display(String a)
	{
		System.out.println("3");
		
	}
	void display(String a, int b)
	{
		System.out.println("4");
		
	}
	void display(Object a)              // while resolving overloading methods complier will always give 
										//precedence for the child type arguments than compared with parent type argument
										// hence given a call to int or String.
	{
		System.out.println("5");		
	}
	void display(int a, double b)
	{
		System.out.println("6");		
		
	}
	
//	String display()   //CTE:: Duplicate method display() in type MethodOverLoading
//	{
//		
//	}
	public static void main(String[] args) {
		MethodOverLoadingBasic mL= new MethodOverLoadingBasic();
		mL.display();
		mL.display(65);
		mL.display("abc");
		mL.display("xyz",95);
		mL.display("pqr",'b');
		mL.display('a');
		mL.display(12,32.1);
		mL.display(12,32);
		
	}
}
