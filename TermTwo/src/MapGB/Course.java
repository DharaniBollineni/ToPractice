package MapGB;

public class Course {

	private String code;
	private String name;
	private String grade;
	
	
	//array list of student class
	public Course(String code,String name,String grade) {
		this.code= code;
		this.name=name;
		this.grade = grade;	
	}
	
	public String toString() {
		return code +" "+ name+ " " +grade;
	}
	// getters and setters
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
