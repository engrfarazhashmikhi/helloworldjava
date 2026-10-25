package helloworldjava;

public class BasicMath {
	public void generalMath() {
		final var PI = Math.PI;
		System.out.format(Messages.getString("BasicMath.0"), PI); //$NON-NLS-1$
		System.out.format(Messages.getString("BasicMath.1"), Math.sqrt(PI)); //$NON-NLS-1$
		System.out.format(Messages.getString("BasicMath.2"), Messages.getString("BasicMath.3"), PI + PI); //$NON-NLS-1$ //$NON-NLS-2$
		System.out.format(Messages.getString("BasicMath.4"), Math.sin(PI)); //$NON-NLS-1$
	}
}
