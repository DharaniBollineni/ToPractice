package nz.ac.currency.convert;

/** program to convert inches to centimeter */
import ecs100.*; // import jar files

public class CurrencyConverstionInfo {
	public double todaysRate;

	public CurrencyConverstionInfo() { // Constructor declaration to setup interface
		UI.initialise();
		UI.addButton("Get todays rate", this::getRate);
		UI.addButton("NZD to USD", this::nzdUsd);
		UI.addButton("USD to NZD", this::usdNzd);
	}

	public void getRate() // Method declaration to convert NZD to USD
	{
		todaysRate = UI.askDouble("Enter todays rate");
		UI.println("todays rate is " + todaysRate);
	}

	public void nzdUsd() // Method declaration to convert NZD to USD
	{
		if (todaysRate != 0) {
			double nzd = UI.askDouble("Enter NZD");
			double usd = nzd * todaysRate;
			// double rnnd=(math )
			UI.println("converted to" + usd);
			// double
		} else
			UI.println("please enter todays rate");

	}

	public void usdNzd() { // Method declaration to convert USD to NZD
		if (todaysRate != 0) {
			double usd = UI.askDouble("Enter USD");
			double nzd = usd * todaysRate;
			UI.println("converted to" + nzd);
		} else
			UI.println("please enter todays rate");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CurrencyConverstionInfo();
	}

}
