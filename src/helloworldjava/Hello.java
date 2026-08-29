package helloworldjava;

public class hello extends functions {
	public hello() {
		String greetings = "Assalam-O-Alaikum World From Java Programming Language";
		this.display(greetings.toString());
	}
	public void display(Object obj) {
		System.out.println(obj);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			hello m = new hello();
			m.display(m.toString());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error Occur: " + e.getMessage() + ".");
		}
	}
}