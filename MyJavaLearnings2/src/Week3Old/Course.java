package Week3Old;

import java.util.ArrayList;
import java.util.List;

public class Course {

	// field / variable declaration
	private String name;
	private String id;
	private List<Student> students = new ArrayList<>();
	
	//Adjust and refactor
	private int points;
	private int rCost;	
	private List<Lecturer> lecturers = new ArrayList<>();

	public Course(String name, String id, int points, int roomCost) {
		this.setId(id);
		this.setName(name);
		this.setPoints(points); //Adjust and refactor
		this.setRCost(rCost);	//Adjust and refactor

	}
	//Add a method to enrol a student into a course.
	public void enrolStudent(Student s) {

		if(!checkExists(s.getId()))
		{
		this.students.add(s);
		}
		else
		{
			System.out.println("Invalied ID");
		}
	}
	public boolean checkExists(int target)
	{
		for(Student s : this.students)
		{
			if(s.getId()==target)
			{
				return true;
			}
			
		}
		return false;
		
	}

	

	public void displayStudent() {
		System.out.println("Course Name : " + this.getName());
		System.out.println("Course Id: " + this.getId());
		System.out.println("Course Points: " + this.getPoints());
		System.out.println("Course Cost:" + this.getRCost());
		// System.out.println(this.getName());

		for (Student sDetails : students) {
			System.out.println("Student Name   ::  " + sDetails.getName());
			System.out.println("Student ID   ::  " + sDetails.getId());
			System.out.println("Student fee   ::  " + sDetails.getsPrice());
		}
	}

	public void addLecturers(Lecturer l) {

		this.lecturers.add(l);
	}

	public void displayLecturersDetails() {
		System.out.println("Course Name : " + this.getName());
		System.out.println("Course Id: " + this.getId());
		for (Lecturer l1 : lecturers) {
			System.out.println("LecturName   :  " + l1.getLecturName());
			System.out.println("LecturId   :  " + l1.getId());
			System.out.println("Lectur payment   :  " + l1.getTeachingCost());
		}
	}	

	// add all the teaching cost of the lecturers to calculate profit

	public int getTeachingCosts() {
		int c = 0;

		for (Lecturer l : this.lecturers) {
			c += l.getTeachingCost();
		}
		return c;
	}

	// add all the fees of all the student to calculate profit based on the points
	public int getStudentsFees() {
		int c = 0;

		for (Student s : this.students) {
			c += s.getsPrice() * points;
		}
		return c;
	}

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
