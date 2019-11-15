package nz.ac.currency.convert;

import ecs100.UI;

public class GuessAMagicWord {

	public GuessAMagicWord()
	{
		UI.initialise();
		UI.addButton("Check Your Guess", this::checkGuess);
	}
	
	public void checkGuess()
	{
		String guess = UI.askString("Provide a guess word");
		while(!guess.equalsIgnoreCase("pumpkin"))
		{
			UI.println("Worng guess");
			guess= UI.askString("Please re-enter your guess word");
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GuessAMagicWord();
	}

}
