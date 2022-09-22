
public class Calc {

	public int add(int... numbers) {

		int sum = 0;
		for (int number : numbers) {

			sum += number;
		}
		return sum;
	}

	public int sub(int number1, int number2) {

		int sum=number1-number2;
		return sum;
	}

	public int mult(int... numbers) {

		int sum = 1;
		for (int number : numbers) {

			sum = sum * number;
		}
		return sum;
	}



}
