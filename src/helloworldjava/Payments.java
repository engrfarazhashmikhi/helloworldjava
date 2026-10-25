package helloworldjava;

public abstract class Payments implements BasicFunctions {
	private String cash;

	public Payments() {
		// TODO Auto-generated constructor stub
	}

	public String CashIn() {
		cash = Messages.getString("Payments.0"); //$NON-NLS-1$
		return cash;
	}

	public String CashOut() {
		cash = Messages.getString("Payments.1"); //$NON-NLS-1$
		return cash;
	}
}
