package helloworldjava;

public abstract class Payments implements BasicFunctions {
	private String cash;

	public Payments() {
		// TODO Auto-generated constructor stub
	}

	public String CashIn() {
		cash = "CASH Received";
		return cash;
	}

	public String CashOut() {
		cash = "Change Paid";
		return cash;
	}
}
