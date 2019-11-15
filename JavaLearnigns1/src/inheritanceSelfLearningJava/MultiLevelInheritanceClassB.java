package inheritanceSelfLearningJava;

public class MultiLevelInheritanceClassB extends MultiLevelInheritanceClassA {

	void displayB() {
		System.out.println("Inside class:: MultiLevelInheritanceClassB");
	}

	public static void main(String[] args) {
		MultiLevelInheritanceClassB bRef = new MultiLevelInheritanceClassB();
		bRef.displayB();    
		bRef.displayA();    // access parent class A methods directly

	}

}
