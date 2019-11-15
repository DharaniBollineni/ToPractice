package nz.ac.currency.convert;

import ecs100.*; // import jar files

public class Communication {
	public Communication() { // Constructor declaration to setup interface
		UI.initialise();
		UI.addButton("Start ineration", this::startIneration);		
		UI.addButton("End ineration", this::endIneration);
	}
	
	public void startIneration() {
		
		String ques= UI.askString(" Hello how can i help you");
		UI.println(ques); // or UI.printf(ques);
	}
	
	public void endIneration() {
		UI.quit();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Communication();
	}

}

