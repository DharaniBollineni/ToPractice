package inheritanceSelfLearningJava;

public class HieraricalInheritanceClassC  extends HieraricalInheritanceClassA{
	void displayC() {
		System.out.println("Inside class:: MultiLevelInheritanceClassC");
	}

	void display()
	{
		System.out.println("Inside class ::display:: MultiLevelInheritanceClassC");
	}
	public static void main(String[] args) {
		HieraricalInheritanceClassC cRef = new HieraricalInheritanceClassC();
		cRef.displayC();
		cRef.displayA();    // access parent class A methods directly 
		//cRef.displayB();    //Compile time error :: The method displayC() is undefined for the type HieraricalInheritanceClassC
		cRef.display();
	}

}
