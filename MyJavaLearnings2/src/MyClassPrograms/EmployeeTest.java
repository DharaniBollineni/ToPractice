package MyClassPrograms;

public class EmployeeTest {

	public static void main(String[] args) {
		// create objects 
		EmpBasic emp1=new EmpBasic("Chinmayi");
		EmpBasic emp2=new EmpBasic("Kiran");
		
		// emp1 details
		emp1.empAge(22);
		emp1.empDesig("MBBS");
		emp1.empSalary(22000.1);
		emp1.displayDetails();
		
		// emp2 details
		emp2.empAge(22);
		emp2.empDesig("software Engineer");
		emp2.empSalary(2200);
		emp2.displayDetails();

		
		
	}

}
