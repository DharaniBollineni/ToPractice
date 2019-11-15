package WeekTwo;
import java.util.ArrayList;

import ecs100.UI;
 
// Class declaration 
public class ActingOnEachItemInArrayList {
	// ArrayList Declaration
	public ArrayList <String> nameList=new ArrayList<String>();
	// Constructor Declaration
	public ActingOnEachItemInArrayList()
	{
		 UI.initialise();
		 UI.addTextField("Add Names", this::addNameList);// adding buttons and text boxes and calling method
		 UI.addButton("Display List", this::displayList);
		 UI.addTextField("Extend the Name with deparment", this::extendName);
		 UI.addTextField("Replace Name", this::replaceName);
		 UI.addButton("Check substring", this::checkCharDisplay);
		 
	}
	
	//Add names to the list
	public void addNameList(String name)
	{
		nameList.add(name);
		
	}
			/*													//-----> check DDDD
			 * public void printAll(ArrayList<String>  names ){   -----> how to pass arraylist using button
		for (int i = 0; i<names.size(); i++){
		String n = names.get(i);
		if (n != null) {UI.println(n);}
		}
		}
	 */
	
	// displaying names in the ArrayList
	public void displayList()
	{
		for( int i=0;i<nameList.size();i++)         // for(String n:nameList) { if (n!=null){UI.println(n);
		{
			String n = nameList.get(i);
			if(n!=null)
			{
				UI.println(n);
			}
			
		}
	}
	
	// change or add string to the elements in the list
	// Note 1: for each can't be used for modifying the arrayList because we can't use set method
	// Note 2: for each is good to use for changing the objects in the arrayList eg:check in graphics
	public void extendName(String strExtend)
	{
		for(int i=0;i<nameList.size();i++)			
		{
				nameList.set(i, nameList.get(i)+strExtend);
		}
	}
	
	
	// replace names in the arrayList
	public void replaceName(String changeString)
	{
		for (int i=0;i<nameList.size();i++)
		{
			String n = nameList.get(i);
			if (n.equalsIgnoreCase(changeString))
			{
				String getChangeName=UI.askString("Enter the change name");
				nameList.set(i, getChangeName);
				
			}
		}
	}
	
	// Check sub string or char in  a arraylist string
	public void checkCharDisplay()
	{
		String checkCharStr = UI.askString("Enter substring char");
		UI.println(this.checkChar(checkCharStr));
	}
	public ArrayList<String> checkChar(String checkCharStr)
	{
		int flag=0;
		ArrayList<String> newNameList = new ArrayList<String>();
		for (String n:nameList)
			{
				if(n.contains(checkCharStr))
				{
					newNameList.add(n);
					flag++;
				}
			}
			
		if(flag==0)
		{
			UI.println("dosen't contain");
			return newNameList;
		}
		return newNameList;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ActingOnEachItemInArrayList();
	}

}
