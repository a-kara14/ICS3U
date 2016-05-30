package karaalp;

import java.util.Scanner;
/**
 * This program asks for a number and tells you if its a prime number or not
 * @author Adem Karaalp
 *@version May 30 2016
 */

public class isPrime {

	// global variable
	public static int x;

	public static void main(String[] args) {
		// scanner
		Scanner scan = new Scanner(System.in);

		// input 
		System.out.println("Enter a number to know if its a prime number or not");
		x = scan.nextInt();

		//outputs
		if (isPrime(x)) {
			System.out.println("Your number " + x + " is a prime number");
		} else {
			System.out.println("Your number " + x + " is not a prime number");
		}

	}
/**
 * this method checks if x has a remainder
 * @param x
 * @param i
 * @return
 */
	public static boolean isDivisible(int x, int i) {

		if (x % i == 0) {
			return (true);
		}

		return (false);

	}
/**
 * this method checks if the number is a prime number
 * @param x
 * @return
 */
	public static boolean isPrime(int x) {
		if (x == 0 || x == 1) {
			return (false);
		}

		for (int i = 2; i < x; i++) {
			if (isDivisible(x, i) == true) {
				return (false);
			}
		}
		return (true);
	}

}