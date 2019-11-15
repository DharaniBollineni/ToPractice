package WeekTwo;

import ecs100.*;
import java.util.*;
//import java.io.*;

public class NamesProgram {
	
	private ArrayList<String> allNames= new ArrayList<String>();
	public NamesProgram()
	{
		UI.initialise();
		UI.addButton("New",this::newList);
		UI.addTextField("Add", this::addName);
		UI.addButton("List", this::displayList);
		UI.addTextField("Contains", this::doContains);
		UI.addTextField("Remove", this::doRemove);
		UI.addButton("Quit", this::quit);
	}
	
	public void newList()
	{
		this.allNames= new ArrayList<String>(); // same is this.allNames.clear();
		this.displayList();
		
	}	
	public void addName(String name)
	{
		this.allNames.add(name);
		this.displayList();
	}
	public void displayList()
	{
		UI.clearText();
		UI.printf("List has %d names: %n", this.allNames.size());
		for(int i=0; i<this.allNames.size();i++){
			UI.printf("%3d: %s%n",i,this.allNames.get(i));
		}
		UI.printf("------------------------%n");
	}
	
	public void doContains(String name)
	{
		if(this.allNames.contains(name))
		{
			UI.println(name+"is in the list");
		}
		else
		{
			UI.println(name+"is not in the list");
		}
	}
	
	public void doRemove(String name)
	{
		if (this.allNames.remove(name))
		{
			UI.println(name+"was removed");
		}
		else
		{
			UI.println(name+"was not present");
		}
	}
	public void quit()
	{
		UI.quit();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NamesProgram();
	}

}
