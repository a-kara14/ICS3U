package karaalp;

import java.util.Scanner;

/*NameList.java
 * Lists names that user entered
 * Adem Karaalp
 * April 26/2016
 */
public class NameList {

	public static void main(String[] args) {
		
		//input
		Scanner scan = new Scanner (System.in);
		System.out.println("How many names do you want?");
		
		//arrays
		int numNames = Integer.parseInt(scan.nextLine());
		
		String [] names = new String [numNames];
		
		//output
		System.out.println("Enter all the names you want");
		for (int i=0; i<numNames; i++)
		{
			names[i] = scan.nextLine();
		}
		
		System.out.println("These are the names you entered");
		for (int i=0; i<numNames; i++)
		{
			System.out.println(names[i]);
		}

		System.out.println("Now the names from last to first");
		for (int i=numNames-1; i>=0; i-- )
		{
			System.out.println(names[i]);
		}
	}

}
