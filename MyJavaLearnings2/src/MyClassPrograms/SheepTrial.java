package MyClassPrograms;

public class SheepTrial {

	public static void main(String[] args) {
		//create sheep instance
		Sheep s1= new Sheep(1);
		Sheep s2= new Sheep(2);
		Sheep s3= new Sheep(3);
		Sheep s4= new Sheep(4);
		
		// Check total no of sheeps using class mathod (declared in static)
		System.out.println("Total number of sheep is " +Sheep.countAll());
		
		// check which pen s3 is in then move him to another pen
        System.out.println("s3 is in pen " + s3.find());
        
        // move s3 to 5 pin
        s3.moveTo(5);
        System.out.println("s3 pen number is"+s3.find());
        
        //note we can not use private variables directly here like s3.penNumber 
        // hence we need getter and setter methods.
        }

}
