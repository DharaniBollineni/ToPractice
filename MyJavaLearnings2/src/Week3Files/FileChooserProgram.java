package Week3Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import ecs100.UIFileChooser;

public class FileChooserProgram {
	
	public void createAFile()
	{
		/*String fileName=UIFileChooser.open();
		File myFile=new File(fileName);
		Scanner scan=new Scanner (myFile);*/
		
		try(Scanner sc=new Scanner(new File(UIFileChooser.open("Choose a file to copy")))) //check ittttttt
		{
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}

	public void numberMethod()
	{
		String fileName=UIFileChooser.save();
		File file=new File(fileName);
		int n=1;
		try(PrintStream ps= new PrintStream(file)){  // used for printing in a file
			ps.println("Number\tSquare");
			while(n<=1000)
			{
				ps.printf("%6d\t%8d\n", n,n*n);
				n=n+1;
			}
		}catch (IOException e1) {// FileNotFoundException e  // check it ittttttt error
			System.out.println("An error occured.");
			e1.printStackTrace();
		}		
	}
	//Checking if files exist 
	//1. create a new file that repersent the existing file
	//2. copy content from exsiting file to new file with a line number
	//-----------------------------------------------------------------------------------------------------------------
	public void lineNumber(String fname)
	{
		/*The File class provides methods for dealing with files or directories. 
		 * File systems are organized into a hierarchy. A path is a description of a file's location in the hierarchy. 
		 * When a program is running, the program' directory is considered the current directory. 
		 * Any files located in the current directory can be referred to by name alone. 
		 * The relative path is the location of a file with respect to the current directory. 
		 * The absolute path starts at the root directory.*/
		 
		File inFile=new File(fname);
		// located at default project directory
		//A File object is created by passing in a String that represents the name of a file, 
		//or a String or another File object
		//This is an absolute abstract file name.
		if(inFile.exists())
		{
			File outFile= new File("Numbered-"+fname);
			try {
				PrintStream out= new PrintStream(outFile);  // print into file 
				Scanner sc= new Scanner(inFile);			// A text file can be read using a Scanner object.
				
				int num=0;
				while(sc.hasNext())
				{
					out.println(num+":"+sc.nextLine());
					num++;
				}
				out.close();
				sc.close();
			}catch (IOException e){
				System.out.println("An error occured.");
				e.printStackTrace();
			}		
		}
	}
	
	// Passing an open scanner and counting no of tokens or items in the file
	//----------------------------------------------------------------------------------
	public void countTokensInFile(String fname)
	{
		try {
				Scanner sc=new Scanner(new File(fname));
				int numToken=this.countTokens(sc);
				System.out.printf("%s contains %d tokens", fname,numToken);
				sc.close();
			}catch (IOException e){
				System.out.println("An error occured.");
				e.printStackTrace();
			}		
	}
	
	public int countTokens(Scanner sc)
	{
		int count = 0;
		while(sc.hasNext())
		{
			sc.next();
			count++;
		}
		return count;
	}
	
	//Handling multiple items on line and count the int values in the line and prints details on the screen
	@SuppressWarnings("resource")
	public void printItemCounts()
	{
		try {
			Scanner sc=new Scanner(new File("input.txt"));
			while(sc.hasNextLine())
			{
				String item=sc.next();     // check itttttttt working but giving error
				int lineTo=0;
				while(sc.hasNextInt())
				{
					lineTo=lineTo+sc.nextInt();
				}
				System.out.println(item+" : "+lineTo);
			}
		}catch (IOException e){
			System.out.println("An error occured.");
			e.printStackTrace();
		  }		
		
	}
	// Reading files line by line and count 
	
	public void addLineCount()
	{
		try(Scanner sc=new Scanner(new File("input.txt"))){ // scanner needs a file object
			while(sc.hasNextLine())							// check whether file has next line or not if so
			{
				int lineTot=0;
				String line=sc.nextLine();				//  nextline helps to read content line by line
														// This method returns the line that was skipped
														// it points to the line and holds linedetails
				Scanner s=new Scanner(line);			// create object to that line to perform operations
				
				while(s.hasNextInt())					// works on that line
				{	lineTot=lineTot+s.nextInt();
				}
				System.out.println(lineTot);
				s.close();								// close otherwise chance to leak
			}
						
		}catch (IOException e){							// trying to do operation on file not with the exception hence need try and catch
			System.out.println("An error occured.");
			e.printStackTrace();
		  }		
	}
	public static void main(String[] args) {
		FileChooserProgram f1= new FileChooserProgram();
		f1.createAFile();
		f1.numberMethod();
		f1.lineNumber("input.txt");
		f1.countTokensInFile("input.txt");
		f1.printItemCounts();
		f1.addLineCount();
	}
}
