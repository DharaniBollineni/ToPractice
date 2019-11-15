package trainExercise;

public class Wagon <Q>
{
  // varaible1 Q (the value)
	Q value;
 //// varaible1 Q next (new Wagon())
	Wagon<Q> next;
	public Wagon(Q value, Wagon<Q> next) {
		this.value= value;
		this.next= next;
	}
	// Add a method int size() to Wagon that gives the size of the chain of Wagons starting from this one. That is, if this is the last Wagon it returns 1, and otherwise it returns one more than the size of the chain starting from the next Wagon.
	public int size()
	{
		if(next==null)
		{
			return 1;
		}
		return next.size()+1;
	}
	
	//B.insetAfter(X);
	//Add a method insertAfter(Wagon<Q>) to Wagon that allows coupling a new Wagon after this Wagon, and before the following Wagon. Ensure that all the Wagons are still part of the train afterwards. That is, if there are Wagons connected A -> B -> C -> D, B.insertAfter(X) should leave Wagons connected A -> B -> X -> C -> D.
	public void insertAfter(Wagon<Q> w)
	{
		
//		Wagon<Q> temp = getNext();
//		setNext(w);
//		w.setNext(temp);
		
		//type2
		
	   w.setNext(getNext());
	   setNext(w);
		
		
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
	
	
	public String toString()
	{
		return "My wagon data: "+this.value;
	}
	
	
	

}
