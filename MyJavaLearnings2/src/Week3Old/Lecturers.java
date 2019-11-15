package Week3Old;

public class Lecturers {
	private String lecturName;
	private int id;
	private double teachingCost;
	public Lecturers(String lecturName, int id, double teachingCost)
	{
		this.setLecturName(lecturName);
		this.setId(id);	
		this.setTeachingCost(teachingCost);
		
	}
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
