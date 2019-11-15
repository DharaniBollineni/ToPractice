package selfLearning;

public class ThisCurrentClassMethod2 {
	void m()
	{
		System.out.println("Hello M");
	}
	void n()
	{
		System.out.println("Hello N");
		m(); // same as this.m(); 
		//in case of m() compiler will put this keyword to invoke m() in the same class
	}

	

}
