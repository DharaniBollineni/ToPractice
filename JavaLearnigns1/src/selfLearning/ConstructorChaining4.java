package selfLearning;

// constructor chaining with constructor overloading
public class ConstructorChaining4 {

	public ConstructorChaining4() {
		System.out.println("Inside no argument constructor");
	}
	public ConstructorChaining4(int a) {
		this(); // calling to constructor:: in this case it calls the constructor in the class that doesn't have arguments 
		System.out.println("Inside single-argument constructor"+a);
	}

	public static void main(String[] args) {
		ConstructorChaining4 objRef =new ConstructorChaining4(1);

	}

}
