package karaalp;

import java.util.Scanner;

/* DiceGame.java
 * this program roles two dice one for the user and one for the com and who won
 * Adem Karaalp
 * March23,2016
 */


public class DiceGame {
	
	public static void main(String[] args) {
	
		//variables
		String name;
		int dice1;
		int dice2;
		int dice3;
		int dice4;
		int user;
		int com;
		
		Scanner scan = new Scanner (System.in);
		
		//input
		System.out.println("Whats is your name?");
		name = scan.nextLine();
	
		dice1 = (int)(Math.random() * 6) + 1;
		dice2 = (int)(Math.random() * 6) + 1;
		dice3 = (int)(Math.random() * 6) + 1;
		dice4 = (int)(Math.random() * 6) + 1;
	
		user = dice1 + dice2;
		com = dice3 + dice4;
		
		//output
		if (user > com)
		{
			System.out.println("you won, congrats "+ name);
		}
		else if (com > user)
		{ 
			System.out.println("You Lost " + name);
		}
	
}
}