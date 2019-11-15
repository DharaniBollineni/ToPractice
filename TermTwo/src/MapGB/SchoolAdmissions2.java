package MapGB;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SchoolAdmissions2 {

	private static Map<String, StudentGB> students = new HashMap<>();
	private static Map<String, Course> courseMap = new HashMap<>();
	static long UN_SID = 10000;
	public SchoolAdmissions2() throws FileNotFoundException {
		loadFile();
		mapStudentToCourse();
	}
	
	private static void loadFile() throws FileNotFoundException
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
	
	private static void setCourses(StudentGB stnd, String course, String grade) {
		if("-".equals(grade)) {
			stnd.getEnrolled().add(new Course(course,course, null));
		} else {
			stnd.getCompleted().add(new Course(course,course, grade));
		}
	}
	
	
	
	public static void mapStudentToCourse() {
		Map<String, List<StudentGB>> courseMap = new HashMap<>();
		
		for(StudentGB stnd : students.values()) {
			List<Course> courseList = stnd.getEnrolled();
			courseList.addAll(stnd.getCompleted());
			for(Course course : courseList) {
				List<StudentGB> stdList = courseMap.containsKey(course.getCode()) ? courseMap.get(course.getCode()): new ArrayList<>();
				stdList.add(stnd);
			}
		}
		// Display the course count
		for(String key: courseMap.keySet()) {
			System.out.println("Course: " + key + " Number of students: " + courseMap.get(key).size());
		}
		
	}
	public static void main(String[] args) throws FileNotFoundException{
		new SchoolAdmissions2();
		//loadFile();
	}
 
}
