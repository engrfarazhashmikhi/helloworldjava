package helloworldjava;

public class MyException extends Exception {

	private static final long serialVersionUID = 1L;
	private String greetings;

	public MyException() {
		// TODO Auto-generated constructor stub
		this.greetings = "Hello World";
	}

	public MyException(String customText) {
		// TODO Auto-generated constructor stub
		this.greetings = customText;
	}

	public String getGreetings() {
		return this.greetings;
	}
}
