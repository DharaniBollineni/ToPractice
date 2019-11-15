package inheritanceSelfLearningJava;

public class Student {
	
	int sID;
	String sName;
	Marks marks;
	//float total;
	
	public Student(int sID,String sName, Marks marks)
	{
		this.sID=sID;
		this.sName=sName;
		this.marks=marks;
		//this.total=total;
	}

	void display()
	{
		System.out.println("Student details:: "+sID+" "+sName);
		System.out.println("Marks are "+marks.m1+" "+marks.m2+" "+marks.m3+" "+" "+marks.m4+" "+" "+marks.m5);
		System.out.println("Total is "+marks.total);
		System.out.println("_________________________________________________________________________________");
	}
	public static void main(String[] args) {
		
		Marks sMarks1=new Marks(30,40,50,60,50);
		Marks sMarks2=new Marks(40,50,60,70,40);
		
		sMarks1.sumMarks();
		sMarks2.sumMarks();		
		
		Student st1= new Student(1,"Chinmayi",sMarks1);
		Student st2= new Student(2,"Dharani",sMarks2);
		
		st1.display();
		st2.display();
		
		
	}

}
