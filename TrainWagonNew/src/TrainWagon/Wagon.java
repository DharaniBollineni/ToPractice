package TrainWagon;

public class Wagon<Q> {

	//1::Create a class Wagon with a generic parameter Q. 
	//Wagon should be able to hold on to a piece of data of type Q (the value), and to a reference to the 
	//next Wagon object (which holds the same type of data). The next field will be null if this is the last Wagon.
	private Q value;
	private Wagon<Q> next;
	
	public Wagon(Q value, Wagon<Q> next) {
		this.value= value;
		this.next= next;
	}
	
	
//Add a method int size() to Wagon that gives the size of the chain of Wagon starting from this one. That is,
//if this is the last Wagon it returns 1, 
// and otherwise it returns one more than the size of the chain starting from the next Wagon.
	public int size()
	{
		if(next==null)
		{
			return 1;
		}
		return next.size()+1;
	}
	//7:: Add a method insertAfter(Wagon<Q>) to Wagon that allows coupling a new Wagon after this Wagon, 
	//and before the following Wagon. Ensure that all the Wagon are still part of the train afterwards. 
	//That is, if there are Wagon 
	//connected A -> B -> C -> D, B.insertAfter(X) should leave Wagon connected A -> B -> X -> C -> D.
	public void insertAfter(Wagon<Q> x)
	{
		
//		Wagon<Q> temp = getNext();
//		setNext(x);
//		x.setNext(temp);
		
		//type2
		
	   x.setNext(getNext());
	   setNext(x);		
	}	
	
	public String toString()
	{
		return "My wagon data: "+this.value;
	}
	
	public Q getValue() {
		return value;
	}


	public void setValue(Q value) {
		this.value = value;
	}
	public Wagon<Q> getNext() {
		return next;
	}
	public void setNext(Wagon<Q> next) {
		this.next = next;
	}
}
