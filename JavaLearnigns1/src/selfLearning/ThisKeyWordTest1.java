package selfLearning;

public class ThisKeyWordTest1 {

	int i;
	
	void setValues(int i)  // case 1: if (int x)
	{	// i=x		// case 1: i=x intializes the instance variable with x
		//i=i;    //case 2:  if i=i then msg :: The assignment to variable i has no effect
		this.i=i; // case 3
	}
	void show()
	{
		System.out.println(i);    // case 1: i=x o/p is 10
								  // case 2: i=i o/p is 0 to over come this use this keyword
								  // case 3: o/p is 10 
	}	
}
