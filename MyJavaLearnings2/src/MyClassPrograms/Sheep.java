package MyClassPrograms;

public class Sheep {

	// constructor declaration           --> 
	// find() to return sheep pen number
	//moveTo() move it to different pin number
	//countAll() static method it don't use non static variable
	
	//Variable declaration 
	private int penNumber;
	private static int totalSheep=0;   // declared static private variable
	
	//
	public Sheep(int n)
	{
		penNumber=n;
		totalSheep++;
	}
	
	public int find()
	{
		return penNumber;
	}
	
	public void moveTo(int differencePen)
	{
		penNumber=differencePen;
		
	}
	
	public static int countAll()
	{
		return totalSheep;
		
	}
	
}
