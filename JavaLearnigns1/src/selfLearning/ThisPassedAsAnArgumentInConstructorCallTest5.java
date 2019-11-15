package selfLearning;

public class ThisPassedAsAnArgumentInConstructorCallTest5 {
	    //Variable
		int data=10;
		//constructor
		public ThisPassedAsAnArgumentInConstructorCallTest5()
		{
			ThisPassedAsAnArgumentInConstructorCall5 tt= new ThisPassedAsAnArgumentInConstructorCall5(this);
			tt.display();
			
		}
		
	public static void main(String[] args) {
		ThisPassedAsAnArgumentInConstructorCallTest5 t= new ThisPassedAsAnArgumentInConstructorCallTest5();
		

	}

}


// rewriting 
/*
class B()
{
 A objA;
}
B(A objA)
{
 this.objA=objA;
}
 void display()
 {
     sysout(objA.varA);
 }
----------------------------------------

class A()
{
  int varA=10;
  A()
  {
     B objB=new B(this);
     objB.display();
  }
 

}
 public static void main(String[] arg)
 {
   A objA=new A();
 }
*/