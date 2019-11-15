package TrainWagon;
public class EntryClass {

	public EntryClass() {
		// create object for Train 
				Train<String> express = new Train<String>();
				Train<String> express1 = new Train<String>();
				Train<String> revExpress = new Train<String>();
				//Q value, Wagon<Q> next;
				Wagon<String> w4 = new Wagon<String>("green",null);
				Wagon<String> w3 = new Wagon<String>("White",null);
				Wagon<String> w2 = new Wagon<String>("Yellow",null);
				Wagon<String> w1 = new Wagon<String>("Blue",null);
				Wagon<String> w7 = new Wagon<String>("Yellow",null);
				
				express.prepend(w7);
				express.prepend(w4);
				express.prepend(w3);
				express1.prepend(w2);
				express1.prepend(w1);
				
				express.addAll(express1);
				express.printTrain();
	}
				

				
				/*
				// display train
				express.printTrain();
				
				System.out.println("Get the size of the train "+express.size());
				
				// append and display the updated size
				Wagon<String> w5 = new Wagon<String>("red",null);
				express.appendWagon(w5);
				System.out.println("Size of the train after append "+express.getSize()); 
				
				// insert and display the updated the size
				Wagon<String> w6 = new Wagon<String>("Brown",null);
				w3.insertAfter(w6);				
				express.printTrain();
				System.out.println("Size of the train after insert "+express.size()); 
				
				//Train that returns the ith Wagon of the train
				System.out.println(express.getWagon(3));
				
				express.findWagon("grean");
				
				System.out.println("the value at ith index is "+express.get(3));
				
				System.out.println("remove element at the index ");
				express.remove(3);
				express.printTrain();
				
				System.out.println("Inserting the values");
				express.insert(3, "Inserted val");
				express.printTrain();
				
				System.out.println("Added at the end");
				express.add("added at end");
				express.printTrain();
				
				System.out.println("modify the value at an index");
				express.set(3, "Brown");
				
				System.out.println("add new train to the list");
//				express1.prepend(w1);
//				express1.prepend(w2);
//				express1.prepend(w4);
//				express1.prepend(w3);
//				express.addAll(express1);
				//addAll
				express.printTrain();		
				
				System.out.println("Enter");
				System.out.println(express.lastIndexOf("Yellow"));
				
				
				System.out.println("Normal Reverse the train");
				express.reverse();
				express.printTrain();
				System.out.println("Rec Reverse the train");
				revExpress=express.reversed();
				revExpress.printTrain();
				
				
			}*/
				
			public static void main(String[] args) {
				new EntryClass();
	}

}
