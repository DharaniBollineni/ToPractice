package Week3Files;

import java.util.ArrayList;
import java.util.Scanner;

import ecs100.UI;

public class ICTSchool {

	public static void main(String[] args) {
	//	UI.initialise();
		// TODO Auto-generated method stub
		
		//test other class and objects
		// here main is related to back office
		
		// courses array list is used while enrolling
		ArrayList<Course> courses = new ArrayList<>();
		// adding students
		Student s1 = new Student("John",1,100);     
		Student s2 = new Student("Dharani",2,2000);
		Student s3 = new Student("jin",3,300000);     
		Student s4 = new Student("peter",4,500000);
		Student s5 = new Student("sun",4,0);
		
		//adding courses
		Course c =new Course("MSDEV","1",20,1000);
		Course c1 =new Course("MSBA","2",30,2000);
		
		courses.add(c);
		courses.add(c1);
		
		// adding students to the course1
		c.enrollStudent(s1);
		c.enrollStudent(s2);
		
		// adding students to the course2
		c1.enrollStudent(s3);
		c1.enrollStudent(s4);
		c1.enrollStudent(s5);
		
		//Display course1 details
		c.displayStudent();
		c1.displayStudent();
		
		// add lecturers 
		Lecturer l1 =new Lecturer("Karston",2120,15100);
		Lecturer l2 =new Lecturer("Ali",2121,13100);
		c.addLecturer(l1);
		c.addLecturer(l2);
		c.displayLecturers();
		
		Department d=new Department();
		d.addCourses(c);
		d.addCourses(c1);
		d.diaplyCourses();
		
		/*note on Calculate profit 
		Expenditure = 	roomCost+ teaching cost
		earning = fees of student
		profit= earning-Expenditure*/
		
		// related to course 1
		double expenditure=c.getRCost()+c.getTeachingCost();
		double income = c.getStudentsFees();
		double profit =income-expenditure;
		if (profit>=0)
		{
			System.out.println("Profit is "+profit);
		}
		else
		{
			System.out.println("Loss"+Math.abs(profit));
		}
		
		
		//Course load: allow asking a Student which courses 
		//it is enrolled in as well as asking a Course which Students it has. Make sure these agree with each other.
		System.out.println("Ask student courseName");
		Scanner myObj = new Scanner(System.in);
		String courseName = myObj.nextLine();
		System.out.println("courseName  "+courseName);
		myObj.close();
		for (Course cRef1: courses)
		{
			if(cRef1.getName().equals(courseName))
			{
				cRef1.courseLoader();
			}
		}
	}

}
