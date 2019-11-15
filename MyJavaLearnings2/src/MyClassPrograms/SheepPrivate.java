package MyClassPrograms;

public class SheepPrivate {

	// constructor declaration           --> 
	// find() to return sheep pen number
	//moveTo() move it to different pin number
	//countAll() static method it don't use non static variable
	
	//Variable declaration 
	private int penNumber;
	private static int totalSheep=0;   // declared static private variable
	
	// declare constructor 
	public SheepPrivate(int n)
	{
		penNumber=n;
		totalSheep++;
	}
	
	// getter and setter methods
	public int getPenNumber() {
		return penNumber;
	}

	public void setPenNumber(int penNumber) {
		this.penNumber = penNumber;
	}

	// static method declaration
	public static int countAll()
	{
		return totalSheep;
		
	}
	
}
