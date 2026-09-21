package helloworldjava;

public class Person {
	private String personName;

	Person(String yourName) {
		this.personName = yourName.trim();
	}

	public void eat() {
		System.out.println(this.personName + " can Eat.");
	}

	public String getPersonName() {
		return this.personName;
	}

	public void talk() {
		System.out.println(this.personName + " can Talk.");
	}

	public void walk() {
		System.out.println(this.personName + " can Walk.");
	}
}
