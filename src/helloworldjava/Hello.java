package helloworldjava;

//public class Hello extends Functions {
public class Hello extends Functions {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			JavaRefresh refresh = new JavaRefresh();
			refresh.JavaString();

		} catch (MyException e) {
			// TODO: handle exception
			System.out.println("Custom Exception: " + e.getGreetings().toString());
			System.out.println("Errr: " + e.toString());
		} finally {
			System.gc();
		}
	}

	public Hello() {
		String greetings = "Assalam-O-Alaikum World From Java Programming Language";
		greetings.toString();
	}
}