package Week3Files;
import java.io.File;
import java.io.IOException;

public class CreateAFile {

	public static void main(String[] args) {
	try {
		File myObj=new File("fileName1.txt");
		if(myObj.createNewFile())
		{
			System.out.println("File created: " + myObj.getName());
		}
		else
		{
			System.out.println("File already exits");
			System.out.println(myObj.getAbsolutePath());
		}
	}catch(IOException e) {
		System.out.println("An error occured.");
		e.printStackTrace();
	}
	}

}
