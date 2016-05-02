package karaalp;
/*GuessGama.java
 * In this program the computer guesses what your thinking of and it has 20 tries after 20 tries it gives up and loses
 * Adem Karaalp
 * May 2,2016
 */

import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//the teams the computer guesses
		String[] guess = new String[] { "Fenerbahce", " Galatasaray", "Besiktas", "Trabzonspor", "Barcalona",
				"Real Madrid", "Atletico Madrid", "Manchester United", "Manchester City", "Liverpool", "Chelsea",
				"Arsenal", "Juventus", "AC Milan", "Inter Milan", "Napoli", "Paris Saint German", "AS Monaco",
				"Bayern Munich", "Borrusia Dorthmund" };
		boolean[] comGuess = new boolean[20];
		String answer = null;
		int y; // random number

		System.out.println("Hello I am the computer and lets play a guessing game, Think of a soccer team");
		System.out.println("You ready?");
		answer = scan.nextLine();
		
		
		if (answer.equalsIgnoreCase("yes")) {
			System.out.println("Alright lets start");
			//loop
			for (int i = 19; i > -1; i--) {
				y = (int) (Math.random() * guess.length);
				while (comGuess[y]) {
					y = (int) (Math.random() * guess.length);
				}
				if (!comGuess[y]) {
					System.out.println("Is the team your thinking of " + guess[y] + "? (Yes or No)");
					answer = scan.nextLine();

					if (answer.equalsIgnoreCase("yes")) {
						System.out.println("I guessed your team so I win and you lose");
						i = 0;
					} else {

						comGuess[y] = true;
					}
				} 
			}
			// checks to see if you won or if the computer won
			if (answer.equalsIgnoreCase("yes")){
				System.out.println(" ");
			}
			else {
				System.out.println("I ran out of guesses so I lost and you won");
			}
		} else {
			System.out.println("Alright I guess we wont play");

		}

	}

}
