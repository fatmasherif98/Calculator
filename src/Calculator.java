
public class Calculator {

	String[] history = new String[6];
	private int countI = -1;
	private int currentlyOnScreen = -1;

	public int getCountI() {
		return countI;
	}

	public void setCountI(int countI) {
		this.countI = countI;
	}

	public int getCurrentlyOnScreen() {
		return currentlyOnScreen;
	}

	public void setCurrentlyOnScreen(int currentlyOnScreen) {
		this.currentlyOnScreen = currentlyOnScreen;
	}

	public static void main(String[] args) {
	}
	// TODO Auto-generated method stub

	public double Operations(double firstNum, double secondNum, String operator) {

		double result = 0.0;
		switch (operator) {
		case "+":
			result = (firstNum + secondNum);
			break;

		case "-":
			result = (firstNum - secondNum);
			break;

		case "*":
			result = (firstNum * secondNum);
			break;
		case "/":
			result = (firstNum / secondNum);
			break;
		}

		return result;
	}

	public void history(String totalText) {
		this.countI++;
		this.currentlyOnScreen = this.countI % 6;
		history[(this.countI) % 6] = totalText;

	}

	public String previous() {

		if (this.currentlyOnScreen > 0) {
			if ((this.currentlyOnScreen - 1) != (this.countI % 6)) {

				this.currentlyOnScreen--;
				return history[this.currentlyOnScreen];
			} else
				return null;

		} else {
			if ((this.countI % 6) == 5)
				return null;
			else {
				this.currentlyOnScreen = 5;
				return history[5];
			}
		}

	}

	public String next() {
		if (this.currentlyOnScreen != (this.countI % 6)) {

			if (this.currentlyOnScreen < 5) {
				this.currentlyOnScreen++;
				return history[this.currentlyOnScreen];
			} else {
				this.currentlyOnScreen = 0;
				return history[this.currentlyOnScreen];
			}
		} else
			return null;
	}

	public String current() {
		if (this.countI != -1) {
			this.currentlyOnScreen = (this.countI % 6);
			return history[this.currentlyOnScreen];
		} else
			return null;
	}

	public boolean checkingInput(String input) {
		try {
			Double.parseDouble(input);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public String checkingExpression(String input, String firstNum) {

		if (input.equals(""))
			return "Please enter your Equation";
		if (input.indexOf("=") >= 0)
			return "Invalid Input";

		try {

			Double.parseDouble(input);
			return "special case";

		} catch (Exception ex) {
			if (firstNum == null)
				return "Syntax Error";
			else
				return null;
		}

	}

	public double negativeNumber(String totalText, String firstNumber, double SecondNum) {

		if (totalText.charAt(firstNumber.length() + 1) == '-') {
			SecondNum = SecondNum * -1;
		}
		return SecondNum;
	}

}
