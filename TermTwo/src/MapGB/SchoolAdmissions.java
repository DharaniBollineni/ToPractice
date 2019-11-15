package MapGB;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SchoolAdmissions {

	private Map<String, StudentGB> students = new HashMap<>();
	private Map<String, List<StudentGB>> courseMap = new HashMap<>();
	static long UN_SID = 10000;
	public SchoolAdmissions() throws FileNotFoundException {
		
	}
	
	public void displayUserInteface() throws FileNotFoundException {
		boolean entryFlag = true;
		// User interface
		Scanner sInput = new Scanner(System.in);
		while (entryFlag) {

			System.out.println("Enter 1 :: load file");
			System.out.println("Enter 2 :: add new student");
			System.out.println("Enter 3 :: add new course");
			System.out.println("Enter 4 :: Enroll a student into a course");
			System.out.println("Enter 5 :: Assign a grade to a student in a course");
			System.out.println("Enter 6 :: Unenroll a student from a course");
			System.out.println("Enter 7 :: Display all current enrolled students");
			System.out.println("Enter 8 :: Display all courses");
			System.out.println("Enter 9 :: The grades the student received in all courses they have completed");
			System.out.println("Enter 10 :: A list of all courses the student is currently - no grade");
			System.out.println("Enter 11 :: How many students are in the course");
			System.out.println("Enter 12 :: All students currently enrolled in the course");
			System.out.println("Enter 13 :: The grades given to all students who have completed the course");
			System.out.println("Enter 14 :: Looking up students by name");
			System.out.println("Enter 15 :: Looking up students by ID");
			System.out.println("Enter 100 to Quit");
			int n = sInput.nextInt();
			sInput.nextLine();
			if(n == 1) {
				loadFile();
				mapStudentToCourse();
			} else if (n == 2) {
				
			} else if(n == 3) {
				addCourse();
			} else if(n == 4) {
				enrollStudent();
			}
		}
	}
	public StudentGB  lookUpById(long id) {
		StudentGB student = null;
		Iterator<StudentGB> stdItr = students.values().iterator();
		while(stdItr.hasNext()) {
			StudentGB std = stdItr.next();
			if(std.getsName().equals(id)) {
				student = std;
				return std;
			}
		}
//		
		return null;
	}
		
	private void enrollStudent() {
		System.out.println("Enter the Course name");
		Scanner sInput = new Scanner(System.in);
		String code = sInput.nextLine();
		if (!courseMap.containsKey(code)) {
			System.out.println("Course is not available");
			return;
		}
		System.out.println("Enter the Student ID");
		long id = sInput.nextLong();
		sInput.nextLine();
		StudentGB std = lookUpById(id);		
		if(std == null) {
			System.out.println("No student found for the given name");
			return;
		} 
		std.getEnrolled().add(new Course(code, code));
		courseMap.get(code).add(std);
		
	}
	
	private void countEnrolled() {
		int  count = 0;
		String courseCode = "xyz";
		for(StudentGB std : courseMap.get("xyz")) {
			for(Course course: std.getEnrolled()) {
				if(courseCode.equals(course.getCode())) {
					count += std.getEnrolled().size();
					System.out.println(std.getsName());
				}
			}
		}
		System.out.println("Number of students enrolled: " + count);
		
	}
	
	private void countCompleted() {
		int  count = 0;
		String courseCode = "xyz";
		for(StudentGB std : courseMap.get(courseCode)) {
			for(Course course: std.getEnrolled()) {
				if(courseCode.equals(course.getCode())) {
					count += std.getCompleted().size();
					System.out.println(std.getsName());
				}
			}
		}
		System.out.println("Number of students completed: " + count);
	}
	
	private void assignGrade() {
		long id = 202l;
		String code = "";
		String grade = "";
		
		StudentGB std = lookUpById(id);
		Iterator<Course> courseItr = std.getEnrolled().iterator();
		Course course = null;
		while(courseItr.hasNext()) {
			course = courseItr.next();
			if(code.equals(course.getCode()) ) {
				courseItr.remove();
				break;
			}
		}
		
		std.getCompleted().add(course);
		course.setGrade(grade);
	}

	private void addCourse() {
		System.out.println("Enter the Course name");
		Scanner sInput = new Scanner(System.in);
		String name = sInput.nextLine();
		if (!courseMap.containsKey(name)) {
			courseMap.put(name, new ArrayList<>());
		} else {
			System.out.println("That Course already existed");
		}
	}

	private void loadFile() throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File("lib/data.txt"));
		while (sc.hasNextLine()) {
			String course = sc.next().trim();
			String grade = sc.next().trim();
			String name = sc.nextLine().trim();
			
			if(students.containsKey(name)) {
				StudentGB stnd = students.get(name);
				setCourses(stnd, course, grade);
			} else {
				StudentGB stnd = new StudentGB(UN_SID++, name);
				setCourses(stnd, course, grade);
				students.put(stnd.getsName(), stnd);
			}
		}
	}
	
	private void setCourses(StudentGB stnd, String course, String grade) {
		if("-".equals(grade)) {
			stnd.getEnrolled().add(new Course(course,course, null));
		} else {
			stnd.getCompleted().add(new Course(course,course, grade));
		}
	}
	
	
	
	public void mapStudentToCourse() {
		
		for(StudentGB stnd : students.values()) {
			List<Course> courseList = stnd.getEnrolled();
			courseList.addAll(stnd.getCompleted());
			for(Course course : courseList) {
				if(courseMap.containsKey(course.getCode())) {
					List<StudentGB> list = courseMap.get(course.getCode());
					list.add(stnd);
				} else {
					List<StudentGB> list = new ArrayList<>();
					list.add(stnd);
					courseMap.put(course.getCode(), list);
				}
			}
		}
		// Display the course count
		for(String key: courseMap.keySet()) {
			System.out.println("Course: " + key + " Number of students: " + courseMap.get(key).size());
		}
		
	}
	public static void main(String[] args) throws FileNotFoundException{
		SchoolAdmissions sa = new SchoolAdmissions();
		sa.displayUserInteface();
	}
 
}
