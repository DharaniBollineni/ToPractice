package mapUpdated;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class SchoolStudent {

    private int sID;
	private String sName;
	private static int unSID = 0;
	private String grade;
	private String course;
	

	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	private boolean completedCourse = false;
	
	
	//private List<Course> completed = new ArrayList<Course>();
	private List<Course> enrolled = new ArrayList<Course>();
	private Map<Course, String> finishedCourse = new HashMap<Course, String>();	// course objectRef and grade
	
	/**********************************/
	
	private Map<SchoolStudent,String> brandFinishedCourse = new HashMap<SchoolStudent, String>();
	
	/************************************/
	
	//List <Course> courses = new ArrayList<Course>();	
	public SchoolStudent(String sName) {
		unSID++;
		setsID(unSID);
		//this.sID=sID;
		this.sName=sName;		
		}
	public SchoolStudent(String grade, boolean completedCourse)
	{
		this.grade = grade;
		this.completedCourse = completedCourse;
		this.course = course;
	}
	
	public SchoolStudent () {
		
		this.getClass();
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
		//s.setCompletedCourse(true);
		setFinishedCourse(c, grade);   // 
		enrolled.remove(c);
	}
	
	public void brandUpdateGrade(SchoolStudent s, Course c) {
		//s.setGrade(grade);
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
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	/**
	 * @return the brandFinishedCourse
	 */
	public Map<SchoolStudent,String> getBrandFinishedCourse() {
		return brandFinishedCourse;
	}
	/**
	 * @param brandFinishedCourse the brandFinishedCourse to set
	 */
	public void setBrandFinishedCourse(SchoolStudent studentCourse,String grade) {
		brandFinishedCourse.put(studentCourse,grade);
		this.brandFinishedCourse = brandFinishedCourse;
	}

}
