package helloworldjava;

public class hello extends functions {
	public void display() {
		String greetings = "Assalam-O-Alaikum World From Java Programming Language";
		System.out.println(greetings);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			hello m = new hello();
			m.display();
			System.out.print("Net Prohit: " + m.calcuateNetProfit(1000, 500));
			m.NonPrimitive();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error Occur: " + e.getMessage() + ".");
		}
	}
}