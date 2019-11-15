package MyClassPrograms;

public class Counter {

	int i=1;
	
	void countMethod()
	{
		do {
			
			System.out.println("i :: "+i);
			i++;
		}while(i<=100);
		i=1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c= new Counter();
		c.countMethod();
		c.countMethod();
	}

}
