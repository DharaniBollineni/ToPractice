package Week3Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import ecs100.UIFileChooser;

public class ReadAFile {
	public void createFile()
	{
		try {
			File myObj=new File("input.txt");
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
	public void writeFile()
	{
		
		//try with resources
		try(FileWriter myWriter = new FileWriter("input.txt")) {
			myWriter.write("adding information into file. This is new information");
			System.out.println("Successfully wrote to the file");
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
		/*FileWriter myWriter = null;
		try {
			myWriter= new FileWriter("input.txt");
			//myWriter.getAbsolutePath()
			myWriter.write("adding information into file");     //----> check ittttttt
			System.out.println("Successfully wrote to the file");
		}catch(IOException e)
		{
			System.out.println("An error occured");
			e.printStackTrace();
		} finally {
			try {
				myWriter.close();					//--> closing the file reference is important
			}catch(Exception e) {
				
			}
			
		}*/
		
	}
	public void readFile()
	{
		File myfile = new File("input.txt");
		try {
			Scanner scan = new Scanner(myfile);
			while (scan.hasNext()) {
				String line = scan.nextLine();
				System.out.println(line);
			}
			scan.close();			
			System.out.println("----------- end of input.txt --------------");
		} catch (IOException e) {
			System.out.println("File failure: " + e);
		}

	}
	
	public void printOldest(){
		try {
		String oldest = "";
		int maxAge = 0; 
		
		Scanner scan = new Scanner(new File("input.txt"));				// scanner helps to read details from the file
		
		while (scan.hasNextInt())					//checks until end of the file
		{
			int age = scan.nextInt();				// gets next integer value in the file
			String name = scan.nextLine();			// gets next line details
			if (age > maxAge) {    					// compares the age with max age value and swap it if age>maxAge
				maxAge = age;
				oldest = name;
				}
			/*String type = sc.next();
			double  cost = sc.nextDouble();
			int wheels = sc.nextInt();
			String colour = sc.next();
			String make = sc.next()*/
		} 
		scan.close();
		System.out.printf("Oldest is %s (%d)%n", oldest, maxAge);	// prints the output
			} catch (IOException e) { System.out.printf("File failure: %s%n", e); }
		}



	public static void main(String[] args) {
		ReadAFile r=new ReadAFile();
		r.createFile();
		r.writeFile();
		r.readFile();
		r.printOldest();
		
		
	}

}
