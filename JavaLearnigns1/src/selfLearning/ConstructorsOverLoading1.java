package selfLearning;


public class ConstructorsOverLoading1 {

	public ConstructorsOverLoading1() {
		System.out.println("Inside no arg constructor");

	}

	public ConstructorsOverLoading1(int a) {
		System.out.println("Inside parameter constructor with int value "+ a);
	}

	public ConstructorsOverLoading1(String name) {
		System.out.println("Inside parameter constructor with a String "+name);
	}

	public ConstructorsOverLoading1(int a, String name) {
		System.out.println("Inside parameter constructor with a int and a String "+a+" "+name);
	}

	public static void main(String[] args) {
		//ConstructorsOverLoading1 objRef1= new ConstructorsOverLoading1();
//		ConstructorsOverLoading1 objRef1= new ConstructorsOverLoading1(100);
//		ConstructorsOverLoading1 objRef1= new ConstructorsOverLoading1("Chinmayi");
		ConstructorsOverLoading1 objRef1= new ConstructorsOverLoading1(200,"Dharani");
//		
		
		

	}

}
