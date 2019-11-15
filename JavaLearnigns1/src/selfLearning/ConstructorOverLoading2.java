package selfLearning;

public class ConstructorOverLoading2 {

	public ConstructorOverLoading2(int a, byte b) // Different signature 
	{
		System.out.println("Inside parameter constructor with int value and byte value"+ a+" "+ b);
	}
	public ConstructorOverLoading2(byte b, int a) // Different signature
	{
		System.out.println("Inside parameter constructor with byte value and int value "+ a+" "+b);
	}
	public static void main(String[] args) {
		/*ConstructorOverLoading2 objRef1= new ConstructorOverLoading2(10,300);  
		error msg: The constructor ConstructorOverLoading2(int, int) is undefined
		hence we need two variables 
		*/
		int a =100;
		byte b=100;
		//ConstructorOverLoading2 objRef1= new ConstructorOverLoading2(a,b);  
		ConstructorOverLoading2 objRef1= new ConstructorOverLoading2(b,a);  

	}

}
