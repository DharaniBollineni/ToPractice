package interfacePrograms;

public class TestInterface implements I1,I2
{
	public void show()
	{
		System.out.println("from I1");
	}
	public void display()
	{
		System.out.println("from I2");
	}	

	public static void main(String[] args) {
		TestInterface t1= new TestInterface();
		t1.show();
		t1.display();

	}

}
