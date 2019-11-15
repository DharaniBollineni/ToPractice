package Week3Old;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
	ArrayList<Course> courses = new ArrayList<>();
	
	// check same ID
	Student s1 = new Student("John",1,50);     
	Student s2 = new Student("Dharani",1,5);
	/*System.out.println("SName  :: "+s.getName());
	System.out.println("SId  :: "+s.getId());
	System.out.println();*/
	
	
	Course c =new Course("MSDEV","1",15,100);
	courses.add(c);
	//System.out.println("Related to course");
	c.enrolStudent(s1);   // adding to arrayList student
	c.enrolStudent(s2);
	c.displayStudent();
	System.out.println();
	//adding second course
	Course c1=new Course("MSBA","2",20,200);
	courses.add(c1);

	
	Lecturer l =new Lecturer("Ali",2121,15100);
	c.addLecturers(l);
	c.displayLecturersDetails();
	
	
	Department d=new Department();
	d.addCourses(c);
	d.addCourses(c1);
	d.diaplyCourses();
			
	
	//c.profil Calculate profit 
	//Expenditure = 	roomCost+ teaching cost
	//earning = fees of student
	//profit= earning-Expenditure
	
	
	//if using course arraylist use for each
	double expenditure = c.getRCost() + c.getTeachingCosts(); // rCost is part of course
	double earnings= c.getStudentsFees();
	//if (earnings- expenditure)
	double profit=earnings- expenditure;
	
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
