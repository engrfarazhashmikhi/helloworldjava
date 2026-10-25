package helloworldjava;

public class MyException extends Exception {

	private static final long serialVersionUID = 1L;
	private final String greetings;

	public MyException() {
		// TODO Auto-generated constructor stub
		greetings = Messages.getString("MyException.0"); //$NON-NLS-1$
	}

	public MyException(final String customText) {
		// TODO Auto-generated constructor stub
		greetings = customText;
	}

	public String getGreetings() {
		return greetings;
	}
}
