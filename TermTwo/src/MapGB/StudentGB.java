package MapGB;

import java.util.ArrayList;
import java.util.List;

import mapUpdated.Course;

public class StudentGB {

	private Long sID;
	private String sName;
	private List<Course> completed = new ArrayList<Course>();
	private List<Course> enrolled = new ArrayList<Course>();

	public StudentGB(Long sID, String sName) {
		this.sID = sID;
		this.sName = sName;
	}

	public void addCourse(Course c)
	{
		this.enrolled.add(c);		
	}
	
	public Long getsID() {
		return sID;
	}

	public void setsID(Long sID) {
		this.sID = sID;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public List<Course> getCompleted() {
		return completed;
	}

	public void setCompleted(List<Course> completed) {
		this.completed = completed;
	}

	public List<Course> getEnrolled() {
		return enrolled;
	}

	public void setEnrolled(List<Course> enrolled) {
		this.enrolled = enrolled;
	}
	
}
