package karaalp;

/*QuadraticEquation.java
 * This program uses the quadratic formula
 * Adem Karaalp
 * March 21, 2016
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class QuadrationEquation {

	public static void main(String[] args) {
		
		//variables
		double a, b, c, x, y;
		
		Scanner scan = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		//input
		System.out.println("Please add in a number");
		a = Double.parseDouble(scan.nextLine());
		System.out.println("Please add in a number");
		b = Double.parseDouble(scan.nextLine());
		System.out.println("Please add in a number");
		c = Double.parseDouble(scan.nextLine());

		x = ( -b + (Math.sqrt(Math.pow(b, 2) - 4 * a * c)))/(2*a);
		y = ( -b - (Math.sqrt(Math.pow(b, 2) - 4 * a * c)))/(2*a);
		
		//output
		if (Math.pow(b, 2) - 4 * a * c < 0)
		{ 
			System.out.println("There is no roots");
		}
		else if (Math.pow(b, 2) - 4 * a * c == 0)
		{ 
			System.out.println("there is only one root and it is " + df.format(x));
		}
		else 
		{
			System.out.println("the roots are " + df.format(x) + " and " + df.format(y));
		}
	}

}

