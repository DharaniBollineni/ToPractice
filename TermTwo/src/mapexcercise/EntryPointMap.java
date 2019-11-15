package mapexcercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class EntryPointMap {
	static int unSID = 1;
	public String fileName = "data.txt";
	public String[] req;
	Map<Integer, String> students = new HashMap<Integer, String>();
	Map<String, Course> courses = new HashMap<String, Course>();
	Map<String, Student> studentsByName = new HashMap<String, Student>();
	Map<Integer, Student> studentsByID = new HashMap<Integer, Student>();
	Map<String, Student> courseByCode = new HashMap<String, Student>(); // ---> student under a course
	Scanner sInput = new Scanner(System.in); // Create a Scanner object

	public EntryPointMap() throws FileNotFoundException {

		boolean entryFlag = true;
		// User interface
		while (entryFlag) {
			System.out.println("Enter ");
			System.out.println(" 0 for load file");
			System.out.println("1 for Adding new students");
			System.out.println("2 for Adding courses");
			System.out.println("3 for lookup students by name");
			System.out.println("4 for lookup students by ID");
			System.out.println("5 for Lookup courses");
			System.out.println("6 for display student details");
			System.out.println("7 for displaying course details");
			System.out.println("8 Enroll Student");
			System.out.println("9 for updating the grade of studtent for a course");
			System.out.println("10 for display course without grade");
			System.out.println("11 withdrawal from the course");			
			System.out.println("30 to Quit");
			int n = sInput.nextInt();
			sInput.nextLine();
			if(n==0)
			{ 
				loadFile();
			}			

			else if (n == 1) // 1 for Adding new students
			{
				addStudents();

			} else if (n == 2) // 2 for Adding courses
			{
				addCourse();

			} else if (n == 3) // 3 for lookup students by name
			{
				searchStudentsByName();
			} else if (n == 4) // 4 for lookup students by ID
			{
				searchStudentsByID();
			} else if (n == 5) // 5 for Lookup by course
			{
				searchCourseByCode();
			} else if (n == 6) // 6 for display student details
			{
				displayStudents();
			} else if (n == 7) // 7 for display course details
			{
				displayCourses();
			} else if (n == 8) // 8 for enroll student to course
			{
				enrollStudentToCourse();
			} 
			else if(n==9) // update grade 
			{
				updateGradeOfCourse();
			}
			else if(n==10) // display course without grade
			{
				displayEnrolledInCourseWithNoGrade();
			}
			else if (n == 30) // 30 to Quit
			{
				entryFlag = false;
			} else {
				System.out.println("Invalied input......");
			}
			}
	}

	private void loadFile() throws FileNotFoundException
	{
		String fileName = "data.txt";
		
		Scanner scanner = new Scanner(fileName);
		while (scanner.hasNextLine()) {
		    String line = scanner.nextLine();
		    req= line.split(" ");
		}
		scanner.close();
	}
	public void addStudents() {
		System.out.println("Enter the name of student");
		String name = sInput.nextLine();
		if(studentsByName.containsKey(name))
			return;
		int k =unSID;
		students.put(unSID++, name);
		// add elements to map by name as key
		
		Student s = new Student(k, students.get(k));
		studentsByName.put(name, s);
		
		//// add elements to map by id as key
		studentsByID.put(k, s);
	}

	public void addCourse() {
		System.out.println("Enter the course code and name");
		String cCode = sInput.nextLine();
		String cName = sInput.nextLine();
		//String grade = null;// = sInput.nextLine();
		courses.put(cCode, new Course(cCode, cName));

	}

	public void displayStudents() {
		for (Integer c : students.keySet()) { // get key from hashMap list
			System.out.println("student id " + c + " name is  " + students.get(c)); // get value at c

		}

	}

	public void displayCourses() {
		// print course details
		for (String c : courses.keySet()) { // get key from hashMap list
			System.out.println("course code " + c + " course name is  " + courses.get(c)); // get value at c

		}

	}

	public void searchStudentsByName() {
		// add student detail with key name
//		for (Integer k : students.keySet()) {
//			Student s = new Student(k, students.get(k));
//			studentsByName.put(students.get(k), s);
//		}

		// print studentsByName details
		for (String c : studentsByName.keySet()) { // get key from hashMap list
			System.out.println("The value of letter " + c + " is  " + studentsByName.get(c)); // get value at c

		}
		System.out.println("Enter the student name");
		String name = sInput.nextLine();

		// lookup students by name
		boolean flag = studentsByName.containsKey(name);
		if (flag == true) {
			Student s = studentsByName.get(name);
			System.out.println("student by name " + s.getsName() + " is available");
		} else {
			System.out.println("Student is not avialable " + name);
		}

	}

	public void searchStudentsByID() {
		// Map<Integer, Student> studentsByID = new HashMap<Integer, Student>();
		// add student detail with key id to map studentsByID

//		if (studentsByID.isEmpty()) {
//			createStudentsByID();
//		}
		// lookup students by ID
		System.out.println("Enter the student ID");
		int sId = sInput.nextInt();
		boolean IdFlag = studentsByID.containsKey(sId);
		if (IdFlag == true) {
			Student s = studentsByID.get(sId);
			System.out.println("student by Id " + s.getsID() + " is available");
		} else {
			System.out.println("Student is not avialable" + sId);
		}
	}

//	private void createStudentsByID() {
//		for (Integer c : students.keySet()) {
//			Student s = new Student(c, students.get(c));
//			studentsByID.put(c, s);
//		}

//	}

	public void searchCourseByCode() {
		// How many students are in the course
		// add student detail to course
		System.out.println("Enter the course Code");
		String cCourse = sInput.nextLine();
		boolean courseFlag = courses.containsKey(cCourse);
		if (courseFlag == true) {
			Course c = courses.get(cCourse);
			System.out.println(c.getCode() + " course is available ");
		} else {
			System.out.println(" course is not available ");
		}
	}

	public void enrollStudentToCourse() {
		System.out.println("Enter the course Code");
		String cCourse = sInput.nextLine();
		boolean courseFlag = courses.containsKey(cCourse);
		if (courseFlag == true) {
			Course c = courses.get(cCourse);
			System.out.println(c.getCode() + " course is available ");
			System.out.println("Enter the Student id");
			int sID = sInput.nextInt();
			boolean IdFlag = studentsByID.containsKey(sID);
			if (IdFlag == true) {
//				if (studentsByID.isEmpty()) {
//					createStudentsByID();
//				}
				Student s = studentsByID.get(sID);
				System.out.println("student by Id " + s.getsID() + " is available");
				// to support directional access
				s.addCourse(c); // add course to student
				c.addStudentInCourses(s); // add student to course
				System.out.println(s);

			} else {
				System.out.println("Student is not avialable" + sID);
			}

		} else {
			System.out.println("course is not available" + cCourse);
		}
	}

	public void updateGradeOfCourse()
	{
		// validate existence of student in student hashmap
		System.out.println("Enter the Student id");
		int id = sInput.nextInt();
		sInput.nextLine();
		if (!students.containsKey(id)&&!studentsByID.containsKey(id)) 
			return;
		// get course code and validate it
		System.out.println("Enter the course Code");
		String cCode = sInput.nextLine();
		if (!courses.containsKey(cCode))
			return;
		Student s = studentsByID.get(id);  // is valid student
		// check the student is enrolled in the course or not
		for (Course c : s.getEnrolled()) {
			if (c.getCode().equals(cCode)) {
				System.out.println("Enter the grade");
				String grade = sInput.nextLine();
				s.updateGrade(c, grade);  // update in student
				c.updateCourseWithGrade(s, grade);
				//c.setCourseGrade(s, grade);//put(s, grade); 
				
		}
		}
		
		
	}
	// Unenroll a student from a course
	public void withDrawFromACourse()
	{
		// validate existence of student in student hashmap
				System.out.println("Enter the Student id");
				int id = sInput.nextInt();
				sInput.nextLine();
				if (!students.containsKey(id)&&!studentsByID.containsKey(id)) 
					return;
				// get course code and validate it
				System.out.println("Enter the course Code");
				String cCode = sInput.nextLine();
				if (!courses.containsKey(cCode))
					return;
				Student s = studentsByID.get(id);  // is valid student
				Course c= courses.get(cCode);  // find in the map courses
				s.removeCourse(c); // remove course from a student
				c.removeStudent(s);// remove student from a course
				
		
	}
	//A list of all courses the student is currently enrolled in (those which do not yet have grades)
	public void displayEnrolledInCourseWithNoGrade()
	{
		System.out.println("Enter the Student id");
		int id = sInput.nextInt();
		sInput.nextLine();
		if (!studentsByID.containsKey(id)) 
			return;
		Student s = studentsByID.get(id);
		for (Course c : s.getEnrolled()) {
				System.out.println(c);
			
			
		}		
	}
	
	
	// All students currently enrolled in the course
	
	
	
	
//	public void courseCompleted() {
//		// validate existence of student in student hashmap
//
//				System.out.println("Enter the Student id");
//				int id = sInput.nextInt();
//				if (!students.containsKey(id))
//					return;
//				Student s = studentsByID.get(id);
//				System.out.println(s);
//				// get course code and validate it
//				System.out.println("Enter the course Code");
//				String cCode = sInput.nextLine();
//				if (!courses.containsKey(cCode))
//					return;
//				// check the student is enrolled in the course or not
//				for (Course course : s.getEnrolled()) {
////					if (course.getCode().equals(cCode)) {
////						System.out.println("Enter the grade");
////						String grade = sInput.nextLine();
////						s.updateGrade(course, grade);
////						System.out.println(s);
////					}
//				}
//		}

	private void displayEnrollStudentInCourse() {

	}

	private void withdrawFromACourse() {
		System.out.println("Enter the course Code");
		String cCourse = sInput.nextLine();
		boolean courseFlag = courses.containsKey(cCourse);
		if (courseFlag == true) {
			Course c = courses.get(cCourse);
			System.out.println(c.getCode() + " course is available ");
			System.out.println("Enter the Student id");
			int sID = sInput.nextInt();
			boolean IdFlag = studentsByID.containsKey(sID);
			if (IdFlag == true) {
				Student s = studentsByID.get(sID);
				// withdraw from course --> code ???

			} else {
				System.out.println("Student is not avialable" + sID);
			}

		} else {
			System.out.println("course is not available" + cCourse);
		}
	}

	private void updateGrade() {

	}

	public static void main(String[] arg) throws FileNotFoundException {
		new EntryPointMap();

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
