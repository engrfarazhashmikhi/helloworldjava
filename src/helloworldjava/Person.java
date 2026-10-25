package helloworldjava;

public class Person {
	private final String personName;

	Person(final String yourName) {
		personName = yourName.trim();
	}

	public void eat() {
		System.out.println(personName + Messages.getString("Person.0")); //$NON-NLS-1$
	}

	public String getPersonName() {
		return personName;
	}

	public void talk() {
		System.out.println(personName + Messages.getString("Person.1")); //$NON-NLS-1$
	}

	public void walk() {
		System.out.println(personName + Messages.getString("Person.2")); //$NON-NLS-1$
	}
}
