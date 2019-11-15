package mapexcercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    private int sID;
	private String sName;
	//private List<Course> completed = new ArrayList<Course>();
	private List<Course> enrolled = new ArrayList<Course>();
	private Map<Course, String> finishedCourse = new HashMap<Course, String>();	// course objectRef and grade
	
	//List <Course> courses = new ArrayList<Course>();	
	public Student(int sID,String sName) {
		this.sID=sID;
		this.sName=sName;		
		}
	

	//enroll
	public void addCourse(Course c)
	{
		this.enrolled.add(c);		
	}
	public void removeCourse(Course c)
	{
		this.enrolled.remove(c);		
	}
	
	// update grade once completed
	public void updateGrade(Course c, String grade)
	{
		c.setGrade(grade);
		setFinishedCourse(c, grade);   // 
		enrolled.remove(c);
	}
//	}
	
	//public void 
	
	
	
	//unenroll /withdraw
	public void withdrawCourse(Course s)  //withdraw from course --> code ???
	{
		this.enrolled.remove(s);
	}
	public String toString()
	{
		return sID +" "+ sName+ enrolled;         
	}

	public int getsID() {
		return sID;
	}

	public void setsID(int sID) {
		this.sID = sID;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

//	

//	public List<Course> getCompleted() {
//		return completed;
//	}
//
//	public void setCompleted(List<Course> completed) {
//		this.completed = completed;
//	}

	public List<Course> getEnrolled() {
		return enrolled;
	}

	public void setEnrolled(List<Course> enrolled) {
		this.enrolled = enrolled;
	}
	
	public Map<Course, String> getFinishedCourse() {
		return finishedCourse;
	}

	public void setFinishedCourse(Course c, String grade) {
		finishedCourse.put(c, grade);
		this.finishedCourse = finishedCourse;
	}

}
