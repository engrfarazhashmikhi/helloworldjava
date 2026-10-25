package helloworldjava;

import java.util.Scanner;

public class Functions extends JavaRefresh implements BasicFunctions {

	// Instance variable
	int age = 30;
	Scanner scans;
	String status;

	public double calcuateNetProfit(final double revenue, final double expenses) {
		return revenue - expenses;
	}

	public void checkAccess() {
		System.out.println(age); // Line C
//        System.out.println(rating); // Line D, Causes "COMPILE TIME ERROR" because "NO VARIABLE" of named "RATING" defined in this "METHOD"!
	}

	public void display(final Object obj) {
		System.out.println(obj);
	}

	public double returns_of_investement() {
//		ROI	Formula: (Net_Profit / Investment * 100)
		scans = new Scanner(System.in);
		final var Net_Profit = calcuateNetProfit(
				Double.parseDouble(userInput(Messages.getString("Functions.0"), scans)), //$NON-NLS-1$
				Double.parseDouble(userInput(Messages.getString("Functions.1"), scans))); //$NON-NLS-1$
		final var Total_Investment = Double.parseDouble(userInput(Messages.getString("Functions.2"), scans)); //$NON-NLS-1$
		return Net_Profit / Total_Investment * 100;
	}

	@Override
	public String start() {
		status = Messages.getString("Functions.3"); //$NON-NLS-1$
		return status;
	}

	@Override
	public String stop() {
		status = Messages.getString("Functions.4"); //$NON-NLS-1$
		return status;
	}

	public void updateProfile() {
		// Local variable
		final var rating = 4.5;

		System.out.println(age); // Line A
		System.out.println(rating); // Line B
	}

	public String userInput(final String statement, final Scanner scan) {
		System.out.println(statement);
		var getUserInput = Messages.getString("Functions.5"); //$NON-NLS-1$
		try {
			getUserInput = scan.nextLine();
		} catch (final Exception e) {
			// TODO: handle exception
			getUserInput = e.getMessage();
		}
		return getUserInput;

	}
}
