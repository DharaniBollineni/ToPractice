package polymorphismSelfLearning;

public class methodOverRidingXYZ1 extends methodOverRidingTest  // inheritance HAS-A Relationship
{
	void display()
	{
		System.out.println("2");
	}
	public static void main(String[] args) {
		methodOverRidingTest t=new methodOverRidingTest();
		t.display();
		methodOverRidingXYZ1 x=new methodOverRidingXYZ1();
		x.display();	//	method overriding
	}
}
