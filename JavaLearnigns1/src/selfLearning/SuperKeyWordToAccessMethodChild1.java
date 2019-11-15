package selfLearning;

public class SuperKeyWordToAccessMethodChild1 extends SuperKeyWordToAccessMethodParent1 {

	void m1() {
		System.out.println("I'm m1() in child class SuperKeyWordToAccessMethodChild1");
	}

	void display() {
		m1();
		super.m1();
	}

	public static void main(String[] args) {
		SuperKeyWordToAccessMethodChild1 objR = new SuperKeyWordToAccessMethodChild1();
		objR.display();

	}

}
