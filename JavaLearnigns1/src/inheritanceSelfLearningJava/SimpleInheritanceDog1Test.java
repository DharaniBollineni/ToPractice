package inheritanceSelfLearningJava;
/* SimpleInheritanceAnimal1 is parent and SimpleInheritanceDog1 is child class. which is done by extends keyword*/

public class SimpleInheritanceDog1Test extends SimpleInheritanceAnimal1
{
	void bark()
	{
		System.out.println("barking...");
	}
	
	public static void main(String[] args) {
		SirSimpleInheritanceDog1 objRef= new SirSimpleInheritanceDog1();
		objRef.eat();   // methods in parent class
		objRef.sleep();
		
	}

}
