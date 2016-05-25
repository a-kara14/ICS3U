package karaalp;

/**
 * This program takes in two numbers and does all the simple maths with the numbers entered
 * 
 * @author Adem Karaalp
 * @version May 25 2016
 */
import java.text.DecimalFormat;

import java.util.Scanner;

public class FunWithMath2 {
	public static DecimalFormat df = new DecimalFormat("0.0");

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers (a and b)");
		double num1 = scan.nextInt();
		double num2 = scan.nextInt();

		System.out.println("a*b=" + (df.format(multiply(num1, num2))));
		System.out.println("a/b=" + (df.format(divide(num1, num2))));
		System.out.println("a-b=" + (df.format(subtract(num1, num2))));
		System.out.println("a+b=" + (df.format(add(num1, num2))));

	}

	/**
	 * This method multiplies num1 with num2
	 * 
	 * @param num1
	 *            double
	 * @param num2
	 *            double
	 * @return The string to print
	 */
	public static double multiply(double num1, double num2) {
		double total = num1 * num2;
		return total;
	}

	/**
	 * This method adds num1 and num2
	 * 
	 * @param num1
	 *            double
	 * @param num2
	 *            double
	 * @return The string to print
	 */
	public static double add(double num1, double num2) {
		double total = num1 + num2;
		return total;
	}

	/**
	 * This method divides num1 with num2
	 * 
	 * @param num1
	 *            double
	 * @param num2
	 *            double
	 * @return The string to print
	 */
	public static double divide(double num1, double num2) {
		double total = num1 / num2;
		return total;
	}

	/**
	 * This method subtracts num1 with num2
	 * 
	 * @param num1
	 *            double
	 * @param num2
	 *            double
	 * @return The string to print
	 */
	public static double subtract(double num1, double num2) {
		double total = num1 - num2;
		return total;
	}

}
