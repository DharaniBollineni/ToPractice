package selfLearning;

public class NoArgumentConstructor2 {

	String name;
	int id;
	
	public NoArgumentConstructor2() {
		
	}

	public static void main(String[] args) {
		NoArgumentConstructor2 NoArgRef= new NoArgumentConstructor2(); // Compiler creates a constructor
		System.out.println(NoArgRef.name);
		System.out.println(NoArgRef.id);	
		
	}

}
