package MyClassPrograms;

public class EmpBasic {
	
	// varaible declarations
	String name;
	int age;
	String designation;
	double salary;
	
	// Constructor
	public EmpBasic(String eName)
	{
		name=eName;// or this.name=eName
	}
	
	public void empAge(int eAge)
	{
		age=eAge;
	}
	public void empDesig(String eDesignation)
	{
		designation=eDesignation;
	}
	public void empSalary(double eSalary) 	{
		salary=eSalary;
	}
		
	public void displayDetails()
	{
		System.out.println("Name ::   		 "+name);
		System.out.println("Age ::    		 "+age);
		System.out.println("designation ::   "+designation);
		System.out.println("salary ::    	 "+salary);
		
	}

	
	
	
	
	
}
