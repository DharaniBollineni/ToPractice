package week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EntryPointTree {

	public EntryPointTree()
	{
		System.out.println("Fid of 4 is"+fib(4));	
		
	Tree t = new Tree("T1");     // create parent
	Tree t1 = new Tree("T2");	 // create child t1 add to parent t
	t.addChild(t1);
	Tree t2 = new Tree("T3");   // create child t2 add to parent t1
	t1.addChild(t2);
	Tree t3 = new Tree("T4");	// create child t3 add to parent t2
	t2.addChild(t3);
	printTree(t, ">");
	
	
	List<Integer> numbers = new ArrayList<>( Arrays.asList( 
			1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ));

		System.out.println(indexInSortedList(4, numbers, 0, 9));
	
	}
		
	public void printTree(Tree t, String prefix)
	{
		for (Tree x : t.getChildren()) // getchildren() is related to arraylist in tree class
		{
			printTree(x, prefix + ">"); 
		}
		System.out.println(prefix + t.toString());
	}

	public <T extends Comparable<T>> int indexInSortedList(T serach, List<T> numbers, int start, int end) 
	{
		if(start == end) return -1;
		int mid = start + (end - start) / 2;
		T val =numbers.get(mid);
		if (serach.compareTo(val) == 0) return mid;
		if (serach.compareTo(val) < 0) return indexInSortedList(serach, numbers, start, mid);
		return indexInSortedList(serach, numbers, mid + 1, end);
	}

	
	private int fib(int n){		
		System.out.println(n);
		if(n <= 1) 
			return 1;
		return fib(n - 1)+ fib(n - 2);
	}
	
	
	public static void main(String[] args) {
		new EntryPointTree();
	}
	

	
	

}
