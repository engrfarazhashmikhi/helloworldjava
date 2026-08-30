package helloworldjava;

public class Maths {
	private double answer;
	public Maths() {
		// TODO Auto-generated constructor stub
		this.answer = 0;
	}
	public double addition(double val1, double val2) {
		answer = val1 + val2;
		return answer;
	}

	public double substraction(double val1, double val2) {
		answer = val1 - val2;
		return answer;
	}
	public double multiplication(double val1, double val2) {
		answer = val1 * val2;
		return answer;
	}
	public double division(double val1, double val2) {
		answer = val1 / val2;
		return answer;
	}
	public double remainder(double val1, double val2) {
		answer = val1 % val2;
		return answer;
	}
}
