package MyClassPrograms;

public class SheepTrialPrivate {

	public static void main(String[] args) {
		//create sheep instance
		SheepPrivate s1= new SheepPrivate(1);
		SheepPrivate s2= new SheepPrivate(2);
		SheepPrivate s3= new SheepPrivate(3);
		SheepPrivate s4= new SheepPrivate(4);
		
		// Check total no of sheeps using class mathod (declared in static)
		System.out.println("Total number of sheep is " +SheepPrivate.countAll());
		
		// check which pen s3 is in then move him to another pen
        System.out.println("s3 is in pen " + s3.getPenNumber());
        
        // move s3 to 5 pin
        s3.setPenNumber(5);
        System.out.println("s3 pen number is"+s3.getPenNumber());
        
        //note we can not use private variables directly here like s3.penNumber 
        // hence we need getter and setter methods.
        }

}
