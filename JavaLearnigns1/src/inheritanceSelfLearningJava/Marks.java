package inheritanceSelfLearningJava;

public class Marks {

	//variable
	float m1,m2,m3,m4,m5,total;
	
	//constructor
	public Marks(float m1,float m2,float m3,float m4,float m5)
	{
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.m4=m4;
		this.m5=m5;		
	}
	
	// Calculate marks
	float sumMarks()
	{
		this.total=m1+m2+m3+m4+m5;
		return total;
	}	
	
}
