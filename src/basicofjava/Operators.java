package basicofjava;

/**
 * Creating emi calculator.
 * 
 * @author DASHRATH
 * @version 8.0
 * @since
 */

public class Operators {

	public static void main(String[] args) {
		double loanAmount = 100000;
		double intrestRate = (double) 10 / (12 * 100); // Actual rate in percentage (10%)
		double tenure = 24; // Tenure is in month

		// Applied formula of emi
		double emi = (loanAmount * intrestRate * Math.pow(1 + intrestRate, tenure))
				/ (Math.pow(1 + intrestRate, tenure) - 1);
		System.out.print("Emi amount = " + emi );
	}

}