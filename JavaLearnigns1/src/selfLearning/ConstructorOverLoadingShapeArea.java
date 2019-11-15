package selfLearning;

public class ConstructorOverLoadingShapeArea {

	public ConstructorOverLoadingShapeArea() {					// constructor :: 1
		System.out.println("Please enter a value");
	}

	public ConstructorOverLoadingShapeArea(int a) {				// constructor :: 2
		System.out.println("Area of a square is " + a * a);
	}

	public ConstructorOverLoadingShapeArea(int a, int b) {		// constructor :: 3
		System.out.println("Area of a rectangle is " + a * b);
	}

	public ConstructorOverLoadingShapeArea(float a) {			// constructor :: 4
		System.out.println("Area of a circle is " + Math.PI * a * a);

	}

	public static void main(String[] args) {					// main()
		ConstructorOverLoadingShapeArea noArgObj= new ConstructorOverLoadingShapeArea();
		ConstructorOverLoadingShapeArea sqObj= new ConstructorOverLoadingShapeArea(10);
		ConstructorOverLoadingShapeArea recObj= new ConstructorOverLoadingShapeArea(10,20);
		ConstructorOverLoadingShapeArea cirObj= new ConstructorOverLoadingShapeArea(10.5f);
		
	}

}
