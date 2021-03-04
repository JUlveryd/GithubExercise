package handledning2;

public class Operations {

	private double result;

	public double calcOp(double a, double b, int c) {

		if (c == 1) {
			// System.out.println("Addition");
			result = a + b;

		}

		else if (c == 2) {
			result = a - b;

		}

		else if (c == 3) {
			result = a * b;

		}

		else if (c == 4) {
			result = a / b;

		}
		return result;

	}

}
