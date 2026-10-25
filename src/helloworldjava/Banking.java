package helloworldjava;

public class Banking extends Maths {

	private double accountBalance = 0;
	private int accountNumber = 0;

	public Banking(final int accountNumber, final double accountBalance) {
		// TODO Auto-generated constructor stub
		this.accountBalance = accountBalance;
		setAccountNumber(accountNumber);
	}

	public double creditBalance(final double addBalance) {
		accountBalance = addition(accountBalance, addBalance);
		return accountBalance;
	}

	public double debitBalance(final double cashAmount) {
		var withdraw = 0.00;
		if (accountBalance >= cashAmount) {
			withdraw = cashAmount;
			accountBalance = substraction(accountBalance, withdraw);
		} else {
			withdraw = accountBalance;
		}
		return withdraw;
	}

	/**
	 * @return the accountNumber
	 */
	public int getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(final int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double showBalance() {
		return accountBalance;
	}
}
