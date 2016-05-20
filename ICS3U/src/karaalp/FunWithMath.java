package karaalp;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * This program takes in two numbers and does the 4 simple maths with them
 * @author Adem Karaalp
 *@version May 20 2016
 */

public class FunWithMath {
public static DecimalFormat df=new DecimalFormat("0.0");
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
			System.out.println("Please enter two numbers in the same row but have a space between them (a and b)");
			int num1=scan.nextInt();
			int num2=scan.nextInt();
			multiply(num1,num2);
			add(num1,num2);
			divide(num1,num2);
			subtract(num1,num2);

		
	}
	
	public static void multiply (double num1, double num2)
	{
		System.out.println("a*b="+(df.format(num1*num2)));
	}
	/**
	 * This method adds the two numbers
	 * @param num1 double
	 * @param num2 double
	 */
	public static void add (double num1, double num2)
	{
		System.out.println("a+b="+(df.format(num1+num2)));
	}
	/**
	 * This method divides the first number by the second number
	 * @param num1 double
	 * @param num2 double
	 */
	public static void divide (double num1, double num2)
	{
		System.out.println("a/b="+(df.format((double)num1/(double)num2)));
	}
	/**
	 * This method subtracts the first number from the second number
	 * @param num1 double
	 * @param num2 double
	 */
	public static void subtract (double num1, double num2)
	{
		System.out.println("a-b="+(df.format(num1-num2)));
	}

}