package karaalp;
/*IfProgram.java
 * checks if the number inputed is positive or negative and checks if its divisible by 7
 * Adem Karaalp
 * March 22, 2016 
 */

import java.util.Scanner;

public class IfProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
		int Number;
		
		Scanner scan = new Scanner (System.in);
		
		//input
		System.out.println("Choose any number");
		Number = Integer.parseInt(scan.nextLine());
		
		//output
		if (Number > 0)
		{ 
			System.out.println("Your number is a positive number");
		}
		else
		{
			System.out.println("Your number is a negative number");
		
		}
		
		if (Number % 7 == 0)
		{
			System.out.println("Your number can be divided by 7");
		}
		else 
		{
			System.out.println("Your number cannot be divided by 7");
		}
		
		System.out.println("Your number is " + Number);
	}

}
