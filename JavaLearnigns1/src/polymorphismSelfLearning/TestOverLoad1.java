package polymorphismSelfLearning;

public class TestOverLoad1 {

	public static void main(String[] args) {
		AdderMO a1=new AdderMO();
		//AdderMO a2=new AdderMO();
		System.out.println(a1.add(10, 20));
		System.out.println(a1.add(10, 20, 30));
		System.out.println(a1.add(10.0,20.3));

	}

}
