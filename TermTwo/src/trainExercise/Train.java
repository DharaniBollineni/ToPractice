package trainExercise;

public class Train<T> {

	Wagon<T> head;
	// creating the wagon's ArrayList

	public Train() {
		head = null;

	}
	
	
	public void printTrain()
	{
		printWagon(head);
	}
	
	private void printWagon(Wagon<T> w)
	{
		if(w== null)
			return;
		
		System.out.println(w);
		
		printWagon(w.getNext());
	}

	//Add a method prepend(T x) to Train that allows adding a new head Wagon to the train with the given value x inside it. The existing chain of wagons in the train will follow the new head Wagon.
	public void prepend(T x) {  //
		head = new Wagon<T>(x, head);  // adds green,null ,adds white, null  --> check
	}

	//Add a method prepend(Wagon<T>) to Train that allows adding a new head Wagon to the train. This method overloads the previous one, with different parameter types: in this case, the method is given an existing Wagon object with a value already inside it. You might find either this one or the other easier to try first.
	public void prepend(Wagon<T> w) {   // links the all the node while, blue yello etc
		
		// search for the last wagoin in the chain of wagons starting from w
		
		w.setNext(head);
		head = w;
	}

//Add a method int size() to Train that returns the number of Wagons in the train.
	public int size() {
		if (head != null) {
			return head.size();
		}
		return 0;
	}
//Add a method appendWagon(Wagon<T>) to Train that puts the given Wagon at the end of the train. That is, the Wagon it was given will now be the final Wagon in the train, and the train's size will increase by 1.
	public void appendWagon(Wagon<T> w) {
        if(head == null)
        {
        	head=w;
        }
        else //if(head!=null)
        {
        	Wagon<T> temp=head;
        	while(temp.next!=null)
        	{        		
        		temp=temp.getNext();
        	}
        	temp.setNext(w);
        }
	}
	public Wagon<T>getWagon(int i)
	{
		return head;
		
	}
}
