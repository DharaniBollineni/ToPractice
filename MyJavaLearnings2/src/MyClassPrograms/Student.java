package MyClassPrograms;

public class Student {

	int id;
	String name;
	public Student() {		
		System.out.println("Student Id and name in object stu:: "+id+"     "+name);
	}
	
	public Student(int i, String n){
		id=i;
		name=n;		
		System.out.println("Student Id and name in object stu1 :: "+id+"     "+name);		
	}
	
	public void display(int sId, String snNme)
	{
		System.out.println("Student Id and name :: "+sId+"     "+snNme);
	}

	public void display()
	{
		System.out.println("Student Id and name :: "+id+"     "+name);
	}

	public static void main(String[] args) {
		Student stu=new Student();
		Student stu1=new Student(1,"Chinmayi");
		System.out.println("-----------------------------------------");
		System.out.println("add values in object1");
		stu.display(1, "Dharani");
		System.out.println("-----------------------------------------");
		System.out.println("add values in object2");
		stu1.display(1, "ChChinmayi");		// passed but not assigned
		stu1.display();
		System.out.println("-----------------------------------------");		
		System.out.println("change values in object2");
		stu1.name="ChaChinmayi";
		stu1.display(1, stu1.name);
		stu1.display();
		
	}

}
