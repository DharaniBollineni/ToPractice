package nz.ac.currency.convert;

import ecs100.UI;

public class LenghtOfSentence {
	public String str1="This is my 1st string program with !$%",str2;
	//public String strPal=madam,
	public String strRev1,strRev2,strRev3, strR="q1: what tree is it?";
	
	public int lenghtStr1, lenghtStr2, lenghtStrPal,lenghtStrRev;
	public LenghtOfSentence()
	{
		UI.initialise();
		//UI.addButton("Get the sentence a string", this::getString); 
		//UI.addButton("Lenght of the String", this::lengthOfString);
		UI.addButton("Number of vowels", this::noOfVowels);
		UI.addButton("Number of consonants", this::noOfCons);
		UI.addButton("Number of other characters", this::noOfOtherChar);
		UI.addButton("Reverse of a string", this::stringReverse);
		UI.addButton("palindrome", this::palindrome);
	}
	
	/*public void getString()
	{
		UI.println("Enter the string");
		
	}
	public void lengthOfString()
	{
		
	}*/
	
	public void noOfVowels()
	{
		char ch;
		int count=0;
		UI.println("content of the string "+str1);
		lenghtStr1=str1.length();				//lenght() gives length of the string
		UI.println("The lenght of string1 :: "+lenghtStr1);
		String lowerString=str1.toLowerCase();
		for (int i=0;i<lenghtStr1;i++)			// to get every character in the string 
		{
			ch= lowerString.charAt(i);			// ch as a charecter at i index of string
			if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u')
			{
				count++;
			}

		}
		UI.println("No of vowels in a string :: " +count);
		lenghtStr1=0;
		
	}
	public void noOfCons()
	{
		char ch;
		int count=0;
		UI.println("content of the string "+str1);
		lenghtStr1=str1.length();				//lenght() gives length of the string
		UI.println("The lenght of string1 :: "+lenghtStr1);
		UI.println("lenght of the string is :: "+lenghtStr1);
		String lowerString=str1.toLowerCase();
		for (int i=0;i<lenghtStr1;i++)			// to get every character in the string 
		{
			ch= lowerString.charAt(i);			// ch as a character at i index of string
			if( (ch>='a' && ch<='z')&& !(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u'))
			{
				//UI.println("count "+count);
				count++;
			}

		}
		UI.println("No of consonants in a string" +count);
		
		
	}
	public void noOfOtherChar()
	{
		char ch;
		int count=0;
		UI.println("content of the string "+str1);
		UI.println("The lenght of string1"+lenghtStr1);
		lenghtStr1=str1.length();				//lenght() gives length of the string
		UI.println("lenght of the string is :: "+lenghtStr1);
		String lowerString=str1.toLowerCase();
		for (int i=0;i<lenghtStr1;i++)			// to get every character in the string 
		{
			ch= lowerString.charAt(i);			// ch as a character at i index of string
			if (!(ch>='a' && ch<='z'))
			{
				if (ch>='1' && ch<='9')
				{
					count++;
				}
				else if (ch>=' ')
				{
					count++;
				}
				else 
				{
					count++;
				}
			}

		}
		UI.println("No of special characters in a string :: " +count);
		
	}
	public void stringReverse()
	{
	
	//	UI.println("Reverse a string using reverse method");
		strRev1="";
		UI.println("Reverse a string using charAT");
		int l=strR.length();
		for (int i=l-1;i>=0;i--)
		{
			strRev1=strRev1+strR.charAt(i);		
		}
		UI.println("The lenght of string strR is "+l);
		UI.println("The actual string is "+strR);
		UI.println("The reverse of the string :: "+strRev1);
	}
	public void palindrome()
	{
		String strPal1="",strPal=UI.askString("Enter the string to check whether it is a palindrome or not ");
		int lStrP=strPal.length();
		String lowStrPal= strPal.toLowerCase();
		for (int i=lStrP-1;i>=0;i--)
		{
			strPal1= strPal1+lowStrPal.charAt(i);
		}
		if(strPal1.equals(lowStrPal))
		{
			UI.println("The given string is palindrome");
		}
		else
		{
			UI.println("the given string is not a palindrome");
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LenghtOfSentence();

	}

}
