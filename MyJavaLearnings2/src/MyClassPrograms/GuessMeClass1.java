package MyClassPrograms;

public class GuessMeClass1 {

	//Class variable where all the objects will share this one 
	static long counterNumber=0;
	
	// local variable declaration
	int localValue;
	
	// Parameterized Constructor
	GuessMeClass1(int value)
	{
		this.localValue=value;
	}
	
	//Method to check and return true or false
	boolean guessMeMethodClass1(int guessValue)
	{
		counterNumber++;
		return localValue==guessValue;
		
	}
	
	
}
