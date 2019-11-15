package MapGB;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

//import mapexcercise.Course;
//import mapexcercise.Student;

public class EntryPointMapGB {
	static Long UN_SID = Long.valueOf(1000000);
	Map<Long, StudentGB> students = new HashMap<>();
	Map<String, Course> courses = new HashMap<>();
	Scanner sInput = new Scanner(System.in); // Create a Scanner object

	public EntryPointMapGB() {

		boolean entryFlag = true;
		// User interface
		while (entryFlag) {
			System.out.println("Enter ");
			System.out.println("1 for Adding new students");
			System.out.println("2 for Adding courses");
			System.out.println("3 for Looking up students by name");
			System.out.println("4 for Looking up students by ID");
			System.out.println("5 for Looking at courses");
			System.out.println("6 for display student details");
			System.out.println("7 for displaying course details");
			System.out.println("8 Enroll Student");
			System.out.println("9 for updating the grade once course completed");
			System.out.println("10 for viewGrades of completion ");

			System.out.println("30 to Quit");
			int n = sInput.nextInt();
			sInput.nextLine();

			if (n == 1) // 1 for Adding new students
			{
				addStudents();

			} else if (n == 2) // 2 for Adding courses
			{
				addCourse();

			} else if (n == 3) // 3 for Looking up students by name
			{
				lookUpByName();
			} else if (n == 4) // 4 for Looking up students by ID
			{
				lookUpById();
			} else if (n == 5) // 5 for Looking at courses
			{
				lookUpByCourseCode();
			} else if (n == 6) // 6 for display student details
			{
				displayStudents();
			} else if (n == 7) // 7 for display course details
			{
				displayCourses();
			} 
			else if (n == 8) // 8 for enroll student to course
			{
				enrolStudentToCourse();
			} 
			else if (n == 9) // 9 for updating the grade once course completed
			{
				courseCompleted();
			} 
			else if (n == 10) // 10 for viewGrades of completion 
			{
				viewGrades();
			} 
			else if (n==11)  // 11 for withdrawal from Course
			{
				withdrawFromCourse();
			}
			
			else if (n == 30) // 30 to Quit
			{
				entryFlag = false;
			} else {
				System.out.println("Invalied input......");
			}

		}

	}

	//Students by name
	public void addStudents() {
		System.out.println("Enter the name of student");
		String name = sInput.nextLine();
		StudentGB std = new StudentGB(UN_SID++, name);
		students.put(std.getsID(), std);
	}
	
	public void  lookUpByName() {
		System.out.println("Enter the student name");
		String name = sInput.nextLine();
		StudentGB student = null;
		Iterator<StudentGB> stdItr = students.values().iterator();
		while(stdItr.hasNext()) {
			StudentGB std = stdItr.next();
			if(std.getsName().equals(name)) {
				student = std;
				break;
			}
		}
		if(student != null) {
			System.out.println(student);
		} else {
			System.out.println("No student found for the given name");
		}
	}
	
	public StudentGB lookUpById() {
		System.out.println("Enter the student id");
		Long id = sInput.nextLong();
		StudentGB student = null;
		if(students.containsKey(id)) {
			 student = students.get(id);
			System.out.println(student);
			return student;
		} else {
			System.out.println("No student found for the given id");
		}
		return student;
	}
	
	public void lookUpByCourseCode() {
		System.out.println("Enter the course code");
		String code = sInput.nextLine();
		
		if(courses.containsKey(code)) {
			System.out.println(students.get(code));
		} else {
			System.out.println("No course found for the given code");
		}
	}
	
	
	public void addCourse() {
		System.out.println("Enter the course code and name");
		String cCode = sInput.nextLine();
		String cName = sInput.nextLine();
		String grade=null;// = sInput.nextLine();
		courses.put(cCode, new Course(cCode, cName, grade));

	}
    // check this            ???
	public void enrolStudentToCourse()  // enroll student to the a course and print 
	{
		// get course code and validate it
		System.out.println("Enter the course Code");
		String cCode = sInput.nextLine();
		if (!courses.containsKey(cCode))
			return;

		// get student id and validate it
		System.out.println("Enter the Student id");
		int sID = sInput.nextInt();
		if (!students.containsKey(sID))
			return;

		// lookup the course and the student
		Course c = courses.get(cCode);
		StudentGB s = students.get(sID);
		
		// assign course to student
		s.addCourse(c);
		System.out.println(s);

	}
	
	
	
	 
	// update grade once course is completed in completed list and remove from enroll list
	public void courseCompleted()
	{
		StudentGB student = lookUpById(); // validate existence of student in student hashmap
		if(student != null) {
			// get course code and validate it
			System.out.println("Enter the course Code");
			String cCode = sInput.nextLine();
			if (!courses.containsKey(cCode))
				return;
			
			// check the student is enrolled in the course or not
			for(Course course: student.getEnrolled()) 
				{
					if(course.getCode().equals(cCode))
					{    // how to get student id to remove from enroll list   ??						
						System.out.println("Enter the grade");
						String grade = sInput.nextLine();
						student.updateGrade(course, grade);
						System.out.println(student);
					}
				}			
			}
		}
		
	public void withdrawFromCourse()
	{
		// validate existence of student in student hashmap
		StudentGB student = lookUpById(); 
		if(student == null) return;
		
		// get course code and validate it
		System.out.println("Enter the course Code");
		String cCode = sInput.nextLine();
		if (!courses.containsKey(cCode))
			return;
		
		// check the student is enrolled in the course or not
		for(Course course: student.getEnrolled()) 
			{
				if(course.getCode().equals(cCode))
				{
					student.withdrawCourse(course);
				}
	
			}
	}
	
	//The grades the student received in all courses they have completed
			public void viewGrades() {
			StudentGB student = lookUpById();
			if(student != null) {
				for(Course course : student.getCompleted()) { // get completed(its type of course class) list and updated by updateGrade()
					System.out.println("Course Name: " + course.getName() + "  "+ "Course Grade: " + course.getGrade());
				}
			}
		}
		
	
	
	
	public void displayStudents() {
		for (Long c : students.keySet()) { // get key from hashMap list
			System.out.println("student id " + c + " name is  " + students.get(c).getsName()); // get value at c

		}

	}

	public void displayCourses() {
		// print course details
		for (String c : courses.keySet()) { // get key from hashMap list
			System.out.println("course code " + c + " course name is  " + courses.get(c)); // get value at c

		}

	}

	
	private void displayEnrollStudentInCourse()
	{
		
		
	}
	
	
	
	public static void main(String[] arg) {
		new EntryPointMapGB();

	}
	

}

// Student s= new Student(unID++,"Kiran");
// add students to hashmaps
// students(sID,sName)
/*
 * students.put(unSID++, "Kiran"); students.put(unSID++, "Dharani");
 * students.put(unSID++, "Chinmayi");
 */
// add courses
// courses.put(cCode, cName)
/*
 * courses.put("SWEN501", "Professional Programming Skills");
 * courses.put("SWEN502", "Software Development Studio I");
 * courses.put("SWEN503", "Software Development Studio II");
 */
/*
 * // print student details for (Integer c : students.keySet()) { // get key
 * from hashMap list System.out.println("The value of letter " + c + " is  " +
 * students.get(c)); // get value at c
 * 
 * }
 * 
 * // print course details for (String c : courses.keySet()) { // get key from
 * hashMap list System.out.println("The value of letter " + c + " is  " +
 * courses.get(c)); // get value at c
 * 
 * }
 */

