package polymorphismSelfLearning;

//http://javaconceptoftheday.com/static-binding-and-dynamic-binding-in-java/
//static binding and dynamic binding 
public class PolymorphismBuiding {
		public static void main(String[] args) {
			PolymorphismA a1=new PolymorphismA();	// all methods in A class is accessed but not B class methods
			a1.method();//own From Class A
			a1.methodA();//own From Class A method
			//a1.methodB();  // no access to PolymorphismB object
			//a1.methodB(); //CTE :: The method methodB() is undefined for the type PolymorphismA
			PolymorphismB b1=new PolymorphismB();   // due to inheritance all methods in A class other then overridderned methods can be accessed 
			b1.method();//own From Class B          // its a overridden method so it is implemented as per the Bclass.
			b1.methodA();  // parent method   From Class A method
			b1.methodB();  //own   From Class B method
			PolymorphismA a2=new PolymorphismB();
			a2.method();  //From Class B		//  overridden method of B class
			a2.methodA();  //From Class A method //	
			//a2.methodB();  // no access to PolymorphismB object
			//---> use of it 
			
			
			// dynamic example    --> cehck this
			
			PolymorphismA a3=new PolymorphismA();
			a3.method();    // From Class A
			
			PolymorphismA a4=new PolymorphismB();     // a4 prints 
			a4.method();    //From Class B
			
			
			/*java string format()-------------------> GB

			B extends A

			A a = new B();
			a.methodA();
			a.methodB();  // dynamic binding
			a.mothod();

			a.method(123);*/

		
			
	}

}
