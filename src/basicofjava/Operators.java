package basicofjava;

/**
 * Creating EMI calculator.
 * 
 * @author DASHRATH
 * @version 8.0
 * @since
 */

public class Operators {

	public static void main(String[] args) {
		double loanAmount = 100000;
		double intrestRate = (double) 10 / (12 * 100); // Actual Rate In Percentage (10%)
		double tenure = 24; // in month

		// Applied Formula Of EMI
		double emi = (loanAmount * intrestRate * Math.pow(1 + intrestRate, tenure))
				/ (Math.pow(1 + intrestRate, tenure) - 1);

		System.out.print("Emi Amount = " + emi + "");

	}

}
