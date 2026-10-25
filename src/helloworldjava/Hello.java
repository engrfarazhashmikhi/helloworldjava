package helloworldjava;

//public class Hello extends Functions {
public class Hello {
	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		try {
			final var refresh = new JavaRefresh();
			System.out.format(Messages.getString("Hello.0"), refresh.toString()); //$NON-NLS-1$
		} catch (final Exception e) {
			// TODO: handle exception
			System.out.println(Messages.getString("Hello.1") + e.toString()); //$NON-NLS-1$
			System.out.println(Messages.getString("Hello.2") + e.toString()); //$NON-NLS-1$
		} finally {
			System.gc();
		}
	}

	public Hello() {
		final var greetings = Messages.getString("Hello.3"); //$NON-NLS-1$
		greetings.toString();
	}
}