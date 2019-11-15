/*
 * Extra work:
If you have extra time find other things that you can do. Such as count number of times a specific number has been entered and
display position(s) a specific number is in the stored numbers. You imagination is the limitation.
 */

package WeekTwo;

import java.util.ArrayList;

import javax.swing.JTextField;

import ecs100.UI;

public class OccurrenceOfANumberPosition {

	private ArrayList<Integer> numbers = new ArrayList<Integer>();

	public OccurrenceOfANumberPosition() {
		// TODO Auto-generated constructor stub
		UI.initialise();

		UI.addTextField("Add Numbers", this::addNumberToArrayList);
		UI.addButton("Display Numbers", this::display);
		UI.addTextField("Search", this::searchANumber);
		UI.addTextField("Replace value", this::replaceValue);
		
	}

	public void addNumberToArrayList(String val) {
		if (val.isEmpty()) {                                                   //----->Check DDDD
		  UI.println("invalied input please enter a integer value");
		} else {
		this.numbers.add(Integer.valueOf(val));
		//val= "";
		// UI.clearText();
		}
	}

	public void display() {
		UI.clearText();
		if (this.numbers.isEmpty()) {
			UI.println("Please enter values in the array list");
		} else {
			int n = this.numbers.size();
			UI.println("Number of elements in the list is " + n + " as follows");
			UI.println("---------------------");
			for (int i = 0; i < n; i++) {
				UI.println(this.numbers.get(i));
			}
			UI.println("---------------------");
		}
	}

	public void searchANumber(String sValue) {
		int count = 0;
		Integer val = Integer.valueOf(sValue);
		if (this.numbers.isEmpty()) {
			UI.println("Please enter values in the array list");
		} else if (this.numbers.contains(val)) {
			UI.printf("the is present in the list %n ");
			// check the number of occurance of a search element
			for (int i = 0; i < this.numbers.size(); i++) {
				if (this.numbers.get(i) == val) {
					UI.println("the " + val + "is @" + i);
					count++;
				}
				UI.println("no of time the value occured is "+count);
			}
		} else {
			UI.println("the " + val + "is not present in the list");
		}

	}

	public void replaceValue(String val) {
		Integer cVal= Integer.valueOf(val);
		if (this.numbers.isEmpty()) {
			UI.println("Please enter values into the array list");
		} else {
			UI.println("*****"+!this.numbers.contains(cVal));   //----------------> check DDDDD
			if(!this.numbers.contains(cVal))
			{
				UI.println("Value is not present");
			}
			else
			{
				for (int i = 0; i < this.numbers.size(); i++) {
					if (this.numbers.get(i).equals(cVal)) {
						// replace
						Integer rVal = UI.askInt("Enter replace value ");
						this.numbers.set(i, rVal);
						UI.printf("Succesfully replaced at %d postion %nfrom %d to %d", i, this.numbers.get(i), rVal);
						UI.println(this.numbers.get(i));
						
						/*UI.println("index using indexOf method");
						int pos=this.numbers.indexOf(cVal);
						UI.println(pos);*/
						
					}
				}
				}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new OccurrenceOfANumberPosition();
	}

}
