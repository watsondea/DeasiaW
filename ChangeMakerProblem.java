package Week1Thursday;

import java.util.Scanner;

public class ChangeMakerProblem {

	public static void main(String[] args) {
		// Declare variables.
		double moneyReceived;
	
		//create scanner 
		Scanner input = new Scanner(System.in);
		
		//collect input from user
		 System.out.print("Enter amount to be converted: ");

		moneyReceived = input.nextInt();
		
		// Print number of quarters and update the amount of moneyReceived.
		moneyReceived = getQuarters(moneyReceived);
		
		// Print number of dimes and update the amount of moneyReceived.
		moneyReceived = getDimes(moneyReceived);
		
		// Print number of nickles and update the amount of moneyReceived.
				moneyReceived = getNickles(moneyReceived);
			
				// Print number of pennies and update the amount of moneyReceived.
				moneyReceived = getPennies(moneyReceived);
				
				input.close();
	}
	
	public static double getQuarters(double moneyReceived) {
		// Get number of quarters and save change.
		double change = moneyReceived % 25;
		double quarters = (moneyReceived - change) / 25;
		System.out.println("You have " + (int)(quarters) + " quarters.");
		return change;
	}
	
	public static double getDimes(double moneyReceived) {
		// Get number of dimes and save change.
		double change = moneyReceived % 10;
		double dimes = (moneyReceived - change) / 10;
		System.out.println("You have " + (int)(dimes) + " dimes.");
		return change;
	}
	public static double getNickles(double moneyReceived) {
		// Get number of nickles and save change.
		double change = moneyReceived % 5;
		double nickles = (moneyReceived - change) / 5;
		System.out.println("You have " + (int)(nickles) + " nickles");
		return change;
}
	public static double getPennies(double moneyReceived) {
		// Get number of pennies and save change.
		double change = moneyReceived % 1;
		double pennies = (moneyReceived - change) / 1;
		System.out.println("You have " + (int)(pennies) + " pennies");
		return change;
}
	
}