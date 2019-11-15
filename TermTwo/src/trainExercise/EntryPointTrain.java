package trainExercise;

public class EntryPointTrain {

	
	public EntryPointTrain()
	{
		// create object for Train 
		Train<String> express = new Train<String>();
		//Q value, Wagon<Q> next;
		Wagon<String> w4 = new Wagon<String>("green",null);
		Wagon<String> w3 = new Wagon<String>("White",null);
		Wagon<String> w2 = new Wagon<String>("Yellow",null);
		Wagon<String> w1 = new Wagon<String>("Blue",null);
		
		
		express.prepend(w4);
		express.prepend(w3);
		express.prepend(w2);
		express.prepend(w1);
		
		express.printTrain();
	}
		
	public static void main(String[] args) {
		new EntryPointTrain();

	}

}
