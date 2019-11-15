/*
 * UserDefine exception 
 * 1. class must extends exception.
 * 2. condition for selfRising the exception.
 * 3. create object using new keyword
 * 4. throw keyword throws the reference of the object to catch block
 * 5. class name in catch block 
 */



import java.util.*;
public class UserDefineException extends Exception   //(1)
{
	public static void main(String[] arg) throws UserDefineException  // check this
	{
		Scanner s = new Scanner(System.in);
		while(true)             // until valid input
		{
		try{
			System.out.println("Enter the rno:");
			String rno=s.nextLine();
			if(rno.length()!=10)
			{
				throw new UserDefineException(); //4
			}
			System.out.println("rno"+rno);
			break;
		}
		catch(UserDefineException ob)
		{
			System.out.println("Invalid rno please enter");
		}
		}

	}

	

}
