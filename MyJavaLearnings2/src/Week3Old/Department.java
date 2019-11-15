package Week3Old;

import java.util.ArrayList;
import java.util.List;

public class Department {
	ArrayList<Course> courses = new ArrayList<Course>();
	//add a Department class that holds all the courses a department teaches
	
	public void addCourses(Course c)
	{
			this.courses.add(c);		
	}
	public void diaplyCourses()
	{
			for (Course c: courses)
			{
				System.out.println(c.getName()+" " +c.getId()+" "+ c.getPoints()+" "+ c.getRCost());
			}
	}

}
