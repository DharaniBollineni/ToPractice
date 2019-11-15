package WeekTwo;

import ecs100.UI;

public class automaticSieve {

	public automaticSieve() {
		// TODO Auto-generated constructor stub
		UI.addButton("Get info and auto check the prime or dnot", this::addNumCheckSieve);
		// addButton(

	}

	public void addNumCheckSieve() {
		boolean isPrime = false;
		int number = UI.askInt("Enter a number ");// to check whether it is a prime number or not :: other then 0 or 1
		// Note: 0 and 1 are not prime numbers. 2 is the only even prime number.
		if (number > 1) {
			for (int i = 2; i < number; i++) // exclude 1 and n number to find
			{
				if (number % i == 0) // check reminder is 0.. if so not a prime
				{
					isPrime = true;
					UI.println("number is not prime  ::" + number);
					break;
				}
			}
			if (!isPrime) // to print the result
			{
				UI.println("number is prime number :: " + number);
			}
		} else {
			UI.println("Given number is not valied");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new automaticSieve();
	}

}
