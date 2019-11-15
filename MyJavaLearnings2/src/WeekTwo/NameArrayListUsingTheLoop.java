package WeekTwo;

import java.util.ArrayList;

import ecs100.UI;

public class NameArrayListUsingTheLoop {

	private ArrayList<String> names = new ArrayList<String>();

	public NameArrayListUsingTheLoop() {
		// TODO Auto-generated constructor stub
		UI.addTextField("Add Name", this::addName);
		UI.addButton("Display names", this::displayNames);
		UI.addButton("All Names To UpperCase", this::allToUpper);
		UI.addButton("All Names To LowerCase", this::allToLower);
		UI.addTextField("search and convert the case", this::changeCase);
		UI.addTextField("CheckAvailable", this::checkAvaiable);
		UI.addButton("Valied User Name", this::valiedUserName);
	}

	public void addName(String name) {
		this.names.add(name);
		UI.println(name);
		this.displayNames();
	}

	public void checkAvaiable(String nameCh)
	{
		boolean checkStatus=containsName(nameCh);
		if (checkStatus == true)
		{
			UI.println("Search is present");
		}
		else
		{
			UI.println("Search dosen't present");
		}
		
	}
	
	public boolean containsName(String nameCh)
	{
		for(String n: this.names)				// can also use normal for loop
		{
			if (n!=null && nameCh.equals(n))
			{
				return true;
			}
		}
		return false;
	}
	public void displayNames() {
		if (this.names.isEmpty()) {
			UI.println("empty list please enter details");
		} else {
			UI.println("Names list:");
			UI.println("------------");
			int i = 0;
			while (i < this.names.size()) {
				//UI.printf("%d :: %s%n", i, this.names.get(i));                                //--> check DDDD
				UI.println(this.names.get(i));
				i++;
			}

		}
	}

	public void allToUpper() {
		String str;
		if (this.names.isEmpty()) {
			UI.println("empty list please enter details");
		} else {
			int i = 0;
			while (i < this.names.size()) {
				str=this.names.get(i).toUpperCase();
				this.names.set(i, str);
				//UI.print("******");
				i++;
			}
			this.displayNames();
		}
	}

	public void allToLower() {
		if (this.names.isEmpty()) {
			UI.println("Empty list please enter details");
		} else {
			int i = 0;
			while (i < this.names.size()) {
				this.names.set(i,this.names.get(i).toLowerCase());
				i++;
			}
		}
		this.displayNames();
	}
	
	public void valiedUserName()
	{
		ArrayList<String> checkName = new ArrayList<String>();
		for(String n: names)
		{
			if(checkValidNames(n))
			{
				checkName.add(n);
			}
		}
		for(String n: checkName)
		{
			UI.println(n);
		}
	}

	public boolean checkValidNames(String name)
	{
		if(name!=null && !name.contains(" "))
		{
			return true;
		}
		return false;
		
	}
	public void changeCase(String seachName) {
		if (this.names.isEmpty()) {
			UI.println("Empty List please enter the details");
		} 
		// instred of flag u can use 
		//this.names.contains(seachName);
		else {
			int i = 0,flag=0;
			String caseType,cStr;
			while (i < this.names.size()) {
				//UI.println("hihihi");
				if (this.names.get(i).equals(seachName)) 
				{
					UI.println("hi");
					flag++;
					String sStr = this.names.get(i);
					caseType = UI.askString("Enter the case Upper or Lower");
					switch (caseType) 
					{
					case "upper":

						if (!this.names.get(i).equals(sStr.toUpperCase())) {							
							cStr=this.names.get(i).toUpperCase();
							this.names.set(i, cStr);
							UI.println("Converted to upper case" +this.names.get(i) );
							//flag++;
						} else {
							UI.println("already in uppercase");
						}
						break;
					case "lower":
						if (!this.names.get(i).equals(sStr.toLowerCase())) {
							cStr= this.names.get(i).toLowerCase();
							this.names.set(i, cStr);
							//UI.println("Converted to lower case" +this.names.set(i, cStr));
							
							UI.println("Converted to lower case" +this.names.get(i));
							
						}
						else {
							UI.println("already in lowercase");
						}
						
					}
				}
				i++;
			}
			if(flag==0)
			{
			            UI.println("Search name dosen't exist");
			}
			
			
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NameArrayListUsingTheLoop();
	}

}
