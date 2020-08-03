package application;

public class Model {
	public float calculate(long number1, long number2, String operator) {
		
		switch(operator) {
		case "+":
			return (float)number1 + (float)number2;
		case "-":
			return (float)number1 - (float)number2;
		case "/":
			if (number2 == 0)
				return 0;
			return (float)number1 / (float)number2;
		case "*":
			return (float)number1 * (float)number2;
		default:
			return 0;
		}
	}
	
	public float calc_log(long number1) {
		return (float) Math.log(number1);
	}
}
