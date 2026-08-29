package helloworldjava;

public class Hello extends Functions {
	public Hello() {
		String greetings = "Assalam-O-Alaikum World From Java Programming Language";
		this.display(greetings.toString());
	}
	public void display(Object obj) {
		System.out.println(obj);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Hello m = new Hello();
			m.display(m.toString());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error Occur: " + e.getMessage() + ".");
		}
	}
}