package TrainWagon;
import java.util.ArrayList;

import TrainWagon.basicsingleLinkedList.LinkedList;

//2::Create a class Train with generic parameter T. A train consists of wagons holding the same type,
//and holds on to a reference to the first Wagon in the train (the head). 
//The head will be null if the train has no Wagon.
public class Train<T> {
	Wagon<T> head;
	private int size;

	public Train() {

		head = null;

	}

	// 3::Add a method prepend(T x) to Train that allows adding a new head Wagon to
	// the
	// train with the given value x
	// inside it. The existing chain of wagons in the train will follow the new head
	// Wagon.
	public void prepend(T x) { //
		head = new Wagon<T>(x, head);
	}

	// 4::Add a method prepend(Wagon<T>) to Train that allows adding a new head
	// Wagon
	// to the train. This method overloads the previous one, with different
	// parameter types: in this case, the method is given an existing Wagon object
	// with a value already inside it. You might find either this one or the other
	// easier to try first.
	public void prepend(Wagon<T> w) { // links the all the node while, blue yello etc

		// search for the last wagoin in the chain of wagons starting from w

		w.setNext(head);
		head = w;
	}

	// 6:Add a method int size() to Train that returns the number of Wagon in the
	// train.

	public int size() {
		if (head != null) {
			return head.size();
		}
		return 0;
	}

	// 8.Add a method appendWagon(Wagon<T>) to Train that puts the given Wagon at
	// the end of the train.
	// That is, the Wagon it was given will now be the final Wagon in the train, and
	// the train's size will
	// increase by 1.
	public void appendWagon(Wagon<T> w) {
		if (head == null) {
			head = w;
		} else // if(head!=null)
		{
			Wagon<T> temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(w);
		}
		int size = head.size();
		setSize(size); // increased size

	}

	// 9.Add a method Wagon<T> getWagon(int i) to Train that returns the ith Wagon
	// of the train.
	// You may want to modify Wagon while you do this. ---> check this???
	public Wagon<T> getWagon(int i) {
		Wagon<T> w = head;
		if (i <= size() && i >= 0) {
			for (int j = 0; j < i; j++) {
				w = w.getNext();
			}

		}
		return w;
	}

	// 10::Add a method int findWagon(T) to Train that finds the position of the
	// first Wagon holding a value
	// that is equal (.equals) to the value given, or returns -1 if there is no such
	// Wagon.
	// For any result other than -1,
	// train.getWagon(train.findWagon(x)) should return a Wagon<T> with the value x
	// inside.
	public int findWagon(T v) // v ="green
	{
		Wagon<T> current = head;
		int i = -1;
		while (current != null) {
			i++;
			if (current.getValue().equals(v))
				return i; // value is found returns index
			current = current.getNext();
		}
		return -1; // data not found returns -1
	}

	/*
	 * Wagon<T> current = w; int i=-1; while (current != null) { i++; if
	 * (current.getValue() == v) return i; //data found returns index current =
	 * current.next; } return -1; //data not found returns -1
	 */

	// 11. Add a method T get(int i) to Train that returns the data item in the ith
	// Wagon of the train.
	public T get(int index) // returns String
	{
		Wagon<T> w = head;
		if (index <= size() && index >= 0) {
			for (int j = 0; j < index; j++) {
				w = w.getNext();
			}

		}
		return w.getValue();
	}
	// 12: Add a method remove(int i) to Train that removes the ith Wagon from the
	// train. That is,
	// if there are Wagon connected A -> B -> C -> D, after remove(2) there should
	// be Wagon
	// connected A -> B -> D. To do so, you would need to find B (the Wagon before
	// C, number 2) and
	// update its idea of what comes next to refer to D (the wagon after C). There
	// is a special case required
	// for removing wagon 0!

	public void remove(int index) {
		Wagon<T> current = head;
		int size = head.size();
		setSize(size);

		if (index <= size() && index >= 0) {
			// If linked list is empty
			if (head == null)
				return;
		}
		Wagon<T> temp = head;
		// delete the node at the beginning of the list
		if (index == 0) {
			head = temp.getNext(); // Change head
			return;
		}
		// to delete the node at the middle of the linked list
		// Find previous node of the node to be deleted
		for (int i = 0; temp != null && i < index - 1; i++)
			temp = temp.getNext();

		// Node temp->next is the node to be deleted
		// Store pointer to the next of node to be deleted
		Wagon<T> nextNode = temp.getNext().getNext();
		temp.setNext(nextNode); // Unlink the deleted node from list

	}

	// 13:: Add a method insert(int, T) to Train that inserts a new Wagon at
	// position i holding the given value.
	// Hint: both findWagon and insertAfter will be useful.
	public void insert(int index, T val) {

		// insert a new node at position i holding the given value

		// update size
		int s = head.size();
		setSize(s);

		// create a node
		Wagon<T> insertNode = new Wagon<T>(val, null);
		// check the size
		if (index <= s && index >= 0) {
			if (index == 0) {
				Wagon<T> firstNode = getWagon(index - 1);
				firstNode.insertAfter(insertNode);
			} else if (index == size()) {
				Wagon<T> lastNode = getWagon(index - 1);
				lastNode.insertAfter(insertNode);
			} else {
				Wagon<T> previ = getWagon(index - 1);
				previ.insertAfter(insertNode);

			}

		}

	}

	// 14: Add a method add(T) to Train that adds a new Wagon with the given data
	// item at the end of the train.
	public void add(T val) {
		// update size
		int s = head.size();
		setSize(s);
		Wagon<T> insertNode = new Wagon<T>(val, null);
		if (s == 0) {
			head = insertNode;
		} else {
			Wagon<T> lastNode = getWagon(s - 1); // Check s??
			lastNode.setNext(insertNode);
		}

	}

	// 15: Add a method T set(int, T) to Train that replaces the data item held by
	// the ith Wagon of the train.
	// You will need to modify Wagon as well.
	public T set(int i, T val) {
		// identify
		// replace data @
		// ith wagon and modify it and return
		Wagon<T> temp = getWagon(i);
		temp.setValue(val);
		return val;

	}

	public Wagon<T> findEndNode(Wagon<T> w) {
		return null;
	}
	// 16: Add a method addAll(Train<T>) to Train that joins the chain of wagons of
	// the given
	// Train onto the end of the current chain.

	public void addAll(Train<T> t1) {
		
		appendWagon(t1.head); //// public void appendWagon(Wagon<T> w)
	}

	// 17: Add a method int lastIndexOf(Object x) to Train that returns the position
	// of the last
	// Wagon whose data item is equal (.equals()) to x.

	public int lastIndexOf(Object x) {
		Train<T> temp = this;
		int q = -1;
		for (int i = 0; i < size(); i++) {
			if (temp.get(i) == x) {
				q = i;
			}
		}
		return q;
	}

	// 18: Add a method Train<T> reversed() to Train that returns a new Train with
	// all the same data items
	// in reverse order.
	private void reversedRec(Wagon<T> w, Train<T> t) {
		if (w == null)
			return;
		reversedRec(w.getNext(), t);
		t.appendWagon(new Wagon<T>(w.getValue(), null));
	}

	public Train<T> reversed() {
		Train<T> t = new Train<T>();
		reversedRec(head, t);
		return t;
	}

	// 19:Add a method void reverse() to Train that reverses the Wagons of the train
	// in-place.
	// That is, the last Wagon of the train will now come first, and the
	// second-to-last Wagon will come second, and so on. The Train will have the
	// same number of Wagons and the same data items afterwards, just in a different
	// order.
	public void reverse() {
		System.out.println("inside reverse");

		ArrayList<T> a = new ArrayList<T>();// = new T [10];
		Wagon<T> w = head;
		while (w != null) {
			a.add(w.getValue());
			w = w.getNext();
		}
		head = null;
		for (int i = a.size() - 1; i >= 0; i--) {
			T t = a.get(i);
			this.appendWagon(new Wagon(t, null));

		}
		// for(T t : a){
		// this.appendWagon(new Wagon(t,null));
		// }

	}

	// T temp;
	// int i,j,lenght;
	// lenght=size();
	// //T a[] = null;
	// Wagon<T> p = null,q = null;
	// i=0;
	// j=lenght-1;
	// while(i<j)
	// { int k=0;
	// while(k<j)
	// {
	// q=q.getNext();
	// k++;
	// }
	// temp = p.getValue();
	// p.setValue(q.getValue());
	// q.setValue(temp);
	// //a[i]=q.getValue();
	// i++;
	// j++;
	// p=p.getNext();
	// q=head;
	// }
	//// for (int l=0;l<lenght;l++)
	//// {
	//// System.out.println(a[i]);
	//// }
	// }
	// display
	public void printTrain() {
		printWagon(head);
	}

	private void printWagon(Wagon<T> w) {
		if (w == null)
			return;

		System.out.println(w); // toString() prints the values ... its in Wagon class

		printWagon(w.getNext());
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
