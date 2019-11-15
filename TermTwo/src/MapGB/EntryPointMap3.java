package MapGB;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import mapexcercise.Course;
import mapexcercise.Student;


public class EntryPointMap3 {
	static long UN_SID = 1;
	public String fileName = "data.txt";
	//public String[] req;
	static String course;
	static String grade;
	static String name;
	Map<Long, StudentGB> students = new HashMap<Long, StudentGB>();
	Map<String, Course> courses = new HashMap<String, Course>();
//	Map<String, Student> studentsByName = new HashMap<String, Student>();
//	Map<Integer, Student> studentsByID = new HashMap<Integer, Student>();
//	Map<String, Student> courseByCode = new HashMap<String, Student>(); // ---> student under a course
	Scanner sInput = new Scanner(System.in); // Create a Scanner object

	public EntryPointMap3() throws FileNotFoundException {

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
				//--> addStudents
				//--> addCourse
				//--> enrolled
				//--> updateGradeOfCourse
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
		Scanner sc = new Scanner(new File("lib/data.txt"));
		while (sc.hasNext()) {
			course = sc.next();
			grade = sc.next();
			name = sc.nextLine();
			name.trim();
			boolean addFlag= false;
			// //--> addStudents to map
			//long k =UN_SID++;
			if(!students.containsKey(name))   // checks for existence of student by name   //??? if student is has 
			{
				addFlag=true;
				
			}
			if(addFlag==false) //else
			{
				StudentGB newStd = new StudentGB(UN_SID++, name);
				students.put(newStd.getsID(), newStd);
				newStd.
				// Adding unique course to courses map
				if(!courses.containsKey(course))
				{
					Course newCourse = new Course (course, course);
					courses.put(course, newCourse);
				}
				Course oldCourse= courses.get(course);
				
				//enrolment 
				// grads
			}
			else
			{
				
				
			}
			
			
			
			// //--> enrolled
			StudentGB s = students.get(name);
			//course grade name
			// identify course and identify student
			//Student s = studentsByID.get(k);
//			if(studentsByName.containsKey(name)) //???
//			{
				Student s = studentsByName.get(name);
				Course c = courses.get(course);
				s.addCourse(c); // add course to student
				c.addStudentInCourses(s); // add student to course
//			}
			
			
			//updateGradeOfCourse
			 // if grade is - skip 
			 // otherwise update 
			if(grade!="-")
			{
				System.out.println("Test1");
				if(studentsByName.containsKey(name)) //???
				{
					System.out.println("Test2");
					Student s1 = studentsByName.get(name);
					Course c1 = courses.get(course);
					s1.updateGrade(c1, grade); //update grade and setFinishedCourse , remove course for that student
					c1.setCourseGrade(s1, grade);//put(s, grade); // update CourseGrade map in course and remove student from that course
					//enrolledStudent.remove(s);
				}
			}
			
			
			
			
//		String fileName = "data.txt";		
//		Scanner scanner = new Scanner(fileName);
//		while (scanner.hasNextLine()) {
//		    String line = scanner.nextLine();
//		    req= line.split(" ");
		}
//		scanner.close();
	
		sc.close();
		
	}
		
	
	public static void main(String[] arg) throws FileNotFoundException {
		new EntryPointMap3();

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
