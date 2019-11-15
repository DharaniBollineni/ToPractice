package selfLearning;

public class ThisPassedAsAnArgumentInConstructorCall5 {

	//Variable
	ThisPassedAsAnArgumentInConstructorCallTest5 objRef; // this type objRef
	//constructor
	public ThisPassedAsAnArgumentInConstructorCall5(ThisPassedAsAnArgumentInConstructorCallTest5 objRef)  // passing this type objRef
	{
		this.objRef=objRef;
		
	}
	
	public void display()
	{
		System.out.println(objRef.data);  // using this type objRef to access the variable of another class
	}
}



/*class B{  
A4 obj;  
B(A4 obj){  
  this.obj=obj;  
}  
void display(){  
  System.out.println(obj.data);//using data member of A4 class  
}  
}  

class A4{  
int data=10;  
A4(){  
 B b=new B(this);  
 b.display();  
}  
public static void main(String args[]){  
 A4 a=new A4();  
}  
}  */