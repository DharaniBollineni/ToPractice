package inheritanceSelfLearningJava;

public class InheritanceProgrammer extends InheritanceEmployee{

	float bonus = 1000;
	
	public static void main(String[] args) {
		InheritanceProgrammer progRef= new InheritanceProgrammer();
		System.out.println(progRef.salary);
		System.out.println(progRef.bonus);

	}

}
