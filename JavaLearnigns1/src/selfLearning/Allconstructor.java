package selfLearning;

import abstraction.Car;

public class Allconstructor {

	public Allconstructor() {
		System.out.println("inside default constructor");
	}

	public Allconstructor(String name) {
		System.out.println("Inside parameter constructor " + name);

	}

	public Allconstructor(double marks) {
		System.out.println("Inside pararameter constrctor " + marks);

	}

	public static void main(String[] args) {
		Car car = new Car();
		Allconstructor objRef1= new Allconstructor();
		Allconstructor objRef2= new Allconstructor("Chinmayi");
		Allconstructor objRef3= new Allconstructor(100);
	}
}