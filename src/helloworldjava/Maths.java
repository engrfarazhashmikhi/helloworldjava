package helloworldjava;

public class Maths extends BasicMath {
	private double answer;

	public Maths() {
		// TODO Auto-generated constructor stub
		answer = 0;
	}

	public double addition(final double val1, final double val2) {
		answer = val1 + val2;
		return answer;
	}

	public double division(final double val1, final double val2) {
		answer = val1 / val2;
		return answer;
	}

	public double multiplication(final double val1, final double val2) {
		answer = val1 * val2;
		return answer;
	}

	public double remainder(final double val1, final double val2) {
		answer = val1 % val2;
		return answer;
	}

	public double substraction(final double val1, final double val2) {
		answer = val1 - val2;
		return answer;
	}
}
