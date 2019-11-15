package inheritanceSelfLearningJava;

public class HieraricalInheritanceClassA {

	void displayA() {
		System.out.println("Inside class:: displayA :: MultiLevelInheritanceClassA");
	}

	void display()
	{
		System.out.println("Inside class ::display:: MultiLevelInheritanceClassA");
	}
	public static void main(String[] args) {

		HieraricalInheritanceClassA aRef = new HieraricalInheritanceClassA();
		aRef.displayA();
		
	}

}
