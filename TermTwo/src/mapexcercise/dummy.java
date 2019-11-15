package mapexcercise;

public class dummy {

	public dummy() {
		// TODO Auto-generated constructor stub
	}

}
import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TestInterface {
	static String course;
	static String grade;
	static String name;
	static ArrayList<Student> students = new ArrayList<Student>();
	static ArrayList<Course> courses = new ArrayList<Course>();
	static Scanner scan = new Scanner(System.in);
	
	// This scans the data provided as a text file
	public void scanData() throws FileNotFoundException {
		Scanner sc = new Scanner(new File("data.txt"));
		while (sc.hasNext()) {
			course = sc.next();
			grade = sc.next();
			name = sc.nextLine();
			String[] fname = name.split(" ", 2);
			String fname0 = fname[0];
			String fname1 = fname[1];
			name = fname[1];
			boolean added = false;

			for (int i = 0; i < students.size(); i++) {
				if (students.get(i).getName().equals(name)) {
					added = true;
				}
			}

			if (added == false) {
				Student newStudent = new Student(name, Student.getUniqueIdCounter());
				newStudent.setGrade(course, grade);
				students.add(newStudent);
				Course newCourse = new Course (course);
				courses.add(newCourse);
			} else {
				for (int i = 0; i < students.size(); i++) {
					if (students.get(i).getName().equals(name)) {
						students.get(i).setGrade(course, grade);
					}
				}
			}

		}
	}

	// This will search the system using a student name
	public static void searchStudent(String studentName) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName().contains(studentName)) {
				System.out.println(students.get(i).getName() + " \n" + students.get(i).toString());
			}
		}
	}

	// This will search the system using a student ID
	public static void searchID(int id) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getUniqueId() == id) {
				System.out.println(students.get(i).getName() + " \n" + students.get(i).toString());
			}
		}
	}

	// This will search students enrolled in a course
	private static void searchCourse(String ct) {

		ArrayList<Student> studentsInThisCourse = new ArrayList<Student>();
		ArrayList<Student> studentsWithGrades = new ArrayList<Student>();
		ArrayList<Student> studentsNoGrades = new ArrayList<Student>();
		
		System.out.println("These are the students enrolled in this course:\n");
		for (Student s : students) {
			if (s.getStudentDetails().containsKey(ct)) {
				studentsInThisCourse.add(s);
				System.out.println(s.getName());

				if (s.getStudentDetails().containsValue("-")) {
					studentsNoGrades.add(s);
				} else {
					studentsWithGrades.add(s);
				}
			}

		}
		System.out.println("\nNumber of students in this course: " + studentsInThisCourse.size());
		System.out.println("\nDo you want to see the grades of those who have completed this course?");
		String ans = scan.next();
		if (ans.equalsIgnoreCase("yes")) {
			System.out.println("\nThese are the grades of those who have completed the course: \n");
			for (Student s : studentsWithGrades) {
				System.out.println(s.getUniqueId() + ": " + s.getGrade());
			}
		}

	}

	// This will add a student to a course
	private void enrollStudent(String sn) {
		for (Student s : students) {
			if (s.getName().contains(sn)) {
				System.out.println("Enter Course Title:");
				String newCourse = scan.next();
				s.getStudentDetails().put(newCourse, "-");
				System.out.println("Enrollment successful.\n" + s.getName() + " is now added to " + newCourse
						+ " class\nUpdated course list:\n" + s.getStudentDetails());

			}
		}

	}

	// This is the program's Home Page
	public void MainPage() throws FileNotFoundException {
		scanData();
		System.out.println("Please choose from the selection\n "
				+ "A. Look up student by name\n B. Look up student by ID\n " + "C. Look up students by course"
				+ "\n D. Enroll a student" + "\n E. Add a student into the system");
		String option = scan.next();
		if (option.equalsIgnoreCase("A")) {
			System.out.println("Please Enter the Student's Name:");
			String sn = scan.next();
			sn = sn + scan.nextLine();
			searchStudent(sn);
			System.out.println();

		}
		if (option.equalsIgnoreCase("B")) {
			System.out.println("Please Enter the Student's ID:");
			int id = scan.nextInt();
			searchID(id);
		}
		if (option.equalsIgnoreCase("C")) {
			System.out.println("Please Enter the Course title:");
			String ct = scan.next();
			searchCourse(ct);

		}
		if (option.equalsIgnoreCase("D")) {
			System.out.println("Enter the students name:");
			String sn = scan.next();
			sn = sn + scan.nextLine();
			enrollStudent(sn);

		}
		if (option.equalsIgnoreCase("E")) {
			System.out.println("Enter new student's name: ");
			String n = scan.next();
			n = n + scan.nextLine();
			Student newStudent = new Student(n, Student.getUniqueIdCounter());
			students.add(newStudent);
			System.out.println(newStudent.getName() + " has been added to the system\n" + "Student ID: "
					+ newStudent.getUniqueId());
		}

		System.out.println("\nType 1 to go back to the Main Page");
		int ans = scan.nextInt();
		returnToMainPage(ans);
	}

	// This method will redirect user back to the Home Page
	private void returnToMainPage(int ans) throws FileNotFoundException {

		if (ans == 1) {
			MainPage();
		}

	}
	
	

	public static void main(String[] args) throws FileNotFoundException {
		TestInterface studentManager = new TestInterface();
		studentManager.MainPage();
	}
}

