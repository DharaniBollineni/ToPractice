package selfLearning;

public class ThisConstructorStudent1 {
	// variable declaration
	int sID;
	String sName, sCourse;
	float fee;
	
	public ThisConstructorStudent1(int sID,String sName,String sCourse)
	{
		this.sID=sID;
		this.sName=sName;
		this.sCourse=sCourse;
	}
	
	public ThisConstructorStudent1(int sID,String sName,String sCourse,float fee)
	{		
		this(sID,sName,sCourse); 
		this.fee=fee;
	//	this(sID,sName,sCourse);  // Compile Time Error :: Constructor call must be the first statement in a constructor
		
	}
	public void display()
	{
		System.out.println("student details are "+sID+" "+sName+" "+sCourse+" "+fee);
	}
}
