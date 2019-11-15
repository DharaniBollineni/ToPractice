package inheritanceSelfLearningJava;

public class Sample {
	
	void display(int a)
	{
		 System.out.println("in int method" + "asdd" + "aasdfs");
	}
	
//	void display(char a)
//	{
//		 System.out.println("in char method");
//	}
	
	public static void main(String[] arg )
	{
		 Sample s= new Sample();
		 s.display('a');
	}

}
