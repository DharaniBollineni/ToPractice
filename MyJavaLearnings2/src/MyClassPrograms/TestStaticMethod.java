package MyClassPrograms;

//Test class to create and display the values of object
public class TestStaticMethod {
	
	int a=0;            //non static 
	
	
	public static void main(String args[]) {
		StudentStatic.change();// calling change method
		// creating objects
		Student s1 = new Student(111, "Karan");
		Student s2 = new Student(222, "Aryan");
		Student s3 = new Student(333, "Sonoo");
		// calling display method
		s1.display();            //------------> not printing any static variable Check itttttttttt
		s2.display();
		s3.display();
		
		/*//this and super cannot be used in static context.
		System.out.println(this.a); 
		System.out.println(super a); */
		
		//System.out.println(a); // The static method can not use non static data member or call non-static method directly.
	}
}