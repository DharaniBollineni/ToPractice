package Logics;

public class SortingTechniques {

	/* implementation of Bubble sort
	 * before bubble sort 10 5 3 9 11 
	 * after bubble sort  3 5 9 10 11
	 */	
	// compare the next adjust element and if greater then swap it.
	public int[] bubbleSort(int input[]) {
		int n = input.length;
		// First "for loop" is only for the iteration and 2nd for loop is for logic of swapping
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i-1; j++) {  // limit is n-i-1 because it's if condition has input[j + 1] // otherwise throws an run time error
				if (input[j] > input[j + 1]) {
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}
		}
		return input;
	}

	// Optimized implementation of Bubble sort
	public int[] bubbleSortOptimized(int input[]) {

		int n = input.length;
		for (int i = 0; i < n; i++) {
			int flag = 0;
			for (int j = 0; j < n - i - 1; j++) {
				if (input[j] > input[j + 1]) {
					flag = 1;
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}

			}
			// no swapping is done then break from the loop and return the sorted array
			if (flag == 0) {
				break;
			}

		}
		return input;
	}

	//  find the minimum value and place it in the beginning
	public int[] selectionSort(int input[]) {
		int n = input.length;
		for (int i = 0; i < n; i++) {
			int minIndex = i; 	// Imagine ith position value is min 
			for (int j = i + 1; j < n; j++) { 
				if (input[j] < input[minIndex]) { // find min value and hold that position 
					minIndex = j;
				}
			}
			if (minIndex != i) {     // swap the min element to the beginning.
				int temp = input[minIndex];
				input[minIndex] = input[i];
				input[i] = temp;
			}

		}

		return input;
	}

	public void displaySort(int input[]) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + "  ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		SortingTechniques sort1 = new SortingTechniques();
		// bubble sort
		int[] dataBS = { 10, 5, 3, 9, 11 };
		System.out.println("before bubble sort");
		sort1.displaySort(dataBS);
		dataBS = sort1.bubbleSort(dataBS); // perform sorting
		System.out.println("after bubble sort");
		sort1.displaySort(dataBS);

		// Optimized implementation of Bubble sort
		int[] dataBSOpti = { 90, 99, 98, -100, 1 };
		System.out.println("before Optimized bubble sort");
		sort1.displaySort(dataBSOpti);
		dataBSOpti = sort1.bubbleSortOptimized(dataBSOpti); // perform sorting
		System.out.println("after Optimized bubble sort");
		sort1.displaySort(dataBSOpti);

		// selection sort
		/*
		 * The selection sort algorithm sorts an array by repeatedly finding the minimum
		 * element (considering ascending order) from unsorted part and putting it at
		 * the beginning.
		 */
		int[] dataSS = { 9, 99, 8, -100, 1 };
		System.out.println("before selection sort");
		sort1.displaySort(dataSS);
		dataSS = sort1.selectionSort(dataSS); // perform sorting
		System.out.println("after selection sort");
		sort1.displaySort(dataSS);

	}
}
