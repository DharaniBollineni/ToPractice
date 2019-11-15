package Week3Files;

import java.util.ArrayList;
import java.util.Scanner;

import ecs100.UI;

public class ICTUI {
	public ArrayList<CourseICT> coursesICT = new ArrayList<>();
	public ArrayList<Student> studentICT = new ArrayList<>();
	public ArrayList<Lecturer> lecturerICT = new ArrayList<>();
	public ArrayList<Department> departmentICT = new ArrayList<>();
	
	//public CourseICT c;
	//ArrayList<Student> students = new ArrayList<Student>();
	public ICTUI()
	{
		 UI.initialise();
		 UI.addButton("Add student", this::addStudent);
		 UI.addButton("Add Course", this::addCourse);
		 UI.addButton("Add Lecturer", this::addLecturer);
		 UI.addButton("Add Department", this::addDepartment);
		 UI.addButton("Add Department To Course", this::addDepartmentToCourse);
		 UI.addButton("Enroll Studnet to Course", this::addEnrollStudnettoCourse);
		 UI.addButton("Enroll Lecture to the course", this::addLecturerToCourse);
		 UI.addButton("Display StudentCourse", this::displayStudents);
		 UI.addButton("Display LectureCourse", this::displayLectures);
		 UI.addButton("Display DepartmentCourse", this::displayDepartment);
		 UI.addTextField("profit Of a Course", this::profitOfCourse);
		 
		 
	}
	
	
	public void addCourse()
	{
		  String name=UI.askString("Enter the name");
		  String cId=UI.askString("Enter the ID");
		  
		  int points=UI.askInt("Enter points of the course");
		  int roomCost=UI.askInt("Enter the roomCost");
		  CourseICT c =new CourseICT(name,cId,points,roomCost);	
		  coursesICT.add(c);		
	}	
	
	
	public void addStudent()
	{
	  String name=UI.askString("Enter the name");
	  int sid=UI.askInt("Enter the ID");
	  if (!checkExists(sid))
	  {
			  double sPrice=UI.askDouble("Enter the sPrice");
			  Student s = new Student(name,sid,sPrice,null);	
			  
			  studentICT.add(s);	
			  
	  }
	  else {
			UI.println("Invalied ID");
		}
	
	}
	public boolean checkExists(int targetId) {
		for (Student s : studentICT) {
			if (s.getId() == targetId) {
				return true;
			}
		}
		return false;
	}

	public void addLecturer()
	{
		String lecturName=UI.askString("Enter the lecturName");
		int lId=UI.askInt("Enter the ID");		  
		double  teachingCost=UI.askDouble("Enter teachingCost");
		Lecturer l =new Lecturer(lecturName,lId,teachingCost);	
		lecturerICT.add(l);		
		
	}
	public void addDepartment()
	{
		String deptName=UI.askString("Enter the deptName");
		int dId=UI.askInt("Enter the ID");		  
		Department d =new Department(deptName,dId);	
		departmentICT.add(d);		
	}
	public void addDepartmentToCourse()
	{
		String cName=UI.askString("Enter Course Name");
		String dName=UI.askString("Enter Department name");
		for (CourseICT cIct:coursesICT)
		{
			if (cIct.getName().equals(cName))
			{for (Department dIct:departmentICT)
			{
				if (dIct.getName().equals(dName))
				{
					dIct.addDeptCourses(cIct);
					return;
				}
			}
				
			}
		}
	}
		
		
	public void addLecturerToCourse() {
		String cName=UI.askString("Enter Course Name");
		String lName=UI.askString("Enter lecturer name");
		for (CourseICT cIct:coursesICT)
		{
			if (cIct.getName().equals(cName))
			{for (Lecturer lIct:lecturerICT)
			{
				if (lIct.getLecturName().equals(lName))
				{
					cIct.addLecturer(lIct);
				}
			}
				
			}
		}
		
	}
	
	public void addEnrollStudnettoCourse()
	{
		String cName=UI.askString("Enter Course Name");
		String sName=UI.askString("Enter StudnetName");
		for (CourseICT cIct:coursesICT)
		{
			if (cIct.getName().equals(cName))
			{
				//check student if 
				for (Student sIct:studentICT)
				{
					if (sIct.getName().equals(sName))
					{
						//UI.
						//<<<< add course name to student
						
						cIct.enrollStudent(sIct,cName);
					}
				}
				
			}
		}
		
	}
	public void displayStudents()
	{
		String cName=UI.askString("Enter Course Name");
		for (CourseICT cIct:coursesICT)
		{
			if (cIct.getName().equals(cName))
			{
				cIct.displayStudent(cIct);
			}
		}
	}
	public void displayLectures()
	{
		String cName=UI.askString("Enter Course Name");
		for (CourseICT cIct:coursesICT)
		{
			if (cIct.getName().equals(cName))
			{
				cIct.displayLecturers();
			}
		}
	}
	public void displayDepartment()
	{
		int deptID=UI.askInt("Enter Department Name");
		for (Department deptIct:departmentICT)
		{
			if (deptIct.getName().equals(deptID))
			{
				deptIct.addDeptCourses(deptIct);
			}
		}
	}
	
	
	
	public void profitOfCourse(String courseName)
	{
		/*note on Calculate profit 
		Expenditure = 	roomCost+ teaching cost
		earning = fees of student
		profit= earning-Expenditure*/
		
		// related to course 1
		//String cName=UI.askString("Enter Course Name");
		for (CourseICT cIct:coursesICT)
		{
			if (cIct.getName().equals(courseName))
			{
				double expenditure=cIct.getRCost()+cIct.getTeachingCost();
				double income = cIct.getStudentsFees();
				double profit =income-expenditure;
				if (profit>=0)
				{
					System.out.println("Profit is "+profit);
				}
				else
				{
					System.out.println("Loss"+Math.abs(profit));
				}
			}
		}
		
		
	}
	public static void main(String[] args) {
		new ICTUI();
		
		
	}

}
