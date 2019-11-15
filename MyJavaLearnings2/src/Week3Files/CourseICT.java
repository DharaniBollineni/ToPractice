package Week3Files;

import java.util.ArrayList;
import java.util.List;

import ecs100.UI;


public class CourseICT {
	// field / variable declaration
	private String name;
	private String id;
	private List<Student> studentsCourse = new ArrayList<>();
	private List<Lecturer> lecturers = new ArrayList<>();

	// Adjust and refactor
	private int points;
	private int rCost;

	// constructor of the class student
	public CourseICT(String name, String id,int points, int roomCost) {
		this.setName(name);
		this.setId(id);
		this.setPoints(points); //Adjust and refactor
		this.setRCost(rCost);	//Adjust and refactor

	}

	// method to enroll students in a class
	public void enrollStudent(Student s,String courseName) {
				s.setCourseName(courseName);
				this.studentsCourse.add(s);
		}
	

	// add lecturer
	public void addLecturer(Lecturer l) {

		
		this.lecturers.add(l);
	}

	// calculate teaching cost
	
	public double getTeachingCost()
	{
		int teachCost = 0;
		for (Lecturer l : this.lecturers) {
			teachCost += l.getTeachingCost();
		}
		return teachCost;
	}
	// get fees of student related to a course
	public double getStudentsFees()
	{
		int studFees = 0;

		for (Student s : this.studentsCourse) {
			studFees += s.getsPrice() * points;
		}
		return studFees;

	}
	// CourseLoader method
	public void courseLoader()
	{
		System.out.println("students in the course");
		for(Student s: studentsCourse)
		{
			UI.println(s.getName());
		}
		
	}
	// display student details
	public void displayStudent(CourseICT cIct) {
		//System.out.println("Course Name : " + this.getName());
		//System.out.println("Course Id: " + this.getId());
		// student details
		UI.println(cIct.getName());
		
		for (Student sDetails : studentsCourse) {
			if (cIct.getName().equals(sDetails.getCourseName()))
			{
			UI.println("Student ID   ::   " + sDetails.getId());
			UI.println("Student Name   ::   " + sDetails.getName());
			}

		}
	}
	// display lecturer details in a course
	public void displayLecturers() {
		//UI.println("Course Name : " + this.getName());
		//UI.println("Course Id: " + this.getId());
			for (Lecturer l1 : lecturers) {
				//if()
				UI.println("LecturName   :  " + l1.getLecturName());
				UI.println("LecturId   :  " + l1.getId());
				UI.println("Lectur payment   :  " + l1.getTeachingCost());
			}
		}	
	

	// -------------------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getRCost() {
		return rCost;
	}

	public void setRCost(int roomCost) {
		this.rCost = roomCost;
	}

}
