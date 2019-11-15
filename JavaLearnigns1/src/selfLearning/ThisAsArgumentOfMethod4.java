package selfLearning;
//The this keyword can also be passed as an argument in the method. It is mainly used in the event handling. 
//Let's see the example:
public class ThisAsArgumentOfMethod4 {
	
	void method1(ThisAsArgumentOfMethod4 objRef)
	{
		System.out.println("Method1 is invoked and this is passed as argument. this holds noting but of object reference of that class");
	}
	
	void method2()
	{
		method1(this);
	}
	public static void main(String[] args) {
		ThisAsArgumentOfMethod4 t= new ThisAsArgumentOfMethod4();
		t.method2();
	}

}
