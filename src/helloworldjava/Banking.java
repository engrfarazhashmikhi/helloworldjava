package helloworldjava;

public class Banking {

	private double accountBalance = 0;
	private int accountNumber = 0;

	public Banking(int accountNumber, double accountBalance) {
		// TODO Auto-generated constructor stub
		this.accountBalance = accountBalance;
		this.accountNumber = accountNumber;
	}

	public double creditBalance(double addBalance) {
		this.accountBalance += addBalance;
		return this.accountBalance;
	}

	public double debitBalance(double cashAmount) {
		double withdraw = 0.00;
		if (this.accountBalance >= cashAmount) {
			withdraw = cashAmount;
			this.accountBalance -= withdraw;
		} else {
			withdraw = this.accountBalance;
		}
		return withdraw;
	}

	public double showBalance() {
		return this.accountBalance;
	}
}
