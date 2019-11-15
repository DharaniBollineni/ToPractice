import java.util.Scanner;

public class MultipleUserDefinedException extends Exception  // Exception is child of throwable, it has getMeddage()
{

	MultipleUserDefinedException (String msg)
	{
		super(msg);
	}
	
	public static void main(String[] args) throws MultipleUserDefinedException 
	{
		Scanner s = new Scanner(System.in);
		try{
			System.out.println("Enter the rno:");
			String empId=s.nextLine();
			if(empId.length()!=4)
			{
				throw new MultipleUserDefinedException("Invalid EmpID"); //4
			}
			System.out.println("empId"+empId);
			
			System.out.println("Enter the bSal:");
			int bSal=s.nextInt();
			if(bSal<5000)
			{
				throw new MultipleUserDefinedException("Invalid bSal"); //4
			}
			System.out.println("bSal"+bSal);
		}
		catch(MultipleUserDefinedException ob)
		{
			System.out.println(ob.getMessage());
		}
		}
}
