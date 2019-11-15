package Week3Files;

public class Lecturer {
	// variable declaration
	private String lecturName;
	private int id;
	private double teachingCost;
	private String courseName;
	
	// constructor creation
	public Lecturer(String lecturName, int id, double teachingCost)
	{
		
		// note add courseName
		this.setLecturName(lecturName);
		this.setId(id);	
		this.setTeachingCost(teachingCost);
		
	}
	
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String name) {
		this.courseName = name;
	}

	
	// getter and setter methods
	public String getLecturName() {
		return lecturName;
	}
	
	public void setLecturName(String lecturName) {
		this.lecturName = lecturName;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getTeachingCost() {
		return teachingCost;
	}
	
	public void setTeachingCost(double teachingCost) {
		this.teachingCost = teachingCost;
	}
}
