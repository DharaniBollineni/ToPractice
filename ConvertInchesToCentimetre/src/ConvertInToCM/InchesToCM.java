package ConvertInToCM;							// package creation
/** program to convert inches to centimeter */
import ecs100.*;								// import jar files

public class InchesToCM {						// class declaration 
	public InchesToCM() {						// Constructor declaration to setup interface
		UI.initialise();
		UI.addButton("In to CM", this::inToCM);
		UI.addButton("Formula", this::printFormula);		
	}
	public void inToCM()						// Method declaration to convert inches to CM
	{ double inches= UI.askDouble("Enter inches");
	  double cm= inches/0.39370;
	  UI.println("Given inches is " + inches + " converted to centimeters " + cm );
	}
    public void printFormula() {			   // Method declaration to print used formula
    	//UI.println("centimeter= inches/0.39370");
    	String formula;
    	formula = "centimeter= inches/0.39370";
    	UI.println(formula);
    }
	public static void main(String[] args) {   // main method declaration
		// TODO Auto-generated method stub
		new InchesToCM();   				   // create object and call constructor
	}

}
