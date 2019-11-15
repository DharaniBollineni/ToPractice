package nz.ac.currency.convert;

import ecs100.UI;

public class WhileLoop {
	public WhileLoop()
	{
		UI.initialise();
		UI.addButton("Start ineration", this::startIneration);		
	}
public void startIneration() {
		
	String sentence = "Hi";	
	String name= UI.askString(" User name please ");
	while(!name.equals("stop"))
	{
		sentence = sentence +" "+ name;	
		UI.println(sentence);
		name= UI.askString(" User name please");		
	}
 }	
			
public static void main(String[] args) {
		// TODO Auto-generated method stub
			new WhileLoop();
	}

}



//note
//string names=UI.askString();
//while(!names.endWith("stop");
//UI.println("Hi", + name);
// names=names+"and"+UI.askString();
