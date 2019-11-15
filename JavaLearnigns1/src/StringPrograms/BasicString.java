package StringPrograms;

public class BasicString {
	public void basicTopics()
	{
		System.out.println("----------------------------------------------------");
		// String Literal
		//Convert char array to String.
		//create a string using new keyword.
		String s1= "java";   // String Literal
		String s4="java";	// s1,s4 refer to same object in heap
		char ch[]= {'l','e','a','r','n',' ','j','a','v','a'};
		String s2 =new String(ch);   //Convert char array to String.
		String s5=new String(ch);   // creates object s2 ,s5 are not referring to same object
		String s3=new String("hello String world");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);		
	}
	
	public void noOfVowels(String str1)
	{
		System.out.println("----------------------------------------------------");
		//get String and find length of string
		//convert to lowercase 
		// use for loop and charAt() to validate and modify count
		char ch;
		int count=0;
		System.out.println("content of the string "+str1);
		int lenghtStr1=str1.length();				//lenght() gives length of the string
		System.out.println("The lenght of string1 :: "+lenghtStr1);
		String lowerCaseStr1=str1.toLowerCase();  // convert to lower
		for(int i=0;i<lenghtStr1;i++)
		{
			ch=lowerCaseStr1.charAt(i);
			if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u')
			{
				count++;
			}
		}
		System.out.println("No of vowels in a string :: " +count);
		
	}
	
	public void noOfCons(String str2)
	{
		System.out.println("----------------------------------------------------");
		//get String and find length of string
		//convert to lowercase 
		// use for loop and charAt() to validate and modify count
		char ch;
		int count=0;
		System.out.println("content of the string "+str2);
		int lenghtStr1=str2.length();				//lenght() gives length of the string
		System.out.println("The lenght of string1 :: "+lenghtStr1);
		String lowerCaseStr1=str2.toLowerCase();  // convert to lower
		for(int i=0;i<lenghtStr1;i++)
		{
			ch=lowerCaseStr1.charAt(i);
			if( (ch>='a' && ch<='z')&& !(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u'))// checks vowel and space
			{
				count++;
			}
		}
		System.out.println("No of consonants in a string :: " +count);
		
	}
	public void noOfOtherChar(String str3)
	{
		System.out.println("----------------------------------------------------");
		char ch;
		int count=0;
		System.out.println("content of the string "+str3);
		int lenghtStr1=str3.length();				//lenght() gives length of the string
		System.out.println("The lenght of string1 :: "+lenghtStr1);
		String lowerCaseStr3=str3.toLowerCase();  // convert to lower
		for (int i=0;i<lenghtStr1;i++)			// to get every character in the string 
		{
			ch= lowerCaseStr3.charAt(i);			// ch as a character at i index of string
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
		System.out.println("no of char in str3    ::    "+count);
	}
	
	public void stringReverse(String strR4)
	{
		System.out.println("----------------------------------------------------");
	
	    String strRev1="";
		System.out.println("Reverse a string using charAT");
		int l=strR4.length();
		for (int i=l-1;i>=0;i--)
		{
			strRev1=strRev1+strR4.charAt(i);		    // eg:  Books--> skooB --> s+k+o+oB
		}
		System.out.println("The lenght of string strR is "+l);
		System.out.println("The actual string is "+strR4);
		System.out.println("The reverse of the string :: "+strRev1);
	}
	
	
	public void compareStrings()
	{
		System.out.println("----------------------------------------------------");
		System.out.println("CompareStrings");
		String str1 = "apple", str2="APPLE";
		if (str1.compareTo(str2)==0)
		{
			System.out.println("Equal");
		}
		else if (str1.compareTo(str2)<0)
		{
			System.out.println("str1 is lower than str2");
		}
		else if (str1.compareTo(str2)>0)
		{
			System.out.println("str1 is greater than str2");
		}
	}
	public void concatStrings()
	{
		System.out.println("----------------------------------------------------");
		System.out.println("concatStrings");
		String s1="java string";  
		s1.concat("is immutable");  // it don't work    
		System.out.println(s1);  
		// Concatenating one string   
		String s2= s1.concat(" is immutable so assign it explicitly");  //---> check this
		System.out.println(s2);  
		// Concatenating multiple strings 
		String s3="............";
        String s4 = s1.concat(" ").concat(s2).concat(s3);  
        System.out.println(s4);
	}
	public void containString()
	{
		System.out.println("----------------------------------------------------");
		System.out.println("concatStrings");
		String s1="java string!";  
		if(s1.contains("!"))
		{
			System.out.println("has a ! symbol");
		}
		else
		{
			System.out.println("Normal String");
		}
	}
	public void EndsWith()
	{
		String str1=new String("book contains hundred pages");
		String str2= new String("bottle on the table!");
		String str3=new String("passWord ");
		
		System.out.println(str1.endsWith("pages"));
		System.out.println(str2.endsWith("!"));
		System.out.println(str3.endsWith(" "));
		
		
		
	}
	public static void main(String[] args) {
		BasicString b=new BasicString();
		b.basicTopics();
		b.noOfVowels("Blue berry farm is apple farm");
		String str2="Method to check consonants";
		b.noOfCons(str2);
		String str3="number1234 Special char !@#$%^"; //Special char
		b.noOfOtherChar(str3);		
		String str4=new String("Book is on the table");
		b.stringReverse(str4);  
		b.compareStrings();
		b.concatStrings();
		b.containString();
				
	}

}
