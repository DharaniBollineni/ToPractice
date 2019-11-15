package MyClassPrograms;

public class A {

	A()
	{
		System.out.println("Constructor of Class A");
	}
	void AMethod()
	{
		System.out.println("Method of class A");
	}
	public static void main(String[] args) {
		A obj_A= new A();
		B obj_B=new B();
		obj_A.AMethod();
		obj_B.BMethod();
	obj_B.AMethod();
	//obj_A.B
		
	}

}
