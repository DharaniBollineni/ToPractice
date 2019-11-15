package week1;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Person implements Comparable<Person>{

	private int ID;
	private String name;
	
	
	public int compareTo(Person p)
	{
		///return (this.getID() - p.getID() );
		
		
		return this.getName().compareToIgnoreCase(p.getName());
				
		
	}
	
	
	public Person (int ID, String s)
	{
		this.ID = ID;
		this.name = s;
	}

	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}



	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String toString()
	{
		return "ID = " + this.ID + " " + "Name = " + this.name;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Person p1 = new Person (20, "Dharani");
		Person p2 = new Person (3, "Muhammed");
		Person p3 = new Person (1, "Michael");
		Person p4 = new Person (6, "Ali");
		Person p5 = new Person (2, "Omar");
		
		
		List<Person> rList = new ArrayList<Person>();
		
		rList.add(p1);
		rList.add(p2);
		rList.add(p3);
		rList.add(p4);
		rList.add(p5);
		
		System.out.println("ArrayList --> "+rList);
		
		
		//Collections.sort(rList);
		
		Collections.sort(rList, new SortByPersonID());
		System.out.println("ArrayList --> "+rList);
		
		
		
		Collections.sort(rList, new SortPersonByName());
		System.out.println("ArrayList --> "+rList);
		
		
		

	}


}
