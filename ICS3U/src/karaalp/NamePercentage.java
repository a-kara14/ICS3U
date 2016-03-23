package karaalp;
/* NamePercentage.java
 * this program asks for your name and 70% of the time says it their favourite and 30% hates it
 * Adem Karaalp		
 * March 23 2016
 */
import java.util.Scanner;



public class NamePercentage {

	public static void main(String[] args) {
		
		//variables
		int x;
		String name;
		
		x = (int) (Math.random() * 10);
		
		Scanner scan = new Scanner (System.in);
		
		//input
		System.out.println("What is your name?");
		name = scan.nextLine();
		
		//output
		if (x >= 0 && x < 3)
		{
			System.out.println("Your name is " + name + " and i hate it");
		}
		else if (x >= 3 || x <= 9)
		{
			System.out.println("Your name is " + name + " and i love it");
		}

	}

}
