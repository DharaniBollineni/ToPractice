package MyClassPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultipleReferences {
		
	public String mName;
		public MultipleReferences(String name)
		{
			mName=name;
		}
	public void display(){
		System.out.println("mName		::"+mName);
	}
	
	public void change(String name)
	{
		mName=name;
	}
	public static void main(String[] args) {
		List<MultipleReferences> a =  new ArrayList<>(); 
		a.add(new MultipleReferences("Bob"));
		List<MultipleReferences> b = a;
		a.add(new MultipleReferences("Jim"));
		a.get(0).change("Dharani");
              
		//display all objects in class
		for(MultipleReferences mr: b) {
			mr.display();
		}
		
		/*MultipleReferences a= new MultipleReferences("bob");
		MultipleReferences b=a;
		b.display();
		b.change("Dharani");
		a.display();*/
	}
}
