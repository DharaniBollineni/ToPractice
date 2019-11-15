package inheritanceSelfLearningJava;

public class EMP {

	//variable
	int empID;
	String empName;
	Address address;
	
	// constructor
	EMP(int empID, String empName, Address address)
	{
		this.empID=empID;
		this.empName=empName;
		this.address=address;
	}
	
	void display()
	{
		System.out.println(empID+" "+empName);
		System.out.println(address.street+" "+address.city+" "+address.country);
	}
	public static void main(String[] args) {
		Address a1= new Address("K.N.Colony","chittoor","India");
		Address a2= new Address("Jurga Nagar Colony","Chittoor","India");	
		
		EMP e1=new EMP(100,"Dharani",a1);
		EMP e2=new EMP(101,"Chinmayi",a2);
		
		e1.display();
		e2.display();
		
	}
}
