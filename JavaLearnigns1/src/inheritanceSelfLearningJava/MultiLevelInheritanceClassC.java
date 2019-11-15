package inheritanceSelfLearningJava;

public class MultiLevelInheritanceClassC  extends MultiLevelInheritanceClassB{
	void displayC() {
		System.out.println("Inside class:: MultiLevelInheritanceClassC");
	}

	public static void main(String[] args) {
		MultiLevelInheritanceClassC cRef = new MultiLevelInheritanceClassC();
		cRef.displayC();
		cRef.displayB();    // access parent class B methods directly
		cRef.displayA();    // access parent class A methods indirectly 
	}

}
