package inheritanceSelfLearningJava;

public class HieraricalInheritanceClassB extends HieraricalInheritanceClassA {

	void displayB() {
		System.out.println("Inside class::displayB MultiLevelInheritanceClassB");
	}
	
	void display()
	{
		System.out.println("Inside class ::display:: MultiLevelInheritanceClassB");
	}

	public static void main(String[] args) {
		HieraricalInheritanceClassB bRef = new HieraricalInheritanceClassB();
		bRef.displayB();    
		bRef.displayA();    // access parent class A methods directly
	//	bRef.displayC();   //Compile time error :: The method displayC() is undefined for the type HieraricalInheritanceClassB
		bRef.display();    // access current class methods
	}

}
