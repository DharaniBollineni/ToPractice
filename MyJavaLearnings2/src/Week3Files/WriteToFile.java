package Week3Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import ecs100.UIFileChooser;

public class WriteToFile {
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
		
		try {
			FileWriter myWriter= new FileWriter("FileName1.txt");
			//myWriter.getAbsolutePath()
			myWriter.write("adding information into file");
			System.out.println("Successfully wrote to the file");
		}catch(IOException e)
		{
			System.out.println("An error occured");
			e.printStackTrace();
		}
		
		
		try {
			File myObj=new File("fileName1.txt");
			Scanner myReader = new Scanner(myObj); 
			while (myReader.hasNextLine())
			{
				String data=myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		}catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
		      e.printStackTrace();
		    } 
		
			
			
	}

}
