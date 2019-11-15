package MyClassPrograms;

//http://www.pp.rhul.ac.uk/~george/PH2150/html/node47.html

public class ComplexPrivate {

	// private class variable
	private double realPart;
	private double imagPart;
	
	// declare getter and setter
	public double getRealPart() {
		return realPart;
	}

	public void setRealPart(double realPart) {
		this.realPart = realPart;
	}

	public double getImagPart() {
		return imagPart;
	}

	public void setImagPart(double imagPart) {
		this.imagPart = imagPart;
	}
	
	
	// default constructor 
	public ComplexPrivate()
	{
		realPart=0;
		imagPart=0;
	}
	
	// another constructor
	public ComplexPrivate(double r, double i)
	{
		realPart= r;
		imagPart= i;
	}
	
	public void increaseBy()
	{
		realPart = realPart+getRealPart();
		imagPart = imagPart+getImagPart();
		return;
	}
	
	
	// method to add together two complex numbers and return the result
    public static ComplexPrivate add(ComplexPrivate z, ComplexPrivate w)
    {
    	ComplexPrivate sum = new ComplexPrivate();
        sum.realPart = z.getRealPart() + w.getRealPart();
        sum.imagPart = z.getImagPart() + w.getImagPart();
        return sum;
    }
	
	public static void main(String[] args) {
		ComplexPrivate z=new ComplexPrivate(3,4);
		System.out.println(z.getRealPart()+"  "+z.getImagPart());
		z.increaseBy();
		System.out.println(z.getRealPart()+"   "+z.getImagPart());
		
		ComplexPrivate w=new ComplexPrivate(4,3);
		System.out.println(w.getRealPart()+"   "+w.getImagPart());
		w.increaseBy();
		System.out.println(w.getRealPart()+"  "+w.getImagPart());
		
		ComplexPrivate sumObj=add(z,w);
		System.out.println("Sum of real parts and imaginary parts in two objects "+sumObj.realPart+"  "+sumObj.imagPart);
		
	}

}
