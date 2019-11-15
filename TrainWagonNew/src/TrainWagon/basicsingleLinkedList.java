package TrainWagon;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class basicsingleLinkedList {
	
	public class LinkedList<E> implements List<E> {

		private LinkedList<E> next;
		private E value;
		private static final int counter = 0; // Need to adjust the counter in remove

		// This is the constructor
		public LinkedList() {
			next = null;
			value = null;
		}

		// This will return the current value
		public E getValue() {
			return value;
		}

		// This will return the next node
		public LinkedList<E> getNext() {
			return next;
		}

		// Add an element to the linked list
		public boolean add(E element) {
			// Needs to handle two different cases, when list is empty and when it
			// is not
			if (next == null) {
				next = new LinkedList<E>(); // Create a new node
				value = element; // Add the value to the node
			} else {
				next.add(element); // Will call the add on next node until empty
			}
			return true;
		}

		// Check if the linked list is empty
		public boolean isEmpty() {
			// The list is empty if there is no next node
			boolean empty = false;
			if (next == null) {
				empty = true;
			}
			return empty;
		}

		// Check the size of the list
		public int size() {
			// The size of the list is one more than the size of the part of the
			// list that comes after it
			LinkedList<E> node = this;
			int size = 0;
			while(node.next != null){
				size++;
				node = node.next;
			}
			return size;
		}

		// To get the value at a particular index N you will have to take N steps
		// through the list nodes.
		public E get(int index) {
			LinkedList<E> node = this;
			if (index <= size() && index >= 0) {
				for (int i = 0; i < index; i++) {
					node = node.next;
				}
			}
			return node.getValue();
		}

		// Returns the LinkedList object at an index
		public LinkedList<E> getIndex(int index) {
			LinkedList<E> node = this;
			if (index <= size() && index >= 0) {
				for (int i = 0; i < index; i++) {
					node = node.next;
				}
			}
			return node;
		}

		// Set the value at a particular index
		public E set(int index, E element) {
			LinkedList<E> node = this;
			E previous = null;
			if (index <= size() && index >= 0) {
				for (int i = 0; i < size(); i++) {
					if (i == index){
						previous = node.getIndex(i).getValue();
						node.getIndex(i).value = element;
					}
				}
			}
			return previous;
		}

		// Clears all the elements in the list
		public void clear() {
			next = null;
			value = null;
		}

		// The add(int,E) method inserts a new item between two existing values in
		// the list. You will need to update the "next" fields to do that.

		public void add(int index, E element) {

			// Create the node.
			// Set value of this new node to the element
			// Set the next to the current value at this index
			// Set the previous one to this new node
			// Need another method to get linked list objects

			LinkedList<E> node = new LinkedList<E>(); // Create the new element
			LinkedList<E> previousone;
			LinkedList<E> currentlythere;
			// Set the value of this new node to the element

			if (index <= size() && index >= 0) {
				if (index == 0) {
					// Insert after yourself
					// Insert you into the new one
					// Insert value into you
					currentlythere = getIndex(0);
					node.next = getIndex(1);
					currentlythere.next = node;
					node.value = currentlythere.getValue();
					currentlythere.value = element;
				} else if (index == size()) {
					node.add(element);
				} else {
					for (int i = 0; i <= index; i++) {
						if (i == index) {
							previousone = getIndex(i - 1);
							currentlythere = getIndex(i);
							previousone.next = node;
							node.value = element;
							node.next = currentlythere;
						}
					}
				}
			}
		}

		// Remove an element from the LinkedList
		// To remove an item, tell the preceding node that it is followed by the one
		// after the deleted node.
		public E remove(int index) {
			LinkedList<E> node = this;
			LinkedList<E> previousnode;
			LinkedList<E> nextnode;

			if (index <= size() && index >= 0) {
				if (index == 0) {
					// Copy into yourself
					// Then delete the next copy
					nextnode = node.getIndex(1);
					node.value = nextnode.value;
					node.next = nextnode.next;
					nextnode = null;
				} else {
					for (int i = 1; i <= index; i++) {
						if (i == index) {
							previousnode = node.getIndex(i - 1);
							nextnode = node.getIndex(i + 1);
							previousnode.next = nextnode;
							node = null;
						}
					}
				}
			}
			return null;
		}

		// Contains a certain object
		// To check whether an item is contained in the list, traverse all of the
		// nodes and check whether the value equals() the target.
		public boolean contains(Object obj) {
			LinkedList<E> node = this;
			for (int i = 0; i < size(); i++) {
				if (node.getIndex(i).getValue() == obj) {
					return true;
				}
			}
			return false;
		}

		// Remove the first occurrence of an object
		// To remove a given object, find it in the list and then remove the node.
		public boolean remove(Object obj) {

			LinkedList<E> node = this;
			for (int i = 0; i < size(); i++) {
				if (node.getIndex(i).getValue().equals(obj)) {
					node.remove(i);
					return true;
				}
			}
			return false;
		}

		// Methods that are not written yet
		// Methods to be completed & auto-filled

		@Override
		public boolean addAll(Collection<? extends E> arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean addAll(int arg0, Collection<? extends E> arg1) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean containsAll(Collection<?> arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public int indexOf(Object arg0) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public Iterator<E> iterator() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int lastIndexOf(Object arg0) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public ListIterator<E> listIterator() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ListIterator<E> listIterator(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean removeAll(Collection<?> arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean retainAll(Collection<?> arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public List<E> subList(int arg0, int arg1) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object[] toArray() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <T> T[] toArray(T[] arg0) {
			// TODO Auto-generated method stub
			return null;
		}

	}

}
