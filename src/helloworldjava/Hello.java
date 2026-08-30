package helloworldjava;

public class Hello extends Functions{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Hello hello = new Hello();
			hello.display(hello.getClass().toString());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error Occur: " + e.getMessage() + ".");
		}
	}

	// Instance variable
	int age = 30;

	public Hello() {
		String greetings = "Assalam-O-Alaikum World From Java Programming Language";
		this.display(greetings.toString());
	}

	public void checkAccess() {
		System.out.println(age); // Line C
//        System.out.println(rating); // Line D, Causes "COMPILE TIME ERROR" because "NO VARIABLE" of named "RATING" defined in this "METHOD"!
	}

	public void display(Object obj) {
		System.out.println(obj);
	}

	public void stringExample() {

		String word1 = "Java";
		String word2 = new String("Java");

		// Comparison A
		if (word1 == word2) {
			System.out.println("A is True");
		} else {
			System.out.println("A is False");
		}

		// Comparison B
		if (word1.equals(word2)) {
			System.out.println("B is True");
		} else {
			System.out.println("B is False");
		}
	}

	public void updateProfile() {
		// Local variable
		double rating = 4.5;

		System.out.println(age); // Line A
		System.out.println(rating); // Line B
	}
}
