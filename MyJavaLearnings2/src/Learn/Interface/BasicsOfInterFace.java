package Learn.Interface;

//https://beginnersbook.com/2013/05/java-interface/
public class BasicsOfInterFace implements MyInterface {
	/*
	 * This class must have to implement both the abstract methods else you will get
	 * compilation error
	 */
	public void method1() {
		System.out.println("implementation of method1");
	}

	public void method2() {
		System.out.println("implementation of method2");
	}

	public static void main(String arg[]) {
	//	MyInterface obj = new BasicsOfInterFace();
		BasicsOfInterFace obj = new BasicsOfInterFace();
		obj.method1();
	}

}
