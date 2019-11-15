package Week3Files;

public class Student {

	// field / variable declaration
	private String name;
	private int id;
	private double sPrice;
	private String courseName;

	// constructor of the class student
	public Student(String name, int id,double sPrice,String courseName) {
		this.setName(name);
		this.setId(id);
		this.setsPrice(sPrice);// Adjust and refactor
		this.setCourseName(courseName);
		
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String name) {
		this.courseName = name;
	}

	// ----------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// ----------
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// ----------
	public double getsPrice() {
		return sPrice;
	}

	public void setsPrice(double sPrice) {
		this.sPrice = sPrice;
	}

}
