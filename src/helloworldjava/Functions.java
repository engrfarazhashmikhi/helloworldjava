package helloworldjava;

import java.util.Scanner;

public class Functions extends JavaRefresh {
	public double calcuateNetProfit(double revenue, double expenses) {
//		Net Profit Formula: (Total Revenue - Total Expenses)
		double Net_Profit = (revenue - expenses);
		return Net_Profit;
	}

	public double returns_of_investement() {
//		ROI	Formula: (Net_Profit / Investment * 100)
		double Net_Profit = (this.calcuateNetProfit(Double.parseDouble(this.userInput("Enter Revenue Amount: ")),
				Double.parseDouble(this.userInput("Enter Expenses Amount: "))));
		double Total_Investment = Double.parseDouble(this.userInput("Enter Investment Amount: "));
		double ROI = ((Net_Profit / Total_Investment) * 100);
		return ROI;
	}

	public String userInput(String statement) {
		System.out.println(statement);
		Scanner scan = new Scanner(System.in);
		String getUserInput = scan.next();
		return getUserInput;
	}
}
