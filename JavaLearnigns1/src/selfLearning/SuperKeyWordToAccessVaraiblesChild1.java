package selfLearning;

public class SuperKeyWordToAccessVaraiblesChild1 extends SuperKeyWordToAccessVaraiblesParent1
{
	int i=20;
	void display(int i)
	{
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
		
	}
	public static void main(String[] args) {
		SuperKeyWordToAccessVaraiblesChild1 objR = new SuperKeyWordToAccessVaraiblesChild1();
		objR.display(30);
	}
	

}
