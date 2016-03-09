package karaalp;
/*asks for 5 numbers and do stuff with it
 * Adem Karaalp
 * March 9 2016
 */

import java.util.Scanner;

public class ArtihmeticExcercise {

	public static void main(String[] args) {
		/* asks for 5 numbers and do stuff with it*/ 
		
		/* Variables*/
		int num1;
		int num2;
		int num3;
		int num4;
		int num5; 
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please add in a number");
		num1 = Integer.parseInt(scan.nextLine());
		System.out.println("Please add in a number");
		num2 = Integer.parseInt(scan.nextLine());
		System.out.println("Please add in a number");
		num3 = Integer.parseInt(scan.nextLine());
		System.out.println("Please add in a number");
		num4 = Integer.parseInt(scan.nextLine());
		System.out.println("Please add in a number");
		num5 = Integer.parseInt(scan.nextLine());
		
		System.out.println("the summ of all 5 numbers is " + (num1 + num2 + num3 + num4 + num5));
		System.out.println("subtracting the second number from the third is " + ( num2 - num3));
		System.out.println("Product of the fifth and first numbers is " + (num5 * num1));
		System.out.println("the quotient of the fourth number divided from the second number is " + ( num4/num2));
		System.out.println("the remainder from dividing the fourth and second number is " + (num4 % num2));
		System.out.println("the first number powered to the third number is " + ( Math.pow(num1, num3)));
		System.out.println("the square root of the fifth number is " + (Math.sqrt(num5)));




	}

}
