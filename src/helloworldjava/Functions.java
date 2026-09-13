package helloworldjava;

import java.util.Scanner;

public class Functions extends JavaRefresh implements BasicFunctions {

	// Instance variable
	int age = 30;

	String status;

	public double calcuateNetProfit(double revenue, double expenses) {
//		Net Profit Formula: (Total Revenue - Total Expenses)
		double Net_Profit = (revenue - expenses);
		return Net_Profit;
	}

	public void checkAccess() {
		System.out.println(age); // Line C
//        System.out.println(rating); // Line D, Causes "COMPILE TIME ERROR" because "NO VARIABLE" of named "RATING" defined in this "METHOD"!
	}

	public void display(Object obj) {
		System.out.println(obj);
	}

	public double returns_of_investement() {
//		ROI	Formula: (Net_Profit / Investment * 100)
		double Net_Profit = (this.calcuateNetProfit(Double.parseDouble(this.userInput("Enter Revenue Amount: ")),
				Double.parseDouble(this.userInput("Enter Expenses Amount: "))));
		double Total_Investment = Double.parseDouble(this.userInput("Enter Investment Amount: "));
		double ROI = ((Net_Profit / Total_Investment) * 100);
		return ROI;
	}

	@Override
	public String start() {
		status = "STARTED";
		return status;
	}

	@Override
	public String stop() {
		status = "STOPPED";
		return status;
	}

	public void updateProfile() {
		// Local variable
		double rating = 4.5;

		System.out.println(age); // Line A
		System.out.println(rating); // Line B
	}

	public String userInput(String statement) {
		System.out.println(statement);
		String getUserInput = "";
		try (Scanner scan = new Scanner(System.in)) {
			getUserInput = scan.next();
		} catch (Exception e) {
			// TODO: handle exception
			getUserInput = (e.getMessage());
		}
		return getUserInput;

	}
}
