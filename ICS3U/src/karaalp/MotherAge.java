package karaalp;

/*MotherAge.java
 * this program finds the age of the mother when the child was born
 * Adem Karaalp
 * March 9 2016
 */

import java.util.Scanner;

public class MotherAge {

	public static void main(String[] arges) {
		
		// the program asks for the age of the mother and the kid
		// the program asks for their names
		// then the program finds the age of the mother when the kid was born
		
		/* variables*/
		int motherBirthYear;
		int kidBirthYear;
		int motherAge;
		String motherName;
		String kidName;
		
		Scanner scan = new Scanner(System.in);
		
		/* Processing*/
		System.out.println("What is your mothers name?");
		motherName = scan.nextLine();
		System.out.println("What is your mothers birthyear?");
		motherBirthYear = Integer.parseInt(scan.nextLine());
		System.out.println("What is the kids name?");
		kidName = scan.nextLine();
		System.out.println("What is the kids's birth year?");
		kidBirthYear = Integer.parseInt(scan.nextLine());
		motherAge = kidBirthYear - motherBirthYear;
		
		/*Output*/
		System.out.println("The mother name is " + motherName);
		System.out.println("The mother's birth year is " + motherBirthYear);
		System.out.println("The kids name is "+ kidName);
		System.out.println("the kid's birth year is " + kidBirthYear);
		System.out.println("The mothers age when the kid was born is " + motherAge);
	}
	
}

