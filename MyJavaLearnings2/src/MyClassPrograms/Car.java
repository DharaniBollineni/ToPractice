package MyClassPrograms;

public class Car {
	// declared as default so it can be accessed anywhere in the class 
	// modified in one class and updated in another class
	
	String color;
	String model;
	String upModelOf = "fit";
	double price=1000;
	double speed=100;
	
	public Car(String c){
		color =c;
		System.out.println("Updated model of "+ upModelOf);	
		System.out.println("New model name "+ model);	
		System.out.println("Color is  "+ color);	
		System.out.println("Price is "+ price);			
	}
	
	public void speedup(int increment){
		speed=speed+increment;		
	}
	
	public void display() {
		System.out.println("speed is "+ speed);	
	}

	public static void main(String[] args) {
		
		//Car carObj= new Car();
		Car carObj= new Car("Blue");
		//carObj.model;
		int increment=10;
		carObj.speedup(increment);
		carObj.display();
		carObj.speed=150;
		carObj.display();
	}

}
