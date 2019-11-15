package inheritanceSelfLearningJava;
/* SimpleInheritanceAnimal1 is parent and SimpleInheritanceDog1 is child class. which is done by extends keyword*/


public class SirSimpleInheritanceDog1 extends SimpleInheritanceAnimal1
{
	
	public void eat() {
		drink(this);
	}
	
	public SirSimpleInheritanceDog1 drink(SirSimpleInheritanceDog1 dog) {
		return this;
	}

}
