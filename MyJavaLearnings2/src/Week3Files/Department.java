package Week3Files;

import java.util.ArrayList;

import ecs100.UI;

public class Department {
		ArrayList<CourseICT> coursesDepartment = new ArrayList<CourseICT>();
		//add a Department class that holds all the courses a department teaches
		private String name;
		private int id;
		
		public Department(String name, int id) {
			this.setName(name);
			this.setId(id);
		}
		
		public void addDeptCourses(CourseICT cIct)
		{
				this.coursesDepartment.add(cIct);		
		}
		public void addDeptCourses(Department deptIct)
		{
				for (CourseICT c: coursesDepartment)
				{
					UI.println(c.getName()+" " +c.getId()+" "+ c.getPoints()+" "+ c.getRCost());
				}
		}
		// ----------
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		// ----------
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}



}
