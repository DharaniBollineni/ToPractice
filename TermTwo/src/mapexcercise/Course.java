package mapexcercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Course {

	private String code;
	private String name;
	private String grade;
	private List<Student> enrolledStudent = new ArrayList<>();	
	private Map<Student, String> courseGrade = new HashMap<Student, String>();
	
	
	//array list of student class
	public Course(String code,String name) {//String grade) {
		this.code= code;
		this.name=name;
		//this.grade = grade;	// confused ????
	}
	public void addStudentInCourses(Student s)
	{
		this.enrolledStudent.add(s);		
	}
	public void removeStudent(Student s)
	{
		this.enrolledStudent.remove(s);		
	}
	public void updateCourseWithGrade(Student s, String grade)
	{
//		c.setGrade(grade);
		setCourseGrade(s, grade);
		enrolledStudent.remove(s);
		
	}
	
	public String toString() {
		return code +" "+ name;
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
	public List<Student> getEnrolledStudent() {
		return enrolledStudent;
	}
	public void setEnrolledStudent(List<Student> enrolledStudent) {
		this.enrolledStudent = enrolledStudent;
	}
	
	public Map<Student, String> getCourseGrade() {
		return courseGrade;
	}
	public void setCourseGrade(Student s, String g) {
		courseGrade.put(s, g);
		this.courseGrade = courseGrade;
	}
}
