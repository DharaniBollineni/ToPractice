package selfLearning;

public class ConstructorOverLoadingString3 {

	public static void main(String[] arg )
	{
	//	new ConstructorOverLoadingString3();
		char[] charArray= {'h','e','l','l','o','o'};
		String str="Chinmayi"; //String class is non primitive data type and str is a reference variable 
		String obj=new String(charArray); // here we are sending details to String constructor which will club all characters and store in obj reverence variable as string
		System.out.println(obj);
	}

}
