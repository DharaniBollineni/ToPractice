package selfLearning;

public class ParametrizedConstructor3 {
	
	String name;
	int id;

	public ParametrizedConstructor3(String name, int id) {
		this.name=name;
		this.id=id;		
	}

	public static void main(String[] args) {
		
		ParametrizedConstructor3 parRef1= new ParametrizedConstructor3("Chinmayi",100);
		ParametrizedConstructor3 parRef2=new ParametrizedConstructor3("Dharani",101);
		
		System.out.println(parRef1.name);
		System.out.println(parRef1.id);
		
		System.out.println(parRef2.name);
		System.out.println(parRef2.id);
		
	}

}
