package Week3Old;

public class Student {
	
	// field / variable declaration 
	private String name;
	private int id;
	private double sPrice;

	public Student(String name, int id, double sPrice) {												// constructor of the class student
		this.setName(name);
		this.setId(id);	
		this.setsPrice(sPrice);//Adjust and refactor
	}
	//----------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//----------
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	//----------
	public double getsPrice() {
		return sPrice;
	}

	public void setsPrice(double sPrice) {
		this.sPrice = sPrice;
	}

	
}
