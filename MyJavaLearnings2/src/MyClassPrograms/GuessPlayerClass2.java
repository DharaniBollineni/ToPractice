package MyClassPrograms;

public class GuessPlayerClass2 
{
	GuessMeClass1 guessObj;
	
	GuessPlayerClass2(int localValue)
	{
		guessObj= new GuessMeClass1(localValue);
		
	}

	void tryGuessing()
	{
		int i=0;
		while(!guessObj.guessMeMethodClass1(i))
		{
			i++;
		}
		System.out.println("the guess value is "+i);
		System.out.println("counterNumber is " +guessObj.counterNumber);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int urValue= (int)Math.round(Math.random() *100000);
		GuessPlayerClass2 playerObject1 = new GuessPlayerClass2(-urValue);
		playerObject1.tryGuessing();
	//	System.out.println("counterNumber is " +GuessMeClass1.counterNumber);
		
		GuessPlayerClass2 playerObject2 = new GuessPlayerClass2(100);
		playerObject2.tryGuessing();
		
	}

}
