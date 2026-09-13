package helloworldjava;

//public class Hello extends Functions {
public class Hello extends Functions {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Hello hello = new Hello();
//			hello.typeCastingJava();
			hello.dataTypesJava();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error Occur: " + e.getMessage() + ".\n");
			System.err.println("Error Stack: " + e.getStackTrace() + ".\n");
		}
	}

	public Hello() {
		String greetings = "Assalam-O-Alaikum World From Java Programming Language";
		greetings.toString();
	}
}